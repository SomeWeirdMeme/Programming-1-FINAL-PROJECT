

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class GameLibraryTest.
 *
 * @author  (Anthony O'Sullivan, David Grondin)
 * @version (0.0)
 */
public class GameLibraryTest
{
    /**
     * Default constructor for test class GameLibraryTest
     */
    public GameLibraryTest()
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
    public void TestingObjectCreation()
    {
        GameLibrary gameLibr1 = new GameLibrary("Hello");
        gameLibr1.printLibraryDetails();
    }
    
    

    @Test
    public void TestPrintDetails()
    {
        GameLibrary gameLibr1 = new GameLibrary("Library");
        gameLibr1.printLibraryDetails();
        gameLibr1.printSessionLog();
    }
}


