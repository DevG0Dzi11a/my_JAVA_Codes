package demoteam;


public class Liverpool implements WeakTeam{
    private String name;
    private int maxTrophy;
    private int maxTour;
    private int maxPlayers;
    private int repPlayer;

    
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public int getMaxPlayers()
    {
        return maxPlayers;
    }
    public void setMaxPlayers(int maxPlayers)
    {
        this.maxPlayers=maxPlayers;
    }
    public int getMaxTrophy()
    {
        return maxTrophy;
    }
    public void setMaxTrophy(int maxTrophy)
    {
        this.maxTrophy=maxTrophy;
    }
    public int getReplacementPlayer()
    {
        return repPlayer;
    }
    public void setReplacementPlayer(int repPlayer)
    {
        this.repPlayer= repPlayer;
    }
    String weakVoice()
    {
        return "weakVoice";
    }
}
