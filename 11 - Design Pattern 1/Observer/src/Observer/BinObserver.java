package Observer;

public class BinObserver extends Observer {
    public BinObserver(Subject mod) {
        super (mod);
    }

    public void update( int val ) {
        System.out.println ("bin : " + Integer.toBinaryString(val));
    }
}
