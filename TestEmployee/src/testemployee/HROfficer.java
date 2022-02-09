package testemployee;

public class HROfficer {
    public Developer devObj;
    public int performance, sum;
    
    public HROfficer(Developer devObj){
        this.devObj = devObj;
    }
    
    public void checkPerformance(){
        this.performance = devObj.getTM()*devObj.getTP()+100;
        System.out.println("Performance result is: "+performance);
        
        
        for(int i = 1;performance != 0;i++)
        {
            int a = performance%10;
            sum += Math.pow(a, 3);
            performance = performance/10; 
        }
        
        if(sum%2==0)
        {
            System.out.println("Developer's performance is bad");
        }
        else
        {
            System.out.println("Developer's performance is good");
        }
    }
}
