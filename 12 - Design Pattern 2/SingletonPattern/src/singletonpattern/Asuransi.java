package singletonpattern;

import java.util.Vector;

public class Asuransi {

    ///////////////////////////////////////////////////////
    // atribut dan fungsi kelas Asuransi dalam implementasi
    // pattern singleton
    private static Asuransi asuransi = null;

    public static Asuransi getInstance() {
        if(asuransi == null) {
            asuransi = new Asuransi();
            System.out.println("Instansi kelas Asuransi dibuat");
        }
        else {
            System.out.println("Instansi kelas Asuransi sudah ada");
        }
        return asuransi;
    }
    //////////////////////////////////////////////////////

    // atribut kelas Asuransi sebagai subject dalam pattern observer
    private Vector<Employee> views;

    ////////////////////////////////////////////////////////////////
    // fungsi konstruktor dibuat private sebagai implementasi pattern
    // singleton
    private Asuransi() {
        views = new Vector<Employee>();
    }
    ////////////////////////////////////////////////////////////////

//    public Asuransi() {
//        views = new Vector<Employee>();
//    }

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
