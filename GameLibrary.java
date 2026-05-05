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
        //SET name
        //CREATE empty games list
        //CREATE empty session list
    }
    
    /**
     * Finds a returns the game by the title.
     */
    public Game findGameByTitle(String title)
    {
        //FOR each game in games
        //IF title matches
        //return game
        return null;
    }
    
    /**
     * Returns an ArrayList of all the games in the library.
     */
    public ArrayList<Game> listAllGames()
    {
        //return games list
        return null;
    }
    
    /**
     * Prints details about the entire game library.
     */
    public void printLibraryDetails()
    {
        //PRINT library name
        //for each game
        //toString game
    }
    
    /**
     * Returns list of games filtered by the genre.
     */
    public ArrayList<Game> listByGenre(Genre genre)
    {
        //CREATE empty result list
        //FOR each game
        //IF matches condition
        //ADD to result
        return null;
    }
    
    /**
     * Returns a list filtered by platform.
     */
    public ArrayList<Game> listByPlatform(Platform platform)
    {
        //FOR each game in games list
        //IF game platform equals given platform
        //ADD game to list
        return null;
    }
    
    /**
     * Returns a list of games filtered by the age rating.
     */
    public ArrayList<Game> listByAgeRating(AgeRating  ageRating)
    {
        //FOR each game in games list
        //IF game size matches condition
        //ADD game to list
        return null;
    }
    
    /**
     * returns a list of games organized by size.   
     */
    public ArrayList<Game> listBySize(Double gameSize)
    {
        //FOR each game in games list
        //IF game size matches condition
        //ADD game to list
        return null;
    }
    
    /**
     * Returns a list of the top rated games.
     */
    public ArrayList<Game> getTopRatedGames()
    {
        //FOR each game in games list
        //IF game.getAverage() >= x
        //ADD game to list
        return null;
    }
    
    /**
     * Adds a new game to the library.
     */
    public void addGame(Game game)
    {
        //ADD game to games list
    }
    
    /**
     * removes a game from the library.
     */
    public void removeGame(Game game)
    {
        //REMOVE game from games list   
    }
    
    /**
     * Returns all sessions that are recorded.
     */
    public ArrayList<GameSession> getAllSessions()
    {
        //RETURNS session list
        return null;
    }
    
    /**
     * Returns all sessions associated with a specific game.
     */
    public ArrayList<GameSession> getSessionsForGame(Game game)
    {
        //FOR each session in sessions list
        //IF sessions.getGame() equals given game
        //ADD session to collection
        return null;
    }
    
    /**
     * Adds a new Session to the library.
     */
    public void addSession(GameSession session)
    {
        //ADD session to session list
    }
    
    /**
     * Prints a log of all game sessions
     */
    public void printSessionLog(){
        //FOR each session in sessions list
        //SHOW session
    }
}
