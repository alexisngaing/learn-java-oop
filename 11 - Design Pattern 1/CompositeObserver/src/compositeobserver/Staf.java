package compositeobserver;

public class Staf extends Employee {
    public Staf (String nm, String rl){
        super(nm, rl, 750000);
    }

    // + //
    public Staf (String nm, String rl, Asuransi mod){
        super(nm, rl, 750000, mod);
    }
    // + //

    // fungsi-fungsi kelas Staf sebagai leaf class dalam
    // pattern composite
    public void addChild(Employee employee) {} // do nothing. Kelas Staf
    // tidak memiliki bawahan

    public Employee getChild(int i) {
        return null;
    }

    public void traverseEmp() {
        System.out.println(Employee.space + getName() + "(" +
                getRole() + " - " + getAsuransi() + ")" );
    }

    ///////////////////////////////////////////////////////
    // fungsi kelas Staf sebagai concrete observer dalam
    //  pattern composite
    public void update(float val) {
        asuransi = asuransi + asuransi * val;
    }
}
