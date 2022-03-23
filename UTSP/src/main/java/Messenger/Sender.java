package Messenger;
/**
 *
 * @author affani
 */
public class Sender {
    public static void main(String[] args) {
        StdMessenger userStd = new StdMessenger(); 
        MailMessenger userMail = new MailMessenger();

        // tes StdMessenger
        System.out.println("~ Tes StdMessenger ~");
        System.out.println("Mengirim pesan");
        userStd.sendMessege("Yuli", "Sudah makan?", "Yuli sudah makan?");
        System.out.println(""); System.out.println("");
        
        // tes MainMessenger
        System.out.println("~ Tes MailMessenger ~");
        System.out.println("Mengirim pesan");
        userMail.sendMessege("Anto", "Sudah makan?", "Anto sudah makan?");
        
        userMail.disconnect(); // kalau memutuskan
        
        System.out.println("Menghubungkan"); // kalau menghubungkan
        userMail.connect(); // kalau terhubung
        
        // kalau kirim ulang
        System.out.println("Kirim Ulang Pesan");
        userMail.sendMessege("Anto", "Sudah makan?", "Anto sudah makan?");
    }
}