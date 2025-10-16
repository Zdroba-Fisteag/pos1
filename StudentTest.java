

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class StudentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class StudentTest
{
    /**
     * Default constructor for test class StudentTest
     */
    public StudentTest()
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
        //a
    }
    @Test
    public void Test_fatOrNot() {
        //Mann
        Student s1m = new Student("Mario", 300, 160, 'm');
        assertEquals("Wie viele Mc's hast du bisher gesammelt? :)", s1m.fatOrNot());
        Student s2m = new Student("Nikolaus", 75, 160, 'm');
        assertEquals("Ein bisschen weniger Essen wäre gut.", s2m.fatOrNot());
        Student s3m = new Student("Nikolaus", 55, 160, 'm');
        assertEquals("Standard", s3m.fatOrNot());
        Student s4m = new Student("Nikolaus", 25, 160, 'm');
        assertEquals("Du bist untergewichtig!!!", s4m.fatOrNot());
        //Frau
        Student s1f = new Student("Maria", 300, 160, 'm');
        assertEquals("Wie viele Mc's hast du bisher gesammelt? :)", s1f.fatOrNot());
        Student s2f = new Student("Nikola", 75, 160, 'm');
        assertEquals("Ein bisschen weniger Essen wäre gut.", s2f.fatOrNot());
        Student s3f = new Student("Nikola", 55, 160, 'm');
        assertEquals("Standard", s3f.fatOrNot());
        Student s4f = new Student("Nikola", 25, 160, 'm');
        assertEquals("Du bist untergewichtig!!!", s4f.fatOrNot());
        Student s5f = new Student("Maria", 70, 180, 'w');
        assertEquals("Standard", s5f.fatOrNot());
    }
    @Test
    public void Test_BMI() {
        Student s1m = new Student("Maria", 70, 180, 'w');
        assertEquals(21.6, s1m.bmi(), 0.1, "Erwartet is 21.6");
        Student s2m = new Student("Mario", 260, 150, 'm');
        assertEquals(115.6, s2m.bmi(), 0.1, "Erwartet is 115.6");
        Student s3m = new Student("Marion", 10, 200, 'w');
        assertEquals(2.5, s3m.bmi(), 0.1, "Erwartet is 2.5");
    }
    @Test
    public void testFalscherNameThrows() {
        Student stud;
        try {
            stud = new Student("Sewe", 150, 200, 'w');
            stud = new Student("Marie", 150, 200, 'w');
            stud = new Student("Eduard", 150, 200, 'w');
            // fail("Student wurde trotz Fehler erzeugt...");
        }
        catch (IllegalArgumentException e) {
            System.out.println("Exception empfangen: " + e.getMessage());
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
        //a
    }
}