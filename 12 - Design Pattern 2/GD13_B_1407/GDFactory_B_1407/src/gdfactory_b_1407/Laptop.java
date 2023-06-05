package gdfactory_b_1407;

public class Laptop extends Komputer {
    public Laptop(String merek, int ram, double cpu) {
        super(merek, ram, cpu);
    }

    @Override
    public void showData() {
        System.out.println("\n=== Laptop ===");
        System.out.println("Merek : " + this.merek);
        System.out.println("RAM   : " + this.ram + " GB");
        System.out.println("CPU   : " + this.cpu + " GHz");
    }
}
