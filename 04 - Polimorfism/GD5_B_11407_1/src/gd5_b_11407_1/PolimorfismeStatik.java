package gd5_b_11407_1;

/**
 *
 * @author Alexis Divasonda Sigat Ngaing
 */
public class PolimorfismeStatik {

    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        Mahasiswa mhs1 = new Mahasiswa("210711407");
        Mahasiswa mhs2 = new Mahasiswa("210711407", "Alexis Ngaing");
        
        System.out.println("=== [ Overloading Constructor ] ===");
        System.out.println("Default Constructor");
        mhs.showMahasiswa();
        
        System.out.println("Constructor 1");
        mhs1.showMahasiswa();
        
        System.out.println("Constructor 2");
        mhs2.showMahasiswa();
        
        System.out.println("=== [ Overloading Method ] ===");
        Summary sum = new Summary();
        
        int totalSKS = sum.count(3, 3, 2);
        
        System.out.println("Total SKS            : " + totalSKS);
        System.out.println("Total Biaya Variabel : " + sum.count(totalSKS, 250000.0));
    }
}
