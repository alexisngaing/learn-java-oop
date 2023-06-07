package junitsample;

/**
 *
 * @author yamacat
 */
public class ConcatTest extends junit.framework.TestCase {
    public ConcatTest() {}
    
    public void testConcatenate() {
        Concat C = new Concat();
        String result = C.concatenate("Christian", "Vieri");
        assertEquals("Christian Vieri", result);
    }
}
