package composite;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {

    // atribut kelas Manager sebagai composite class dalam
    // pattern composite
    List<Employee> employees = new ArrayList<Employee>();

    public Manager(String nm, String rl){
        super(nm, rl, 1000000);
    }

    // fungsi-fungsi kelas Manager sebagai composite class
    // dalam pattern composite
    public void addChild(Employee e) { // Catat siapa saja yang
        employees.add(e);              // menjadi bawahan manager
    }

    public Employee getChild(int i) {  // Cari tahu bawahan untuk
        return employees.get(i);       // seorang manager
    }

    public void traverseEmp() {       // tampilkan semua employee
        System.out.println( Employee.space + getName() + "(" +
                getRole() + " - " + getAsuransi() + ")" );
        Employee.space.append("   ");

        for (Employee e : employees) {
            e.traverseEmp();
        }

        Employee.space.setLength(Employee.space.length() - 3);
    }
}
