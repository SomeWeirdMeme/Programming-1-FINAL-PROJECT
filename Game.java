import java.util.ArrayList;

/**
 * Write a description of class Game here.
 *
 * @author (David Grondin, Anthony O'Sullivan)
 * @version (0.0)
 */
public class Game
{
    // instance variables - replace the example below with your own
    private String date;
    private Genre genre;
    private Platform platform;
    private AgeRating ageRating;
    private ArrayList<Integer> ratings;
    /**
     * Constructor for objects of class Game
     */
    public Game(String title, Genre genre, Platform platform, AgeRating ageRating)
    {
        
    }
    
    public void addRating(int rating){
        
    }
    
    public double getAverage(){
        return 8.0;
    }
    
    public int getNumberOfRatings(){
        return 4;
    }
    
    public String getDetails(){
        return "x";
    }
    
    public String toString(){
        return "farwars";
    }
}
