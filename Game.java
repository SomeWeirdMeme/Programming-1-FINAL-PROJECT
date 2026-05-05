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
        //SET title
        //SET gameSize
        //SET genre
        //SET platform
        //SET ageRating
        //CREATE empty ratings list
    }
    
    /**
     * adds a rating to the game.
     */
    public void addRating(int rating)
    {
        //ADD rating to ratings list
    }
    
    /**
     * Calculates and returns the average between all ratings for the game.
     */
    public double getAverageRating()
    {
        //IF ratings list is empty
        //  RETURN 0
        //SET sum = 0
        //FOR each rating in ratings
        //ADD rating to sum
        //RETURN sum
        return 1;
    }
    
    /**
     * Returns the size of the game.
     */
    public double getGameSize()
    {
        //RETURN gameSize
        return 1;
    }
    
    /**
     * Returns the total number of ratings submitted for the game.
     */
    public int getNumberOfRatings()
    {
        //RETURN size of ratings list
        return 1;
    }
    
    /**
     * Returns a string containing the games details.
     * Title, genre, platform, age rating, and size.
     */
    public String getDetails()
    {
        //RETURN string with:
        //title
        //genre
        //platform
        //age rating
        //average rating
        return null;
    }
    
    /**
     * Returns a readable summary of the game for printing.
     * This method is automatically called when object is printed, summary of game info.
     */
    public String toString()
    {
        //RETURN string with
        //title + platform + average rating
        return null;
    }
}
