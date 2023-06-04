package gd7_b_11407;

/**
 *
 * @author Alexis Divasonda S. N.
 */
public class PairThree <X, Y, Z> {
    private X Value1;
    private Y Value2;
    private Z Value3;
    private int Value4;
    
    public PairThree(X v1, Y v2, Z v3, int v4) {
        Value1 = v1;
        Value2 = v2;
        Value3 = v3;
        Value4 = v4;
    }
    
    public X getValue1() {
        return Value1;
    }
    
    public Y getValue2() {
        return Value2;
    }
    
    public Z getValue3() {
        return Value3;
    }
    
    public int getValue4() {
        return Value4;
    }
}
