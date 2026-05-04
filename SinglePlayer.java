
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
     * Constructor for objects of class SinglePlayer
     */
    public SinglePlayer(String title, Genre genre, Platform platform, AgeRating ageRating, boolean hasStoryMode, int estimatedHours)
    {
        super(title, genre, platform, ageRating);   
    }
        
    public void play(){
        
    }
    
    public String getDetails(){
        return "x";
    }
}
