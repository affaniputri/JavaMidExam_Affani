package Messenger;

/**
 *
 * @author affani
 */
public class StdMessenger implements Messenger_{
    boolean isSuccess = false;

    @Override
    public boolean sendMessege(String reciever, String subject, String messege) {
        System.out.println("Terkirim");
        return isSuccess = true;
    }
}
