package Messenger;

/**
 *
 * @author affani
 */
public class MailMessenger implements Messenger_{
    boolean isSuccess = false ;
    boolean isConnectedToServer = false;
    
    public void connect(){
        System.out.println("Terhubung");
        isConnectedToServer = true;
    }
    
    public void disconnect(){
        System.out.println("Terputus");
        isConnectedToServer = false;
    }
    
    
    @Override
    public boolean sendMessege(String reciever, String subject, String messege) {
        if(isConnectedToServer == true){
            System.out.println("Terkirim");
            return isSuccess = true;
        }
        else{
            System.out.println("Tidak Terkirim. Tidak dapat terhubung ke server");
            return isSuccess = false;
        }
        
    }
}
