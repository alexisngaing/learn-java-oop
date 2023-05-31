package singletonpattern;

public abstract class Employee {
    public static StringBuffer space = new StringBuffer();

    // atribut-atribut kelas Employee sebagai sebuah konsep
    protected String role;     // jabatan employee
    protected String name;
    protected float asuransi; // premi asuransi employee
    protected Asuransi model;

    public Employee (String nm, String rl, float asr) {
        name = nm; role = rl;
        asuransi = asr;
    }

    // + //
    public Employee (String nm, String rl, float asr, Asuransi mod) {
        name = nm; role = rl;
        asuransi = asr;
        model = mod;
        model.attach(this); // Employee sebagai observers mendaftar
        // ke Asuransi (sebagai subject)
    }
    // + //

    // fungsi-fungsi Employee sebagai  abstract component
    // dalam pattern composite. Override di kelas turunan
    public abstract void addChild(Employee e);
    public abstract Employee getChild(int i);
    public abstract void traverseEmp();


    // fungsi-fungsi getter kelas Employee sebagai sebuah konsep
    public String getRole() { return role; }
    public String getName() { return name; }
    public float  getAsuransi() { return asuransi ; }

    /////////////////////////////////////////////////////
    // atribut kelas Employee sebagai abstract observer
    // dalam pattern observer
//    private Asuransi model;
    /////////////////////////////////////////////////////

    /////////////////////////////////////////////////////
    // fungsi-fungsi kelas Employee sebagai abstract observer
    // dalam pattern observer
    public abstract void update(float val);
    /////////////////////////////////////////////////////
}
