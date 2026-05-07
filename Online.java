
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
    public Online(String title, double gameSize, Genre genre, Platform platform, AgeRating ageRating, String serverName, boolean requiresSubscription)
    {
        super(title, gameSize, genre, platform, ageRating);
        
        //SET serverName
        //SET requiresSubscription 
    }
    
    public void play()
    {
        //SHOWING Starting online game
    }
    
    public void connect()
    {
        //IF requiresSubscription is true
        //SHOW "Checking subscription..."
        //SHOW "Connection to server" + serverName
        //Else
        //SHOW "Connection to server" + serverName
        //END
    }
    
    public String toString(){
        //GET base details from Game
        //ADD servername
        //ADD requiresSubs info
        //RETURN string
        return "Online : " + super.toString();
    }
    
    public String getDetails(){
        //GET base game details (.getDetails)
        //ADD servename
        //ADD requiresSubscription info
        return null;
    }
}
