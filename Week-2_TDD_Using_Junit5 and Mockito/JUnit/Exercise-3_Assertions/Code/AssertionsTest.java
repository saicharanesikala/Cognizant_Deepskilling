import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionsTest {

    @Test

    public void testAssertions()
    {

        assertEquals(20, 10+8+2);
        assertEquals(30, 11+19);


        assertTrue(5 > 3);
        assertTrue(15 == 5+10);


        assertFalse(5 < 3);
        assertFalse(50 == 80);


        assertNull(null);



        assertNotNull(new Object());
    }
}