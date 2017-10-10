package smsgenerator.module;

import java.util.ArrayList;

public class VerbNounFrequency implements Comparable<VerbNounFrequency>{
    private String verb;
    private ArrayList<String> nouns;
    private ArrayList<Integer> freqs;

    public VerbNounFrequency(){
        this.verb = "";
        this.nouns = new ArrayList<String>();
        this.freqs = new ArrayList<Integer>();
    }

    public VerbNounFrequency(String verb, String noun){
      this.verb = verb;
      this.nouns = new ArrayList<String>();
      this.freqs = new ArrayList<Integer>();
      this.nouns.add(noun);
      this.freqs.add(1);
    }

    public void add_noun(String noun){
        Integer idx = this.getNouns().indexOf(noun);
        if (idx != -1){
            this.freqs.set(idx, this.freqs.get(idx) + 1);
        }
        else{
            this.nouns.add(noun);
            this.freqs.add(1);
        }
    }

    public void add_frequency(int i){
        int curr_val = this.freqs.get(i);
        this.freqs.set(i,  curr_val += 1);
    }

    public String getVerb() {
        return verb;
    }

    public void setVerbs(String verb) {
        this.verb = verb;
    }

    public ArrayList<String> getNouns() {
        return nouns;
    }

    public void setNouns(ArrayList<String> noun) {
        this.nouns = noun;
    }

    public ArrayList<Integer> getFreqs() {
        return freqs;
    }

    public void setFreqs(ArrayList<Integer> freq) {
        this.freqs = freq;
    }

    public int compareTo(VerbNounFrequency o) {
        //Calculate total freq and do comparison
        int curr_freq = 0;
        int comp_freq = 0;
        for (int freq : this.freqs){
            curr_freq += freq;
        }
        for (int freq : o.getFreqs()){
            comp_freq += freq;
        }
        if (curr_freq > comp_freq){
            return 1;
        }
        else {
            return 0;
        }
    }

    public void print(){
        System.out.printf("Verb : %s\n", this.verb);
        System.out.printf("Noun : \n");
        for (int i = 0; i < this.getNouns().size(); i++){
            System.out.printf("\t %s, Freq : %d\n", this.getNouns().get(i), this.getFreqs().get(i));
        }
    }
}
