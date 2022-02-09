package testemployee;
import java.util.Scanner;

public class TestEmployee {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int projects = input.nextInt();
        int months = input.nextInt();
        
        Developer obj1 = new Developer(projects, months);
        HROfficer obj2 = new HROfficer(obj1);
        //obj1.setTM(months);
        //obj1.setTP(projects);
        obj2.checkPerformance();
    }
    
}
