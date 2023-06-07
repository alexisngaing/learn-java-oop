package stack;

/**
 *
 * @author yamacat
 */
public class PushTest extends junit.framework.TestCase {
    SimpleStack01 instance;
    public PushTest() {
    }

    public void setUp() {
        instance = new SimpleStack01();
        instance.push(1);
        instance.push(2);
        instance.push(3);
        instance.push(4);
    }

    public void tearDown() {
    }

    public void testPushPass() {
        System.out.println("push");
        int e = 23;
        String expResult = "Element " + e + " inserted succesfully";
        String result = instance.push(e);
        assertEquals(expResult, result);
    }

    public void testPushFail() {
        System.out.println("push");
        int e = 34;
        String expResult = "Element " + e + " inserted succesfully";
        String result = instance.push(e);
        assertEquals(expResult, result);
        result = instance.push(e);
        assertEquals(expResult, result);
    }
}