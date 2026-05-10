
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
    public Multiplayer(Game game, int maxPlayers, boolean localMultiplayer)
    {
       super(game.getTitle(),game.getGameSize(),game.getGenre(),game.getPlatform(),game.getAgeRating());
       //SET maxPlayers
       this.maxPlayers = maxPlayers;
       //SET localMultiplayer
       this.localMultiplayer = localMultiplayer;
    }
    
    public boolean isLocalMultiplayer(){
        return localMultiplayer;
    }
    
    public int getMaxPlayers(){
        return maxPlayers;
    }
    
    public void play(){
        //PRINT or simulate multi
        System.out.println("Playing multiplayer with up to " + maxPlayers + " players.");
    }
    
    @Override
    public String toString(){
        return super.toString() + " | Max PLayers: " + maxPlayers + " | Local Multiplayer: " + localMultiplayer;
        
    }
    
}
