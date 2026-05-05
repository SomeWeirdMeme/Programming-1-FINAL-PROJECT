

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
    public void TestingMethods()
    {
        Online online1 = new Online("game", 23.8, null, null, null, "fge", true);
        assertEquals(1, online1.getDetails());
    }

    @Test
    public void ObjectCreation()
    {
        Online online1 = new Online("fe", 3.3, null, null, null, "fe", false);
        online1.connect();
        online1.play();
    }
}

