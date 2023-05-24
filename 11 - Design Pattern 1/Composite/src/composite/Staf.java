package composite;

public class Staf extends Employee {
    public Staf (String nm, String rl){
        super(nm, rl, 750000);
    }

    // fungsi-fungsi kelas Staf sebagai leaf class dalam
    // pattern composite
    public void addChild(Employee employee) {} // do nothing. Kelas Staf
    // tidak memiliki bawahan

    public Employee getChild(int i) {
        return null;
    }

    public void traverseEmp() {
        System.out.println( Employee.space + getName() + "(" +
                getRole() + " - " + getAsuransi() + ")" );
    }
}
