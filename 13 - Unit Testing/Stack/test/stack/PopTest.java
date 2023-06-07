package stack;

/**
 *
 * @author yamacat
 */
public class PopTest extends junit.framework.TestCase { 

    SimpleStack01 instance;   

    public PopTest() {} 

    public void setUp() { 
        instance = new SimpleStack01();  
        instance.push(23);  
    } 

    public void tearDown() {} 

    public void testPopPass() { 
        System.out.println("pop"); 
        int expResult = 23; 
        int result = instance.pop(); 
        assertEquals(expResult, result); 
    } 

    public void testPopFail() { 
        System.out.println("pop"); 
        int expResult = 23; 
        int result = instance.pop(); 
        assertEquals(expResult, result); 
        result = instance.pop(); 
        assertEquals(expResult, result);         

    } 

} 
