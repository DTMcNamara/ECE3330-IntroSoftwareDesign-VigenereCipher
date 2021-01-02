import java.util.Scanner;

/**
 * This is the main class to test the Vigenere Class.
 * It will go through and get a message and key to attempt
 * to encode and decode the message with the key.
 */
public class Vigenere_Main {
    /**
     * This is the main Method to test the Vigenere Class.
     * It will go through and get a message and key to attempt
     * to encode and decode the message with the key.
     *
     */
    public static void main(String[] args) {
        /**
         * The test Vigenere object is used to call all
         * of the Vigenere methods to test functionality
         */
        Vigenere test = new Vigenere();

        /**
         * The Encoded String is used to load the user's message
         * after encoding it.
         */
        String Encoded;

        /**
         * The Decoded String is used to store the user's message
         * after encoding it and decoding it.
         */
        String Decoded;

        /**
         * The Key String is loaded from a terminal prompt by
         * the user and then used to encode and decode the message.
         */
        String Key;

        /**
         * The Message String is loaded from the terminal by the
         * user and then sent to be encoded.
         */
        String Message;

        /**
         * The FileKey String is used to locate the file with key in it
         */
        String FileKey;

        System.out.println("Enter a Key to use for Encoding with my cool Vigenere Cypher program!");

        /**
         * The input Scanner is used to get text from the
         * user through the terminal interface
         */
        Scanner input = new Scanner(System.in);
        //get key from user
        Key = input.nextLine().replaceAll("\\s","");
        System.out.println("Enter a Message to Encode with my cool Vigenere Cypher program!");
        //get message from user
        Message = input.nextLine().replaceAll("\\s","");
        //attempt to encode
        Encoded = test.encode(Message,Key);
        System.out.println(Encoded+" was your encoded Message");
        //attempt to write to a file
        test.WriteToFile(Key);
        //attempt to load from a file
        FileKey = test.RetrieveFromFile("thisisNOTaKEY.txt");
        System.out.println(FileKey+" was the Key retrieved from the File");
        //attempt to decode the message
        Decoded = test.decode(Encoded,Key);
        //print decoded and message to check to make sure the program worked
        System.out.println(Decoded+" was your decoded Message");
        System.out.println(Message+" was your original Message");
    }
}