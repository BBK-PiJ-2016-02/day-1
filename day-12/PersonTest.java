import org.junit.*;
import static org.junit.Assert.*;

public class PersonTest {
    @Test
    public void testsNormalName() {
        Person p = new Person();
        String input = "Dereck Robert Yssirt";
        String output = p.getInitials(input);
        String expected = "DRY";

        assertEquals(output, expected);
    }

    @Test
    public void testsDoubleSpacedName() {
        Person p = new Person();
        String input = "Patrick  Stewart";
        String output = p.getInitials(input);
        String expected = "PS";

        assertEquals(output, expected);
    }
}