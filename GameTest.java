

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class GameTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class GameTest
{
    /**
     * Default constructor for test class GameTest
     */
    public GameTest()
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
    public void GameCreation()
    {
        Game game1 = new Game("efg", 3.7, null, null, null);
        game1.addRating(4);
    }

    

    @Test
    public void TestingMethods()
    {
        Game game1 = new Game("cme", 3.6, null, null, null);
        game1.addRating(34);
        assertEquals(34, game1.getNumberOfRatings());
        assertEquals(4, game1.toString());
    }
}


