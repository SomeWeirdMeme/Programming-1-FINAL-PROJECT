
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
    //The game that is being referred to in the current session.
    private Game game;
    
    /**
     * Creates a session linked to a specific game and date.
     */
    public GameSession(Game game, String date)
    {
        
    }
    
    /**
     * Starts a session
     * Used to track Mins and similar data.
     */
    public void startSession(){
        
    }
    
    /**
     * Returns a summary of the session details
     * game, duration, and date.
     */
    public String getSummary(){
        return "x";
    }
    
    /**
     * Returns the notes recorded for the session.
     */
    public String getNotes(){
        return "x";
    }
    
    
    /**
     * Returns the duration of the session in mins.
    */
    public int getDurationMinutes(){
        return 2;
    }
    
    /**
     * Ends the session and records the time and notes.
     * 
    */
    public void endSession(int durationMinutes, String notes){
        
    }
    
    
    /**
     * Returns a string representation of the session 
     */
    public String toString(){
        return "x";
    }
}
