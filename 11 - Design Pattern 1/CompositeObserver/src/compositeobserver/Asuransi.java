package compositeobserver;

import java.util.Vector;
public class Asuransi {
    // atribut kelas Asuransi sebagai subject dalam pattern observer
    private Vector<Employee> views;

    public Asuransi() {
        views = new Vector<Employee>();
    }

    // fungsi-fungsi kelas Asuransi sebagai subject dalam
    // pattern observer
    public void attach (Employee obs) {
        views.add(obs);
    }

    public void notifyObserver(float val) {
        for (int i=0; i < views.size(); i++)
            views.elementAt(i).update(val);
    }

    public void setState(float val) {
        notifyObserver(val);
    }
}
