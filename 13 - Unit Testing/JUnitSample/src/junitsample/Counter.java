package junitsample;

/**
 *
 * @author yamacat
 */
public class Counter {
    int count = 0;
    
    public Counter() {}
    
    public int increment() {
        return ++count;
    }
    
    public int decrement() {
        return --count;
    }
}
