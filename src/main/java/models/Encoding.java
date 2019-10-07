package models;

public class Encoding {
    String sentence;
    int theKey;
    public Encoding(String sentence, int theKey) {
        this.sentence = sentence;
        this.theKey = theKey;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public int getTheKey() {
        return theKey;
    }

    public void setTheKey(int theKey) {
        this.theKey = theKey;
    }

    public  boolean isString(){
        return this.sentence.length() > 1;
    }


}
