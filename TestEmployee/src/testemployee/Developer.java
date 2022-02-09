package testemployee;

public class Developer {
    private int totalProjects;
    private int totalMonths;
    
    
    public Developer(int totalProjects, int totalMonths){
        this.totalMonths = totalMonths;
        this.totalProjects = totalProjects;
    }
    public int getTM(){
        return this.totalMonths;
    }
    public int getTP(){
        return this.totalProjects;
    }
    
    public void setTM(int totalMonths){
        this.totalMonths = totalMonths;
        
    }
    public void setTP(int totalProjects){
        this.totalProjects = totalProjects;
        
    }
}
