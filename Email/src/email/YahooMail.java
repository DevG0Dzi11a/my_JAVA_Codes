/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package email;
import mailException.UnsupportedOperationException;
/**
 *
 * @author Sabbir
 */
public class YahooMail{

    public void Login (String s)throws UnsupportedOperationException {
        boolean var1 = s.endsWith("@ymail.com");
        boolean var2 = s.endsWith("@yahoo.com");
        if(var1 == true || var2 == true)
        {
            System.out.println("Yahoo ID login successful");
        }
        else
            throw new UnsupportedOperationException("Login Unsuccessful");
    }
}
