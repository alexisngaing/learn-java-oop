package ugd12_b_11;

public class UGD12_B_11 {

    public static void main(String[] args) { 
        
        Toko tokoOneShop = new Toko("Toko One Shop", "Jl. Merdeka No.241");
        Manager managerSmith = new Manager("Smith", 3500000, tokoOneShop, "Utama");
        tokoOneShop.SetPenanggungJawab(managerSmith);
        
        Manager managerMichael = new Manager("Michael", 3000000, tokoOneShop, "Utama");
        Manager managerAndreson = new Manager("Andreson", 1000000, tokoOneShop, "Bagian");
        Kasir kasirWilson = new Kasir("Wilson", 300000, tokoOneShop, 1);
        Kasir kasirOlivia = new Kasir("Olivia", 800000, tokoOneShop, 8);
        managerMichael.RekrutBawahan(kasirWilson);
        managerMichael.RekrutBawahan(kasirOlivia);

        Kasir kasirBrian = new Kasir("Brian", 400000, tokoOneShop, 3);
        Kasir kasirEvans = new Kasir("Evans", 500000, tokoOneShop, 5);
        
        managerAndreson.RekrutBawahan(kasirBrian);
        managerAndreson.RekrutBawahan(kasirEvans);
        managerSmith.RekrutBawahan(managerMichael);
        managerSmith.RekrutBawahan(managerAndreson);
        
        tokoOneShop.TampilDaftarKaryawan();
        System.out.println("\n");
        tokoOneShop.PenjualanBarang(450000, 5);
        System.out.println("\n\tSetelah Penjualan Berhasil....\n");
        tokoOneShop.TampilDaftarKaryawan();
    }
}
