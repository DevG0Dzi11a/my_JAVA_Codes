package demoteam;

abstract class Combined {
    abstract void worldSound();
    void Type() {
        System.out.println("This is an Combined Vehicle");
    }
}

class Fifa extends  Combined implements StrongTeam{

    private String name;
    private int maxTrophy;
    private int maxTour;
    private int maxPlayers;
    private int numTour;
    @Override
    public String getName()
    {
        return name;
    }
    @Override
    public void setName(String name)
    {
        this.name= name;
    }
    @Override
    public int getMaxPlayers()
    {
        return maxPlayers;
    }
    @Override
    public void setMaxPlayers(int maxPlayers)
    {
        this.maxPlayers=maxPlayers;
    }
    @Override
    public int getMaxTrophy()
    {
        return maxTrophy;
    }
    @Override
    public void setMaxTrophy(int maxTrophy)
    {
        this.maxTrophy=maxTrophy;
    }
    @Override
    public int getNumTournaments()
    {
        return numTour;
    }
    @Override
    public void setNumTournaments(int numTour)
    {
        this.numTour=numTour;
    }
    @Override
    void worldSound()
    {
        System.out.println("Importancy");
    }
}
