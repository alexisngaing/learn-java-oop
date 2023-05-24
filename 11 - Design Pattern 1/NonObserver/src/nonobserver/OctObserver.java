package nonobserver;

public class OctObserver {
    public void update( int val ) {
        System.out.println ("Oct : " + Integer.toOctalString(val));
    } 
}
