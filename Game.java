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
        this.title = title;
        //SET gameSize
        this.gameSize = gameSize;
        //SET genre
        this.genre = genre;
        //SET platform
        this.platform = platform;
        //SET ageRating
        this.ageRating = ageRating;
        //CREATE empty ratings list
        this.ratings = new ArrayList<>();
    }
    
    public void getGenre(){
        System.out.println(genre);
    }
    
    public void getPlatform(){
        System.out.println(platform);
    }
    
    public void getAgeRating(){
        System.out.println(ageRating);
    }
    
    /**
     * adds a rating to the game.
     */
    public void addRating(int rating)
    {
        //ADD rating to ratings list
        ratings.add(rating);
    }
    
    public String getGameSize(){
        return (gameSize + "MB");
    }
    
    /**
     * Calculates and returns the average between all ratings for the game.
     */
    public double getAverageRating()
    {
        //IF ratings list is empty
        if(ratings.isEmpty()){
            //  RETURN 0
            return 0.0;
        }
        //SET sum = 0
        double sum = 0.0;
        //FOR each rating in ratings
        for(double x : ratings){
            sum += x / ratings.size();
        }
        //RETURN sum
        return sum;
    }
    
    /**
     * Returns a list of all the ratings the game has.
     */
    public void getRatings(){
        //print message
        System.out.println("Ratings for this game are: " + ratings);
    }
    
    
    /**
     * Returns the total number of ratings submitted for the game.
     */
    public int getNumberOfRatings()
    {
        return ratings.size();
    }
    
    /**
     * Prints info about the object (game)
     * Summary of game info.
     */
    @Override
    public String toString()
    {
        //print string with
        //title + platform + average rating + genre + age rating + game size
        return "Game title : " + title + "\n" + "Platform of game : " + platform + "\n" + "Average rating : " + getAverageRating() + "\n" + "Genre : " + genre + "\n" + "Age rating : " + ageRating + "\n" + "Game size : " + getGameSize();      
    }
}
