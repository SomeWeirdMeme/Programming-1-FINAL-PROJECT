
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
    private int estimatedHours;
    
    /**
     * Constructs a single player game with its basic details and completion info.
     */
    public SinglePlayer(String title, double gameSize, Genre genre, Platform platform, AgeRating ageRating, boolean hasStoryMode, int estimatedHours)
    {
        super(title, gameSize, genre, platform, ageRating); 
        
        this.hasStoryMode = hasStoryMode;
        this.estimatedHours = estimatedHours;
    }
        
    /**
     * Simulates playing the game
     */
    public void play(){
        //PRINT or simulate playing the game
    }
    
    public String toString(){
        //GET base details from Game
        //ADD story mode info
        //ADD estimated hours
        //RETURN string
        return "SinglePlayer: " + super.toString();
    }
}
