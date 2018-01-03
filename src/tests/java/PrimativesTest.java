import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PrimativesTest {

    private String message = "Hello World";
    { System.out.println(message); }
    //private String message = "Hello World"; // does not compile
    @Test
    public void testPrimatives() {
        long number = 3_000_000_000L;
        System.out.println(number + Integer.MAX_VALUE - 3_000_000_000L);

        double d1 = 12.0;
        double x = 0xE;
    }
}
