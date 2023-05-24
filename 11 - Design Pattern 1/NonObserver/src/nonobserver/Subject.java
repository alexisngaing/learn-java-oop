package nonobserver;

public class Subject {
   private int subjectState;
   private OctObserver octObserver;
   private BinObserver binObserver;
   private HexObserver hexObserver;
   
   public Subject() {
       octObserver = new OctObserver();
       binObserver = new BinObserver();
       hexObserver = new HexObserver();
   }
   public void setState( int val ) {
        subjectState = val;
        octObserver.update(subjectState);
        binObserver.update(subjectState);
        hexObserver.update(subjectState);
   } 
}
