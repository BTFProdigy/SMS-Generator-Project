package smsgenerator.main;

import yusufs.nlp.nerid.IndonesiaNER;
import yusufs.nlp.nerid.utils.TextSequence.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import smsgenerator.module.VerbNounFrequency;

public class Main {

    public static ArrayList<String> ReadFile(String path){
        String fileName = path;
        ArrayList<String> output = new ArrayList<String>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line;
            while ((line = br.readLine()) != null) {
                output.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return output;
    }

    public static void main(String[] args) {
        String path = "./input/input.txt";
        IndonesiaNER iner = new IndonesiaNER(IndonesiaNER.MODEL.YUSUFS);
        ArrayList<String> lines = ReadFile(path);

        ArrayList<VerbNounFrequency> list_of_verb_noun = new ArrayList<VerbNounFrequency>();
        for (String line: lines) {
            String sentence_to_predict = line;
            ArrayList<Sentence> predicted = iner.predictWithEmbeddedModel(sentence_to_predict, true);

            String previous_label_pos = "";
            String previous_word = "";
            for (Sentence arrWords : predicted) {
                for (Words word : arrWords.getWords()) {
                    String current_word = word.getToken();  // kata yang diprediksi
                    String current_Ner_label = word.getXmlTag(); // hasil prediksi label entitas untuk kata tersebut
                    String current_label_pos = word.getPosTag(); // postag dari kata tersebut

                    if (previous_label_pos.contains("VB") && current_label_pos.contains("NN")) {
                        boolean add_freq = false;
                        //                    Check wheter the verb already inserted
                        for (VerbNounFrequency el : list_of_verb_noun) {
                            if ((el.getVerb() == previous_word) && (el.getNoun() == current_word)) {
                                el.add_frequency();
                                add_freq = true;
                                break;
                            }
                        }
                        if (!add_freq) {
                            list_of_verb_noun.add(new VerbNounFrequency(previous_word, current_word));
                        }
                    }
                    //                Add Subject Noun if found
                    //                if (current_label_pos.contains("NNAC")){
                    //                    VerbNounFrequency el = new VerbNounFrequency();
                    //                    el.setNoun(current_word);
                    //                }
                    //                Add to previous POS TAG and Words
                    previous_label_pos = current_label_pos;
                    previous_word = current_word;
                    System.out.println(current_word + " " + current_Ner_label + " " + current_label_pos);
                }
            }
        }
        Collections.sort(list_of_verb_noun);
        System.out.printf("--RESULT----\n");
        for (VerbNounFrequency v : list_of_verb_noun){
            v.print();
        }
    }
};
