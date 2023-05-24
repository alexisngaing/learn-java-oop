package Observer;

public class HexObserver extends Observer {
    public HexObserver (Subject mod) {
        super (mod);
    }

    public void update( int val ) {
        System.out.println ("hex : " + Integer.toHexString(val));
    }
}
