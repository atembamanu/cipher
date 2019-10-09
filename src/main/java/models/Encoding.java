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

    public  String getUserInputtedString(){
        return this.sentence;
    }

    public  String startEncryption(){
        StringBuilder encrypted= new StringBuilder();
        for(int i=0;i<sentence.length();i++) {
            int c=sentence.charAt(i);
            if(Character.isUpperCase(c)) {
                c = c + (theKey % 26);
                if( c> 'Z') c = c-26;
            }
            else if(Character.isLowerCase(c)) {
                c = c + (theKey % 26);
                if(c > 'z') c = c - 26;
            }
            encrypted.append((char) c);

        }
        return encrypted.toString();
    }


}
