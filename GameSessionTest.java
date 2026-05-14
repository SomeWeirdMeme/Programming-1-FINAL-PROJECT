

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class GameSessionTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
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
    public void TestingCreation()
    {
        Game game1 = new Game("ergw", 45.0, Genre.ACTION, Platform.PC, AgeRating.M);
        GameSession gameSess1 = new GameSession(game1, "3/3/2026", "wegr");
    }

    @Test
    public void TestPlayLegitUSELESS()
    {
        Game game2 = new Game("wegr", 45.9, Genre.ACTION, Platform.PC, AgeRating.M);
        GameSession gameSess2 = new GameSession(game2, "3/3/2026", "wefg");
        assertEquals("wefg", gameSess2.getRegion());
        gameSess2.startSession();
    }
}

