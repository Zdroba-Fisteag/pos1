

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class AutoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class AutoTest
{
    /**
     * Default constructor for test class AutoTest
     */
    public AutoTest()
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
    
    
    @Test
    public void Test_printAuto() {
        try {
            Auto BMW = new Auto("BMW", 3000);
            Person ferdi = new Person("Maria", true, 181, 200);
            Person ferdin = new Person("Maria", true, 181, 200);
            Person marie = new Person("Anna", false, 160, 100); 
            Person hans = new Person("Markus", true, 170, 100);
            BMW.einsteigen(ferdi);
            BMW.einsteigen(marie);
            BMW.einsteigen(marie);
            BMW.einsteigen(hans);
        }
        catch (IllegalStateException e) {
            System.out.println("Was hast du gemacht?");
        }
    }
    
    
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
        System.out.println("Executing tearUp()");
    }
}