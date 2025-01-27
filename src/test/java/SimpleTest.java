import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SimpleTest {

    @Test
    public void simpleAdditionTest() {
        int a = 10;
        int b = 20;

        int result = a + b;

        assertEquals(30, result);
    }
}