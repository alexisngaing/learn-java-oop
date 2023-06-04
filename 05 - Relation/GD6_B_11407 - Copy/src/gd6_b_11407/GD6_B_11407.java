package gd6_b_11407;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 *
 * @author Alexis Divasonda Sigat Ngaing
 */
public class GD6_B_11407 {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String namaPerpus, alamatPerpus, judul, isbn;
        String namaFakultas, kodeFakultas, namaJurusan, kodeJurusan;
        String namaPenulis, email;
        int menu;
        
        try {
            do {
                System.out.println("[1] Relasi Agragasi dan Asosiasi");
                System.out.println("[2] Relasi Komposisi");
                System.out.println("[0] Keluar");
                System.out.print("Pilihan : ");
                menu = Integer.parseInt(br.readLine());

                switch (menu) {
                    case 1:
                        System.out.println("\n--- Relasi Agragasi dan Asosiasi ---");
                        System.out.println("Nama Perpustakaan : ");
                        namaPerpus = br.readLine();
                        System.out.println("Alamat Perpustakaan : ");
                        alamatPerpus = br.readLine();
                        Perpustakaan perpus = new Perpustakaan(namaPerpus, alamatPerpus);

                        for (int i = 0; i < 2; i++) {
                            System.out.println("\nInput Data Buku ke : " + (i+1));
                            System.out.println("Judul Buku : ");
                            judul = br.readLine();
                            System.out.println("Nomor ISBN : ");
                            isbn = br.readLine();
                            Buku buku = new Buku(judul, isbn);
                            perpus.addBuku(buku);

                            for (int j = 0; j < 2; j++) {
                                System.out.println("\nInput Data Penulis ke : " + (j+1));
                                System.out.println("Nama Penulis : ");
                                namaPenulis = br.readLine();
                                System.out.println("Email Penulis : ");
                                email = br.readLine();
                                Penulis penulis = new Penulis(namaPenulis, email);
                                buku.addPenulis(penulis);
                            }
                        }
                        perpus.showPerpustakaan(menu);
                        break;

                    case 2:
                        System.out.println("\n--- Relasi Komposisi ---");
                        System.out.println("Nama Fakultas : ");
                        namaFakultas = br.readLine();
                        System.out.println("Kode Fakultas : ");
                        kodeFakultas = br.readLine();
                        Fakultas fakultas = new Fakultas(namaFakultas, kodeFakultas);

                        for (int i = 0; i < 2; i++) {
                            System.out.println("\nInput Data Jurusan ke : " + (i+1));
                            System.out.println("Nama Jurusan : ");
                            namaJurusan = br.readLine();
                            System.out.println("Kode Jurusan : ");
                            kodeJurusan = br.readLine();
                            fakultas.addJurusan(namaJurusan, kodeJurusan);
                        }
                        fakultas.showFakultas();
                        break;

                    case 0:
                        System.out.println("\n\tExit Program...");
                        System.out.println("\n\t\tSemoga Harimu Menyenangkan");
                        break;
                }
            } while (menu != 0);
        } catch (Exception e) {
            
        }
    }
    
}
