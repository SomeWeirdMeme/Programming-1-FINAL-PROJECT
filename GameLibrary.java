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
        this.name = name;
        //set name to name
        sessions = new ArrayList<>();
        //CREATE empty session list
        games = new ArrayList<>();
        //CREATE empty sesion list
    }

    /**
     * Finds a returns the game by the title.
     */
    public Game findGameByTitle(String title)
    {
        for (Game g : games) {
            if (g.getTitle().equals(title)) {
                return g;
            }
        }
        return null;
    }

    /**
     * Returns an ArrayList of all the games in the library.
     */
    public ArrayList<Game> listAllGames()
    {
        return new ArrayList<>(games);
    }

    /**
     * Prints details about the entire game library.
     */
    public void printLibraryDetails()
    {
        System.out.println("Library Title: " + name);
        int i = 1;
        for(Game g : games) {
            System.out.println(i + ". " + g.getTitle());
            i++;
        }
    }

    /**
     * prints list of games filtered by the genre.
     */
    public void printGamesByGenre(Genre genre)
    {
        System.out.println(" === Genres: " + genre + " ===");
        int i = 1;
        for (Game g : games) {
            if (g.getGenre() == genre) {
                System.out.println(i + ". " + g.getTitle());
                i++;
            }
        }
        System.out.println();
    }

    /**
     * Prints a list filtered by platform.
     */
    public void printGamesByPlatform(Platform platform)
    {
        System.out.println(" === Platform: " + platform + " ===");
        int i = 1;
        //FOR each game in games list
        for(Game g : games){
            //IF game platform equals given platform
            if(g.getPlatform() == platform){
                System.out.println(i + ". " + g.getTitle());
                i++;
            }
        }  
        System.out.println();
    }

    /**
     * Returns a list of games filtered by the age rating.
     */
    public void printGamesByAgeRating(AgeRating ageRating)
    {
        System.out.println(" === AgeRatings " + ageRating + " ===");
        int i = 1;
        //FOR each game in games list
        for(Game g : games){
            //IF game size matches condition
            if(g.getAgeRating() == ageRating){
                System.out.println(i + ". " + g.getTitle());
                i++;
            }
        }
    }

    /**
     * Returns a list of the top rated games.
     */
    public void printTopRatedGames()
    {
        System.out.println("=== Top Rated Games ===");
        int i = 1;
        //FOR each game in games list
        for (Game g : games){
            //IF game.getAverage() >= x
            double avg = g.getAverageRating();
            if (avg >= 4.0){
                System.out.println(i + ". " + g.getTitle() + " | Average Rating: " + avg);
                i++;
            }
        }
        if (i == 1){
            System.out.println("No top rated games yet.");
        }
        System.out.println();
    }

    /**
     * Adds a new game to the library.
     */
    public void addGame(Game game)
    {
        //ADD game to games list
        games.add(game);
    }

    /**
     * removes a game from the library.
     */
    public void removeGame(Game game)
    {
        //REMOVE game from games list
        games.remove(game);
    }

    /**
     * Returns all sessions that are recorded.
     */
    public ArrayList<GameSession> getAllSessions()
    {
        //RETURNS session list
        return new ArrayList<>(sessions);
    }

    /**
     * Returns all sessions associated with a specific game.
     */
    public ArrayList<GameSession> getSessionsForGame(Game game)
    {
        ArrayList<GameSession> sessionsForGame = new ArrayList<>();

        //FOR each session in sessions list
        for(GameSession session : sessions){
            //IF sessions.getGame() equals given game
            if(session.getGame() == game){
                //ADD session to collection
                sessionsForGame.add(session);
            }        
        }
        return sessionsForGame;
    }
    
    public void printSessionsForGame(Game game)
    {
        System.out.println("=== Sessions for: " + game.getTitle() + " ===");

        ArrayList<GameSession> sessionsForGame = getSessionsForGame(game);

        int i = 1;
        for (GameSession session : sessionsForGame) {
            System.out.println(i + ". " + session);
            i++;
        }

        System.out.println();
    }
    
    /**
     * Adds a new Session to the library.
     */
    public void addSession(GameSession session)
    {
        //ADD session to session list
        sessions.add(session);
    }

    public void removeSession(GameSession session){
        sessions.remove(session);
    }

    /**
     * Prints a log of all game sessions
     */
    public void printSessionLog(){
        //FOR each session in sessions list
        System.out.println(" ======= Session Log ======= ");
        for(GameSession session : sessions) {
            //print session
            System.out.println(session);
        }
    }
}
