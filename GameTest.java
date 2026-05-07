

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class GameTest.
 *
 * @author  (Anthony O'Sullivan, David Grondin)
 * @version (0.0)
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
        Game game1 = new Game("Roblox", 34.0, Genre.ADVENTURE, Platform.PLAYSTATION, AgeRating.T);
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
    public void TestingRatings()
    {
        Game game1 = new Game("Halo", 67.0, Genre.ACTION, Platform.XBOX, AgeRating.E);
        game1.addRating(50);
        game1.addRating(68);
        game1.addRating(20);
        game1.getRatings();
        assertEquals(3, game1.getNumberOfRatings());
    }

    @Test
    public void TestAverageRating()
    {
        Game game1 = new Game("ded", 455.0, Genre.ADVENTURE, Platform.XBOX, AgeRating.M);
        game1.addRating(4);
        game1.addRating(5);
        assertEquals(4.5, game1.getAverageRating(), 0.1);
    }

}






