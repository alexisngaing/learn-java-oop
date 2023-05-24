package nonobserver;

public class BinObserver {
    public void update( int val ) {
        System.out.println ("Bin : " + Integer.toBinaryString(val));
    } 
}
