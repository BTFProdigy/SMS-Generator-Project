package smsgenerator.module;

public class VerbNounFrequency implements Comparable<VerbNounFrequency>{
    private String verb;
    private String noun;
    private int freq;

    public VerbNounFrequency(String verb, String noun){
      this.verb = verb;
      this.noun = noun;
      this.freq = 1;
    };

    public void add_frequency(){
        this.freq += 1;
    }

    public String getVerb() {
        return verb;
    }

    public void setVerb(String verb) {
        this.verb = verb;
    }

    public String getNoun() {
        return noun;
    }

    public void setNoun(String noun) {
        this.noun = noun;
    }

    public int getFreq() {
        return freq;
    }

    public void setFreq(int freq) {
        this.freq = freq;
    }

    public int compareTo(VerbNounFrequency o) {
        if (this.freq > o.getFreq()){
            return 1;
        }
        else {
            return 0;
        }
    }

    public void print(){
        System.out.printf("Verb : %s, Noun : %s, Frequency : %d\n", this.verb, this.noun, this.freq);
    }
}
