

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class MultiplayerTest.
 *
 * @author  (Anthony O'Sullivan, David Grondin)
 * @version (0.0)
 */
public class MultiplayerTest
{
    /**
     * Default constructor for test class MultiplayerTest
     */
    public MultiplayerTest()
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
    public void TESTCREATIONAHHH()
    {
        Game game1 = new Game("gewr", 45.8, Genre.ACTION, Platform.PC, AgeRating.M);
        Multiplayer multipla1 = new Multiplayer(game1, 56, true);
    }

    @Test
    public void TestGetters()
    {
        Game game1 = new Game("egf", 45.0, Genre.ACTION, Platform.PC, AgeRating.M);
        Multiplayer multipla1 = new Multiplayer(game1, 455, true);
        assertEquals(455, multipla1.getMaxPlayers());
        assertEquals(true, multipla1.isLocalMultiplayer());
    }
}



