/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package email;
import mailException.InterruptedException;

/**
 *
 * @author Sabbir
 */
public class Gmail {
    public void Login(String s) throws InterruptedException
    {
        boolean var1 = s.endsWith("@gmail.com");
        if(var1 == true)
        {
            System.out.println("Gmail ID login successful");
        }
        else
            throw new InterruptedException("Login Unsuccessful");
    }
}
