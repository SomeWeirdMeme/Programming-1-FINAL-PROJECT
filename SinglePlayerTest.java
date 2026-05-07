
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class SinglePlayerTest.
 *
 * @author  (Anthony O'Sullivan, David Grondin)
 * @version (0.0)
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
    public void ObjectCreation()
    {
        SinglePlayer singlePl1 = new SinglePlayer("fef", 3.0, null, null, null, true, 45);
        assertEquals(null, singlePl1.toString());
    }

    @Test
    public void TestingMethods()
    {
        SinglePlayer singlePl1 = new SinglePlayer("fe", 3.9, null, null, null, false, 23);
        singlePl1.play();
    }
}

