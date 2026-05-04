import java.util.ArrayList;

/**
 * 
 * @author (David Grondin, Anthony O'Sullivan)
 * @version (0.0)
 */
public class GameLibrary
{
    //Name of the game library (Kinda not important)
    private String name;
    //Collection of all the games stored in the library.
    private ArrayList<Game> games;
    //List of all game session in the library
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
