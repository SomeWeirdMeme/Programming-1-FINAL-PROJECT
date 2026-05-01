
/**
 * Write a description of class Multiplayer here.
 *
 * @author (Anthony O'Sullivan)
 * @version (0.0)
 */
public class Multiplayer extends Game
{
    // instance variables - replace the example below with your own
    private int maxPlayers;
    private boolean localMultiplayer;
    
    /**
     * Constructor for objects of class Multiplayer
     */
    public Multiplayer(String title, Genre genre, Platform platform, AgeRating ageRating, int maxPlayers, boolean localMultiplayer)
    {
     super(title, genre, platform, ageRating);   
    }
    
    public void play(){
        
    }
    
    public String getDetails(){
        return "x";
    }
    
}
