package my_testing;

public class My_testing {
    
    public static void main(String[] args) {
        Laptop laptop = new Laptop(1000, "New Zeeland", "Intel Expired");
        
        System.out.println(laptop.serial_num);
        
        laptop.switch_power(true);
        System.out.println("Switch Power : " + laptop.power_status);
        System.out.println("Battery Capacity : " + laptop.get_battery_status());
        
        laptop.set_brightness(500);
        laptop.build_program("Calculator");
    }
    
}
