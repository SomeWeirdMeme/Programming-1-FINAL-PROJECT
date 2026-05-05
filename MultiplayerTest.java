

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
    public void TestingCreation()
    {
        Multiplayer multipla1 = new Multiplayer("fe", 3.3, null, null, null, 34, true);
        assertEquals(23, multipla1.getDetails());
    }

    @Test
    public void TestingPlay()
    {
        Multiplayer multipla1 = new Multiplayer("fe", 3.3, null, null, null, 4, true);
        multipla1.play();
    }
}

