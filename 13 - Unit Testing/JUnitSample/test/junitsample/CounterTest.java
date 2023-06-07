package junitsample;

/**
 *
 * @author yamacat
 */
public class CounterTest extends junit.framework.TestCase {
    Counter counter1;
    public CounterTest() {
    }

    protected void setUp() {
        counter1 = new Counter();
    }

    public void testIncrement() {
        assertTrue(counter1.increment() == 1);
        assertTrue(counter1.increment() == 2);
        assertTrue(counter1.increment() == 3);
    }

    public void testIncrementFalse() {
        assertFalse(counter1.increment() == 0);
        assertFalse(counter1.increment() == 1);
    }

    public void testDecrement() {
        assertTrue(counter1.decrement() == -1);
    }
}