
/**
 * Represents a singlePlayer game.
 * Story mode and amount of hours to finish the game.
 *
 * @author (Anthony O'Sullivan)
 * @version (0.0)
 */
public class SinglePlayer extends Game
{
    //Wether a game has or doesn't contain a storyMode.
    private boolean hasStoryMode;
    //Estimated number of hours to complete the game.
    private int estimatedMinutes;

    /**
     * Constructs a single player game with its basic details and completion info.
     */
    public SinglePlayer(Game game, boolean hasStoryMode, int estimatedMinutes)
    {
        super(game.getTitle(),game.getGameSize(),game.getGenre(),game.getPlatform(),game.getAgeRating()); 

        this.hasStoryMode = hasStoryMode;
        this.estimatedMinutes = estimatedMinutes;
    }

    /**
     * Simulates playing the game
     */
    public void play(){
        System.out.println("============== STARTING GAME ==============");
        System.out.println("Launching single player game...");

        loadGame();

        System.out.println("Loading story mode: " + (hasStoryMode ? "Enabled" : "Disabled"));
        System.out.println("Estimated play time: " + estimatedMinutes + " minutes");

        System.out.println("==================== GAME STATUS =====================");
        System.out.println("Game is now running.");
    }

    public int getEstimatedMinutes(){
        return estimatedMinutes;
    }
    
     private void loadGame()
    {
        System.out.println("=============== LOADING.... ===============");
        System.out.println("Preparing game assets...");
        System.out.println("Loading world...");
        System.out.println("Loading save system...");
        System.out.println("Optimizing performance...");
        System.out.println("============= LOAD COMPLETE =============");
    }
    
    @Override
    public int getMaxSessionMinutes()
    {
        return getEstimatedMinutes() * 60;
    }

    public boolean getHasStoryMode(){
        return hasStoryMode;
    }

    @Override
    public String toString() {
        return
        super.toString() +
        "\nStory Mode: " + getHasStoryMode() +
        "\nEstimated Minutes: " + getEstimatedMinutes();
    }
}
