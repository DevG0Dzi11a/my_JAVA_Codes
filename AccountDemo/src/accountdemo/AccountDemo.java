
package accountdemo;

import java.util.Scanner;

public class AccountDemo {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Account :");
        int x = in.nextInt();
        System.out.print("Balance :");
        double y = in.nextDouble();
        System.out.print("Transaction Type : ");
        String str= in.next();
        System.out.println();
        
        
        Account obj1 = new Account(x, y, str);
        
        
        double changBalance = obj1.changeBalance(obj1.balance);
        
        System.out.println("Account ID is : "+ obj1.accountID);
        System.out.println("Original Balance : "+ obj1.balance);
        System.out.println("Transaction Type : "+ obj1.transactionType );
        System.out.println("Changed Balance : "+ changBalance);
        in.close();
    }
    
}
