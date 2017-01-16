import org.junit.*;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PhoneTest {
    /*
        Credit for method of capturing output of `System.out.println`:
        http://stackoverflow.com/a/1119559/394681
    */
    private ByteArrayOutputStream outContent;
    private PrintStream nativeOut;

    @Before
    public void buildUp() {
        nativeOut = System.out;
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUp() {
        System.setOut(nativeOut);
    }

    @Test
    public void testsCall() {
        Phone phone = new OldPhone("Nokia");
        phone.call("999");

        assertEquals("Calling 999...\n", outContent.toString());
    }
}