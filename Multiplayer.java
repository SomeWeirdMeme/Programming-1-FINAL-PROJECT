
/**
 * Represents a multiplayer game.
 * Multiple players, and local multiplayer.
 *
 * @author (Anthony O'Sullivan)
 * @version (0.0)
 */
public class Multiplayer extends Game
{
    //Maximum number of players allowed in the game.
    private int maxPlayers;
    // Sees wether a game has local multiplayer (Same device).
    private boolean localMultiplayer;
    
    /**
     * Constructor for objects of class Multiplayer
     */
    public Multiplayer(String title, double gameSize, Genre genre, Platform platform, AgeRating ageRating, int maxPlayers, boolean localMultiplayer)
    {
     super(title, gameSize, genre, platform, ageRating);   
    }
    
    public void play(){
        
    }
    
    public String getDetails(){
        return "x";
    }
    
}
