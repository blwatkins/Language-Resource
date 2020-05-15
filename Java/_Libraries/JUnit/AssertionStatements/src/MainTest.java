import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void testAssertEquals() {
        int myInt = 7;
        assertEquals(7, myInt);
    }

    @Test
    public void testAssertNotEquals() {
        int myInt = 7;
        assertNotEquals(10, myInt);
    }

    @Test
    public void testAssertArrayEquals() {
        char[] a = "hello".toCharArray();
        char[] b = "hello".toCharArray();
        assertArrayEquals(a, b);
    }

    @Test
    public void testAssertTrue() {
        assertTrue(true);
    }

    @Test
    public void testAssertFalse() {
        assertFalse(false);
    }

    @Test
    public void testAssertNull() {
        assertNull(null);
    }

    @Test
    public void testAssertNotNull() {
        Object o = new Object();
        assertNotNull(o);
    }

    @Test
    public void testAssertSame() {
        Object o = new Object();
        assertSame(o, o);
    }

    @Test
    public void testAssertNotSame() {
        Object o1 = new Object();
        Object o2 = new Object();
        assertNotSame(o1, o2);
    }

}