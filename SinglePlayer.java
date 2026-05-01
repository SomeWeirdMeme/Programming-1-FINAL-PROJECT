
/**
 * Write a description of class SinglePlayer here.
 *
 * @author (Anthony O'Sullivan)
 * @version (0.0)
 */
public class SinglePlayer extends Game
{
    private boolean hasStoryMode;
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
