package gdfactory_b_1407;

public class KomputerFactory {
    public Komputer createKomputer(String  jenis, String merek, int ram, double cpu) {
        if (jenis.equalsIgnoreCase("PC")) {
            return new PC(merek, ram, cpu);
        } else if (jenis.equalsIgnoreCase("Server")) {
            return new Server(merek, ram, cpu);
        } else if (jenis.equalsIgnoreCase("Laptop")) {
            return new Laptop(merek, ram, cpu);
        } else {
            return null;
        }
    }
}
