package Observer;

public class OctObserver extends Observer {
    public OctObserver (Subject mod) {
        super (mod);
    }

    public void update( int val ) {
        System.out.println ("Oct : " + Integer.toOctalString(val));
    }
}
