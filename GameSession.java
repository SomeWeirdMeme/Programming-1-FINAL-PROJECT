
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
    
    /**
     * Creates a session linked to a specific game and date.
     */
    public GameSession(Game game, String date, String region)
    {
        //SET game
        //SET date
        //SET region
        //SET duration = 0
        durationMinutes = 0;
        //SET notes = empty
    }
    
    //This needs some work Imma fix afterwards region is fully implemented I think...
    public String getRegion(){
        return region;
    }
    
    /**
     * Starts a session
     * Used to track Mins and similar data.
     */
    public void startSession(){
        //SET duration = 0
    }
    
    /**
     * Returns a summary of the session details
     * game, duration, region, and date.
     */
    public String getSummary(){
        //RETURN string with:
        //game
        //date
        //region
        //duration
        return "x";
    }
    
    /**
     * Returns the notes recorded for the session.
     */
    public String getNotes(){
        return "notes";
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
    public void endSession(int durationMinutes, String notes){
        //SET duration 
        //SET notes
    }
    
    
    /**
     * Returns a string representation of the session 
     */
    public String toString(){
        //RETURN short summary of session
        return "x";
    }
    
}
