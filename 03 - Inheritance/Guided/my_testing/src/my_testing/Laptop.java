package my_testing;

public class Laptop extends Electronic {
    private String cpu;
    
    public Laptop(int battery_capacity, String serial_num, String cpu) {
        super(battery_capacity, serial_num);
        this.cpu = cpu;
    }
    
    public void set_brightness(int value) {
        System.out.println("Set Brightness " + value);
    }
    
    protected void build_program(String program) {
        System.out.println("Build : " + program);
    }
}
