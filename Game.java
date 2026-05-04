import java.util.ArrayList;

/**
 * Game is a class where video games are created and put in a system.
 * Stores data such as the title, genre, platform, age rating, and the user ratings.
 * Is base class for (SinglePlayer, MultiPlayer, Online).
 *
 * @author (David Grondin, Anthony O'Sullivan)
 * @version (0.0)
 */
public class Game
{
    //Name of the game / Title of the game.
    private String title;
    //The genre of the game (Action, RPG, ADVENTURE)
    private Genre genre;
    //The platform that the game is on (PC, PLAYSTATION, XBOX) 
    private Platform platform;
    //The age rating of the game (E, T, M)
    private AgeRating ageRating;
    //The amount of space it is taking up for the game (in megabytes)
    private double gameSize;
    //A collection of ratings for the game.
    private ArrayList<Integer> ratings;
    /**
     * Constructor for objects of class Game
     */
    public Game(String title, double gameSize, Genre genre, Platform platform, AgeRating ageRating)
    {
        
    }
    
    public void addRating(int rating){
        
    }
    
    public double getAverageRating(){
        return 1;
    }
    
    public double getGameSize(){
        return 1;
    }
    
    public int getNumberOfRatings(){
        return 1;
    }
    
    public String getDetails(){
        return null;
    }
    
    public String toString(){
        return null;
    }
}
