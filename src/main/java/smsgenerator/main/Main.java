package smsgenerator.main;

import yusufs.nlp.nerid.IndonesiaNER;
import yusufs.nlp.nerid.utils.TextSequence.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        IndonesiaNER iner = new IndonesiaNER(IndonesiaNER.MODEL.YUSUFS);
        String sentence_to_predict = "untuk setiap transaksi , ditarik biaya sebesar 0,20 us$ dan juga 3 % dari total transaksi";
        ArrayList<Sentence> predicted = iner.predictWithEmbeddedModel(sentence_to_predict, true);

        for(Sentence arrWords : predicted) {
            for(Words word : arrWords.getWords()) {
                String kata     = word.getToken();  // kata yang diprediksi
                String labelNer = word.getXmlTag(); // hasil prediksi label entitas untuk kata tersebut
                String labelPos = word.getPosTag(); // postag dari kata tersebut
                System.out.println(kata+" "+labelNer+" "+labelPos);
            }
        }
    }
};
