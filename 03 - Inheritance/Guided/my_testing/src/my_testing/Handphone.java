package my_testing;

public class Handphone extends Electronic {
    private String biometric_security;
    
    public Handphone(int battery_capacity, String serial_num, String security) {
        super(battery_capacity, serial_num);
        this.biometric_security = security;
    }
    
    public void take_foto() {
        System.out.println("Chess...!");
    }
    
    public boolean biometric_check(String value) {
        return value.equals(this.biometric_security);
    }
}
