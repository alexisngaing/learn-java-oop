package factorypattern;

public class EmployeeFactory {
    public Employee create(String type, String name, String role,
                           Asuransi asr) {
        if (type.equalsIgnoreCase("Manager")) {
            System.out.println("Membuat Instance Manager");
            return new Manager(name, role, asr);
        }
        else { // Penciptaan objek Staf
            System.out.println("Membuat Instance Staf");
            return new Staf(name, role, asr);
        }
    }
}
