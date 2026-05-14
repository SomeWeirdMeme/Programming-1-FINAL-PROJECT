

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class SinglePlayerTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class SinglePlayerTest
{
    /**
     * Default constructor for test class SinglePlayerTest
     */
    public SinglePlayerTest()
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
    public void TestCreation()
    {
        Game game1 = new Game("wge", 45.0, Genre.ACTION, Platform.PC, AgeRating.M);
        SinglePlayer singlePl1 = new SinglePlayer(game1, true, 34);
    }

    @Test
    public void TestGetMinutesAndplay()
    {
        Game game1 = new Game("gwer", 45.0, Genre.ACTION, Platform.PC, AgeRating.M);
        SinglePlayer singlePl1 = new SinglePlayer(game1, true, 45555555);
        assertEquals(45555555, singlePl1.getEstimatedMinutes());
        singlePl1.play();
    }
}

