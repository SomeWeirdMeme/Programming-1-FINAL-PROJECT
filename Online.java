
/**
 * Write a description of class Online here.
 *
 * @author (Anthony O'Sullivan)
 * @version (0.0)
 */
public class Online extends Game
{
    private String serverName;
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
