package email;

import mailException.InterruptedException;
import mailException.UnsupportedOperationException;


/**
 *
 * @author Sabbir
 */
public class Email {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException, UnsupportedOperationException {
        
        Gmail gObj = new Gmail();
        YahooMail yObj = new YahooMail();
        
        gObj.Login("xyz@gmail.com");
        yObj.Login("abc@yahoo.com");
    }
    
}
