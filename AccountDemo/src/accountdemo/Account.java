
package accountdemo;

public class Account {
        public int accountID;
        public double balance, newBalance;
        public String transactionType;
        
        
        //Parameterized Constructor
        Account(int a, double b, String t){
            accountID = a;
            balance = b;
            transactionType = t;
        }
        
        //Non-parameterized Constructor
        Account(){
            accountID = 0;
            balance = -1.0;
            transactionType = null;
        }
        
        public double changeBalance(double d){
            
            if("debit".equals(transactionType))
            {
                return balance -50;
            }
            else
            {
                return balance +50;
            }
        }
    
}

