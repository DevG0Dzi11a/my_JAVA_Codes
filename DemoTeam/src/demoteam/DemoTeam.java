package demoteam;

public class DemoTeam {

    public static void main(String[] args) {
        ManchesterUnited manObj = new ManchesterUnited ();
        manObj.setName("Manchester United");
        System.out.println("Team is :"+ manObj.getName());
        manObj.setMaxTrophy(46);
        System.out.println("Max Trophy:"+manObj.getMaxTrophy());
        manObj.setNumTournaments(4);
        System.out.println("Total Tournaments:"+manObj.getNumTournaments());
        manObj.setMaxPlayers(33);
        System.out.println("Total Players:"+ manObj.getMaxPlayers());
        System.out.println("Has "+manObj.fanVoice());
        System.out.println("");
        
        Liverpool livObj = new Liverpool();
        livObj.setName("Liverpool");
        System.out.println("Team is :"+ livObj.getName());
        livObj.setMaxTrophy(44);
        System.out.println("Max trophy:"+livObj.getMaxTrophy());
        livObj.setReplacementPlayer(12);
        System.out.println("Total Replacement Player:"+livObj.getReplacementPlayer());
        livObj.setMaxPlayers(31);
        System.out.println("Total Players:"+ livObj.getMaxPlayers());
        System.out.println("Has "+livObj.weakVoice());
        System.out.println("");
        
       
        
        Fifa fifaObj = new Fifa();
        fifaObj.Type();
        fifaObj.worldSound();
        fifaObj.setName("Fifa");
        System.out.println("Team is :"+ fifaObj.getName());
        fifaObj.setMaxTrophy(120);
        System.out.println("Max Trophy:"+fifaObj.getMaxTrophy());
        fifaObj.setNumTournaments(12);
        System.out.println("Total Tournaments:"+fifaObj.getNumTournaments());
        fifaObj.setMaxPlayers(100);
        System.out.println("Total Players:"+ fifaObj.getMaxPlayers());
        
        
    }
    
}
