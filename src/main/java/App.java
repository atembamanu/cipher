import models.Decoding;
import models.Encoding;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner inputChoice = new Scanner(System.in);
        Scanner inputText = new Scanner(System.in);
        String stringToEncrypt = "";
        int value = 0;
        while (true){
            System.out.println("Hello Dev!.. What do want to do? Select an option. \n 1. Encrypt a String. \n 2. Decrypt an encrypted string. \n 3. Exit");
            int choice = inputChoice.nextInt();

            switch (choice){
                case 1:
                    System.out.println("You've selected Encryption.");
                    System.out.println("------------------------------");
                    System.out.println("Enter the text to encrypt");
                    stringToEncrypt = inputText.nextLine();
                    System.out.println("Good choice \n Last input....Enter the shift value");
                    value = inputChoice.nextInt();
                    Encoding encoding = new Encoding(stringToEncrypt, value);
                    encoding.setTheKey(value);
                    encoding.setSentence(stringToEncrypt);
                    System.out.println("Got it!");
                    System.out.println("-------------------------------------");
                    System.out.println("Shifting by :"+encoding.getTheKey());
                    System.out.println("Encrypted text: \n" +encoding.startEncryption());
                    System.out.println("---------------------------------------------------------");
                    break;
                case 2:
                    System.out.println("You've selected Decryption.");
                    System.out.println("------------------------------");
                    Scanner deChoice = new Scanner(System.in);
                    System.out.println("Lets see.\n 1. Decrypt last encrypted string. \n 2. I got the encrypted string \n 3. Exit");
                    int userChoice = deChoice.nextInt();
                    switch (userChoice){
                        case 1:
                            Encoding encoding2 = new Encoding(stringToEncrypt, value);
                            String encrypted = encoding2.startEncryption();
                            Decoding decoding2 = new Decoding(encrypted, value);
                            System.out.println("Decrypting " +encrypted);
                            System.out.println("Shifting by :"+decoding2.getTheKey());
                            System.out.println("Decrypted text: \n" +decoding2.startDecryption());
                            System.out.println("--------------------------------------------------------------------------");
                            break;
                        case 2:
                            System.out.println("Roger that..Creating a platform for you..");
                            System.out.println("Done");
                            Scanner scanner = new Scanner(System.in);
                            System.out.println("Enter your encrypted string...");
                            String stringToDecrypt = scanner.nextLine();
                            System.out.println("Got it.\n Enter the shift value");
                            int value2 = scanner.nextInt();

                            Decoding decoding = new Decoding(stringToDecrypt, value2);
                            decoding.setTheKey(value2);
                            decoding.setSentence(stringToDecrypt);
                            System.out.println("Text to decrypt: "+decoding.getSentence());
                            System.out.println("Shifting by :"+decoding.getTheKey());
                            System.out.println("Done Decrypting.\n Decrypted string: " +decoding.startDecryption());
                            System.out.println("---------------------------------------------------------------------------");
                            break;
                        case 3:
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Invalid Choice");
                    }

                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");
            }

        }
    }
}
