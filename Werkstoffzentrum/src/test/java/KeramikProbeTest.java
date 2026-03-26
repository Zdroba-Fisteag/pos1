import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class KeramikProbeTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testKeramikProbe_shouldWork_throwsNoException() {
        assertDoesNotThrow(() -> { // lambda
            new KeramikProbe("WZ-410", "Aluminiumoxid", 3.9, 6.2);
        });
    }

    @Test
    void testKeramikProbe_shouldNotWork_nullID_throwsException() {
        assertDoesNotThrow(() -> { // lambda
            new KeramikProbe(null, "Aluminiumoxid", 3.9, 6.2);
        });
    }
}