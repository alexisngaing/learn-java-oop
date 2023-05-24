package nonobserver;

public class HexObserver {
    public void update( int val ) {
        System.out.println ("Hex : " + Integer.toHexString(val));
    }
}
