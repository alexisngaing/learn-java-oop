package gdfactory_b_1407;

public class GDFactory_B_1407 {

    public static void main(String[] args) {
        KomputerFactory kf = new KomputerFactory();

        Komputer komputer1 = kf.createKomputer("PC", "Lenovo", 8, 3.4);
        Komputer komputer2 = kf.createKomputer("Server", "HP", 16, 4.2);
        Komputer komputer3 = kf.createKomputer("Laptop", "Asus", 16, 3.6);

        komputer1.showData();
        komputer2.showData();
        komputer3.showData();
    }
}
