package smsgenerator.module;

import java.util.ArrayList;

public class VerbNounFrequency{
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

    public Integer getFreqTotal(){
        int result = 0;
        for (int freq : this.freqs){
            result += freq;
        }
        return result;
    }

    public void print(){
        System.out.printf("Verb : %s\n", this.verb);
        System.out.printf("Noun : \n");
        for (int i = 0; i < this.getNouns().size(); i++){
            System.out.printf("\t %s, Freq : %d\n", this.getNouns().get(i), this.getFreqs().get(i));
        }
        System.out.printf("Freq Total : %d\n", this.getFreqTotal());
    }

    public String toString(){
        StringBuilder result = new StringBuilder();
        result.append("Verb :"+this.verb+"\n");
        result.append("Noun :"+"\n");
        for (int i = 0; i < this.getNouns().size(); i++){
            result.append("\t"+this.getNouns().get(i)+", Freq : "+this.getFreqs().get(i).toString()+"\n");
        }
        result.append("Freq total : "+this.getFreqTotal().toString());
        return result.toString();
    }
}
