package gdfactory_b_1407;

public class Server extends Komputer {
    public Server(String merek, int ram, double cpu) {
        super(merek, ram, cpu);
    }

    @Override
    public void showData() {
        System.out.println("\n=== Server ===");
        System.out.println("Merek : " + this.merek);
        System.out.println("RAM   : " + this.ram + " GB");
        System.out.println("CPU   : " + this.cpu + " GHz");
    }
}
