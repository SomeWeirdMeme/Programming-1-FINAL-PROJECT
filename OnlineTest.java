

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class OnlineTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class OnlineTest
{
    /**
     * Default constructor for test class OnlineTest
     */
    public OnlineTest()
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
    public void TestingPlay()
    {
        Game game1 = new Game(" gt5", 45.0, Genre.ACTION, Platform.PC, AgeRating.M);
        Online online1 = new Online(game1, "rfvv", true);
        online1.play();
    }
}
