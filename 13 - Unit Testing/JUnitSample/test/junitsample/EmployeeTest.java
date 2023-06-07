package junitsample;

/**
 *
 * @author yamacat
 */
public class EmployeeTest extends junit.framework.TestCase  {

    public EmployeeTest() {}

    public void testEmployee(){
        Employee E1= new Employee("Andi",45);
        Employee E2= new Employee("Andi",45);
        assertSame(E1,E2);
    }

    public void testEmployee2(){
        Employee E1= new Employee("Andi",45);
        assertNotNull(E1);
    }
}
