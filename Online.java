
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
    public Online(Game game, String serverName, boolean requiresSubscription)
    {
        super(game.getTitle(),game.getGameSize(),game.getGenre(),game.getPlatform(),game.getAgeRating());

        //SET serverName
        this.serverName = serverName;
        //SET requiresSubscription 
        this.requiresSubscription = requiresSubscription;
    }

    public void play()
    {
        System.out.println("============== STARTING GAME ==============");
        System.out.println("Launching online game...");

        connect();

        System.out.println("Loading game data...");
        System.out.println("Entering server: " + serverName);

        if (requiresSubscription)
        {
            System.out.println("Subscription verified.");
        }
        System.out.println("==================== GAME STATUS =====================");
        System.out.println("Game is now running.");
    }

    private void connect()
    {
        System.out.println("===============  CONNECTING.... ===============");
        System.out.println("Checking subscription");
        //IF requiresSubscription is true
        if (requiresSubscription){
            //Print "Checking subscription..."
            System.out.println("Connection Requires Subscription");
        } else {
            System.out.println("Status: No subscription needed");
            System.out.println("No subscription required.");
        }
        System.out.println("Connecting to Server: " + serverName);
        System.out.println("============= CONNECTION STATUS =============");
        System.out.println("Connection successful.....");
    }

    public String getServerName(){
        return ("Server Name: " + serverName);
    }

    public boolean requiresSubscription(){
        return requiresSubscription;
    }

}
