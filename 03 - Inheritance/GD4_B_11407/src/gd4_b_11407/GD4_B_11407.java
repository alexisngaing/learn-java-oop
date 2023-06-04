package gd4_b_11407;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 *
 * @author Alexis Divasonda Sigat Ngaing
 */
public class GD4_B_11407 {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        String nama, spesialis, matkul, noTelp;
        int umur;
        float gajiPokok, tunjangan, gajiSpesialis, waktuBekerja;

        Dosen dsn[] = new Dosen[2];
        Dokter dkt[] = new Dokter[2];

        try {
            for (int i = 0; i < 2; i++) {
                System.out.println("Nama           : "); nama = br.readLine();
                System.out.println("Mata Kuliah    : "); matkul = br.readLine();
                System.out.println("Umur           : "); umur = Integer.parseInt(br.readLine());
                System.out.println("No Telepon     : "); noTelp = br.readLine();
                System.out.println("Gaji Pokok     : "); gajiPokok = Float.parseFloat(br.readLine());
                System.out.println("Tunjangan      : "); tunjangan = Float.parseFloat(br.readLine());

                dsn[i] = new Dosen(nama, matkul, umur, noTelp, gajiPokok, tunjangan);
            }

            for (int i = 0; i < 2; i++) {
                System.out.println("Nama           : "); nama = br.readLine();
                System.out.println("Spesialis      : "); spesialis = br.readLine();
                System.out.println("Umur           : "); umur = Integer.parseInt(br.readLine());
                System.out.println("No Telepon     : "); noTelp = br.readLine();
                System.out.println("Gaji Spesialis : "); gajiSpesialis = Float.parseFloat(br.readLine());
                System.out.println("Waktu Bekerja  : "); waktuBekerja = Float.parseFloat(br.readLine());

                dkt[i] = new Dokter(nama, spesialis, umur, noTelp, gajiSpesialis, waktuBekerja);
            }

            System.out.println("\n\tData Dosen");
            for (int i = 0; i < 2; i++) {
                dsn[i].showDataDosen();
                System.out.println("\n");
            }
            System.out.println("\n\tData Dokter");
            for (int i = 0; i < 2; i++) {
                dkt[i].showDataDokter();
                System.out.println("\n");
            }
        } catch (Exception w) {
            System.out.println("\n\t\tSomething wrong [!]");
        }
    }
}
