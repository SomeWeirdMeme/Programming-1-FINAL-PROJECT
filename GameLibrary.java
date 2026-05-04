import java.util.ArrayList;

/**
 * Representing a library for games and game sessions.
 * The gameLibrary stores, organizes, and retrieves Game and GameSession objects.
 * 
 * It can search, fliter, add, and remove games and track sessions.
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
     * Initializes the library and name with it that will store
     * the info for games and sessions.
     */
    public GameLibrary(String name)
    {
        
    }
    
    /**
     * Finds a returns the game by the title.
     */
    public Game findGameByTitle(String title){
        return null;
    }
    
    /**
     * Returns an ArrayList of all the games in the library.
     */
    public ArrayList<Game> listAllGames(){
        return null;
    }
    
    /**
     * Prints details about the entire game library.
     */
    public void printLibraryDetails(){
        
    }
    
    /**
     * Returns list of games filtered by the genre.
     */
    public ArrayList<Game> listByGenre(Genre genre){
        return null;
    }
    
    /**
     * Returns a list filtered by platform.
     */
    public ArrayList<Game> listByPlatform(Platform platform){
        return null;
    }
    
    /**
     * Returns a list of games filtered by the age rating.
     */
    public ArrayList<Game> listByAgeRating(AgeRating  ageRating){
        return null;
    }
    
    /**
     * returns a list of games organized by size.   
     */
    public ArrayList<Game> listBySize(Double gameSize){
        return null;
    }
    
    /**
     * Returns a list of the top rated games.
     */
    public ArrayList<Game> getTopRatedGames(){
        return null;
    }
    
    /**
     * Adds a new game to the library.
     */
    public void addGame(Game game){
        
    }
    
    /**
     * removes a game from the library.
     */
    public void removeGame(Game game){
        
    }
    
    /**
     * Returns all sessions that are recorded.
     */
    public ArrayList<GameSession> getAllSessions(){
        return null;
    }
    
    /**
     * Returns all sessions associated with a specific game.
     */
    public ArrayList<GameSession> getSessionsForGame(Game game){
        return null;
    }
    
    /**
     * Adds a new Session to the library.
     */
    public void addSession(GameSession session){
        
    }
    
    /**
     * Prints a log of all game sessions
     */
    public void printSessionLog(){
        
    }
}
