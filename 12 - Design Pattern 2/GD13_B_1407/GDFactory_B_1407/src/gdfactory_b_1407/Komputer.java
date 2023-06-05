package gdfactory_b_1407;

public abstract class Komputer {
    protected String merek;
    protected int ram;
    protected double cpu;

    public Komputer(String merek, int ram, double cpu) {
        this.merek = merek;
        this.ram = ram;
        this.cpu = cpu;
    }

    public abstract void showData();
}
