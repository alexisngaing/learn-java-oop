package gd12_b_11407_2;

public class GD12_B_11407_2 {

    public static void main(String[] args) {
        Perusahaan p = new Perusahaan("Perusahaan DP1");
        
        Observer pgw1 = new Marketing(10000, 40000, "Market", p);
        Observer pgw2 = new IT(30000, 3, "IT", p);
        
        p.tambahBonus(5000);
        
        p.removeObserver(pgw2);
        System.out.println("\nSetelah Remove\n");
        p.tambahBonus(2000);
    }
}
