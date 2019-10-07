package models;

public class Decoding {
    String sentence;
    int theKey;

    public Decoding(String sentence, int theKey) {
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

    public  String startDecryption(){

        StringBuilder decrypted= new StringBuilder();
        for(int i=0;i<sentence.length();i++)
        {
            int c=sentence.charAt(i);
            if(Character.isUpperCase(c))
            {
                c=c-(theKey%26);
                if(c<'A')
                    c=c+26;
            }
            else if(Character.isLowerCase(c))
            {
                c=c-(theKey%26);
                if(c<'a')
                    c=c+26;
            }
            decrypted.append((char) c);
        }
        return decrypted.toString();
    }
}
