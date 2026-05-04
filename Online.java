
/**
 * Represents an online game extending off game.
 * Online models games that need internet where the subscription is actually usefull.
 * Ex: Internet bill, xbox live, etc.
 *
 * @author (Anthony O'Sullivan)
 * @version (0.0)
 */
public class Online extends Game
{
    //Name of the server.
    private String serverName;
    //Kinda not usefull but indicates wether you need a subscription to play online.
    private boolean requiresSubscription;
    
    /**
     * Constructor for objects of class Online
     */
    public Online(String title, Genre genre, Platform platform, AgeRating ageRating, String serverName, boolean requiresSubscription)
    {
        super(title, genre, platform, ageRating);
    }
    
    public void play(){
        
    }
    
    public void connect(){
        
    }
    
    public String getDetails(){
        return null;
    }
}
