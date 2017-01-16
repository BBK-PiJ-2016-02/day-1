import org.junit.*;
import static org.junit.Assert.*;

public class HashUtilitiesTest {
    HashUtilities hashUtility;

    @Before
    public void buildUp() {
        hashUtility = new HashUtilities();
    }

    @Test
    public void tests0() {
        int shortInt = hashUtility.shortInt(0);
        assertTrue(isWithinBounds(shortInt));
    }

    @Test
    public void tests1() {
        int shortInt = hashUtility.shortInt(1);
        assertTrue(isWithinBounds(shortInt));
    }

    @Test
    public void tests999() {
        int shortInt = hashUtility.shortInt(999);
        assertTrue(isWithinBounds(shortInt));
    }

    @Test
    public void tests1000() {
        int shortInt = hashUtility.shortInt(1000);
        assertTrue(isWithinBounds(shortInt));
    }

    @Test
    public void testsRange() {
        for(int i = -5000; i < 10000; i++) {
            int shortInt = hashUtility.shortInt(i);
            assertTrue(isWithinBounds(shortInt));
        }
    }

    @Test
    public void testsRandomInts() {
        for(int i = 0; i < 2000; i++) {
            int shortInt = hashUtility.shortInt((int) (Math.random() * 1000));
            assertTrue(isWithinBounds(shortInt));
        }
    }

    private boolean isWithinBounds(int value) {
        return (value > 0 && value < 1000);
    }
}