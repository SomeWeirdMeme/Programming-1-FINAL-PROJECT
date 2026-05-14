
/**
 * Represents a single "Session" of any game.
 * Tracks info like the duration, date made, and the notes.
 * Each session is associated with its own game object.
 * 
 * @author (David Grondin)
 * @version (0.0)
 */
public class GameSession
{
    //Where the duration of the gameSession in mins is.
    private int durationMinutes;
    //The date of the gameSession made.
    private String date;
    //Notes that are created and stored for later use, (Call on getNotes).
    private String sessionNotes;
    //Checks which region the game session is taking place in.
    private String region;
    //The game that is being referred to in the current session.
    private Game game;

    private long startTime;
    /**
     * Creates a session linked to a specific game and date.
     */
    public GameSession(Game game, String date, String region)
    {
        this.game = game;
        this.date = date;
        this.region = region;
        this.durationMinutes = 0;
        this.sessionNotes = "";
        this.startTime = System.currentTimeMillis();

    }

    //This needs some work Imma fix afterwards region is fully implemented I think...
    public String getRegion(){
        return region;
    }

    /**
     * Starts a session
     * Used to track Mins and similar data.
     */
    public void startSession()
    {
        startTime = System.currentTimeMillis();
    }

    public Game getGame()
    {
        return game;
    }

    /**
     * Returns the notes recorded for the session.
     */
    public String getNotes(){
        return sessionNotes;
    }

    public String getSummary()
    {
        return "========== SESSION ==========\n" +
        "Game: " + game.getTitle() + "\n" +
        "Date: " + date + "\n" +
        "Region: " + region + "\n" +
        "Duration: " + durationMinutes + " mins\n" +
        "Notes: " + sessionNotes + "\n" +
        "============================";
    }

    /**
     * Returns the duration of the session in mins.
     */
    public int getDurationMinutes(){
        return durationMinutes;
    }

    /**
     * Ends the session and records the time and notes.
     * 
     */
    public void endSession(String notes)
    {
        long endTime = System.currentTimeMillis();
        int actualMinutes = (int)((endTime - startTime) / 60000);
        int max = game.getMaxSessionMinutes();

        if (actualMinutes > max){
            System.out.println("Session exceeded max allowed time. Capping to limit.");
            actualMinutes = max;
        }

        this.durationMinutes = actualMinutes;
        this.sessionNotes = notes;
    }

    /**
     * Returns a string representation of the session 
     */
    public String toString(){
        return game.getTitle() +
        " | " + date +
        " | " + durationMinutes + " mins";
    }

}
