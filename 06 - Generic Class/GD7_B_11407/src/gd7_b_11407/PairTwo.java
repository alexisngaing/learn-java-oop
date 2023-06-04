package gd7_b_11407;

/**
 *
 * @author Alexis Divasonda S. N.
 */
public class PairTwo <T, V> {
    private T Value1;
    private V Value2;
    
    public PairTwo(T v1, V v2) {
        Value1 = v1;
        Value2 = v2;
    }
    
    public T getValue1() {
        return Value1;
    }
    
    public V getValue2() {
        return Value2;
    }
}
