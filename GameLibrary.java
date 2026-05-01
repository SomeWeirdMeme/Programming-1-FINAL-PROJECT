import java.util.ArrayList;

/**
 * Write a description of class GameLibrary here.
 *
 * @author (David Grondin, Anthony O'Sullivan)
 * @version (0.0)
 */
public class GameLibrary
{
    // instance variables - replace the example below with your own
    private String name;
    private ArrayList<Game> games;
    private ArrayList<GameSession> sessions;
    
    /**
     * Constructor for objects of class GameLibrary
     */
    public GameLibrary(String name)
    {
        
    }

    public Game findGameByTitle(String title){
        return null;
    }
    
    public ArrayList<Game> listAllGames(){
        return null;
    }
    
    public void printLibraryDetails(){
        
    }
    
    public ArrayList<Game> listByGenre(Genre genre){
        return null;
    }
    
    public ArrayList<Game> listByPlatform(Platform platform){
        return null;
    }
    
    public ArrayList<Game> listByAgeRating(AgeRating  ageRating){
        return null;
    }
    
    public ArrayList<Game> getTopRatedGames(String title){
        return null;
    }
    
    public void addGame(Game game){
        
    }
    
    public void removeGame(Game game){
        
    }
        
    public ArrayList<GameSession> getAllSessions(){
        return null;
    }
    
    public ArrayList<GameSession> getSessionsForGame(Game game){
        return null;
    }
    
    public void addSession(GameSession session){
        
    }
    
    public void printSessionLog(){
        
    }
}
