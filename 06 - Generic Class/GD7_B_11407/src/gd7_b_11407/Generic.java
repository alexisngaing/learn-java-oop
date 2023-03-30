package gd7_b_11407;

/**
 *
 * @author Alexis Divasonda S. N.
 */
public class Generic <T> {
    private T value;
    
    public Generic(T value) {
        this.value = value;
    }
    
    public T getValue() {
        return value;
    }
}
