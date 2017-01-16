import org.junit.*;
import static org.junit.Assert.*;

public class HashUtilitiesTest {
    @Test
    public void testsStortInt() {
        HashUtilities hashUtility = new HashUtilities();

        for(int i = -1337; i < 10000; i++) {
            int shortInt = hashUtility.shortInt(i);
            assertTrue(shortInt > 0 && shortInt < 1000);
        }
    }
}