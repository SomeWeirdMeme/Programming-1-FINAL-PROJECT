

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class GameSessionTest.
 *
 * @author  (Anthony O'Sullivan, David Grondin)
 * @version (0.0)
 */
public class GameSessionTest
{
    /**
     * Default constructor for test class GameSessionTest
     */
    public GameSessionTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void TestBaiscObjectCreation()
    {
        GameSession gameSess1 = new GameSession(null, "april", "place");
        gameSess1.startSession();
    }

    

    @Test
    public void ObjectCreation()
    {
        GameSession gameSess1 = new GameSession(null, "egf", "fe");
        gameSess1.endSession(23, "ball");
        assertEquals(null, gameSess1.getNotes());
    }
}


