package tgs13_b_11_singleton;

/**
 *
 * @author yamacat
 */
public class TGS13_B_11_Singleton {

    public static void main(String[] args) {
        Printer pr1 = Printer.getInstance("Printer B/W", "Fotocopy Atma");
        Printer pr2 = Printer.getInstance("Printer Color", "Fotocopy Atma");
    }
    /* 
    Penjelasan :
    
    Prinsip singleton memastikan suatu kelas hanya bisa memiliki satu objek saja.
    Dalam kasus ini, printer, karena cara kerja printer hanya dapat melakukan satu
    pekerjaan, atau dengan kata lain hanya dapat mencetak satu dokumen dalam satu
    proses pekerjaan. Untuk itu, diperlukan prinsip singleton guna menghindari adanya
    dua pekerjaan sekaligus atau dua copy sekaligus.
    */
}
