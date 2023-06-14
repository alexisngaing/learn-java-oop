package tgs13_b_11_singleton;

/**
 *
 * @author yamacat
 */
public class Printer {
    private static Printer prInstance = null;
    private String prConn, prName;

    private Printer(String prConn, String prName) {
        this.prConn = prConn;
        this.prName = prName;
    }

    public static Printer getInstance(String prConn, String prName) {
        System.out.println("\nMembuat objek Printer baru...");

        if (Printer.prInstance == null) {
            Printer.prInstance = new Printer(prConn, prName);
            System.out.println("Objek Printer berhasil dibuat");
            System.out.println("Connection   : " + prConn);
            System.out.println("Printer name : " + prName);
        } else {
            System.out.println("Objek Printer gagal dibuat karena sudah");
            System.out.println("ada objek Printer yang dibuat sebelumnya!");
            System.out.println("Connection   : " + prConn);
            System.out.println("Printer name : " + prName);
        }
        return Printer.prInstance;
    }
}
