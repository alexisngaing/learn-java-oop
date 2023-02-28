package my_testing;

public class Electronic {
    public int battery_capacity;
    public boolean power_status;
    public String serial_num;
    
    private int electrical_power;
    
    public Electronic(int battery_capacity, String serial_num) {
        this.battery_capacity = battery_capacity;
        this.serial_num = serial_num;
        
        this.power_status = false;
        this.electrical_power = 100;
    }
    
    protected void switch_power(boolean value) {
        this.power_status = value;
    }
    
    public int get_battery_status() {
        return this.battery_capacity;
    }
}
