import java.util.Scanner;


public class CeasarCiphar {
//encyrpt method
//Adding a "decrypt" method, and figuring out how to get your original message back
// Decrypting a message that outputs every 25 shifts to quickly find your original message
// Add command line flags like -e or -d to quickly encrypt or decrypt
// Figure out how to guess the key based on letter frequency (e.g. 'E' is common).


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text to encrypt: ");
        String sentence = sc.nextLine();

        System.out.println("Enter Shift key(0-20): ");
        int shiftk = sc.nextInt();

        EncryptMsg encryptMsg = new EncryptMsg(); //1
        String msg = encryptMsg.encryptTheMsg(sentence,shiftk);

        System.out.println("Encrypted Text: "+ msg);

        sc.nextLine(); // this is required because nextInt() reads only the number, but it does not consume the newline (\n) left in the input buffer when you pressed Enter.
        System.out.println("Enter text to decrypt: ");
        String sentence2 = sc.nextLine();

        System.out.println("Enter Shift key(0-20): ");
        int shiftk2 = sc.nextInt();

        String msg2 = encryptMsg.encryptTheMsg(sentence2, 26 - (shiftk2 % 26));  //2

        System.out.println("Decrypted Text: "+ msg2);

        sc.nextLine();


        System.out.println("without Shift");

        System.out.println("Enter you msg to decrypt -");
        String sentance3 =sc.nextLine();

        DecryptMsg decryptMsg = new DecryptMsg();
        decryptMsg.withoutShiftk(sentance3);

        
    }
    
}
