package gd5_b_11407_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
/**
 *
 * @author Alexis Divasonda Sigat Ngaing
 */
public class PolimorfismeDinamik {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        int jmlPer, jamK, i, count;
        String npm, nama, matkul, kantor;
        double gajiP;
        ArrayList<Mahasiswa> mhs = new ArrayList<>();
        
        try {
            System.out.println("Banyak data Asisten Dosen yang akan dibuat : "); count = Integer.parseInt((br.readLine()));
            for (i = 0; i < count; i++) {
                System.out.println("=== [ Input Data Asisten Dosen " + (i + 1) + " ] ===");
                System.out.println("Nomor Pokok Mahasiswa : "); npm = br.readLine();
                System.out.println("Nama Mahasiswa        : "); nama = br.readLine();
                System.out.println("Gaji Pokok            : "); gajiP = Double.parseDouble(br.readLine());
                System.out.println("Mata Kuliah           : "); matkul = br.readLine();
                System.out.println("Jumlah Pertemuan      : "); jmlPer = Integer.parseInt(br.readLine());
                mhs.add(new AsistenDosen(npm, nama, gajiP, matkul, jmlPer));
            }
            System.out.println("=================================================");
            System.out.println("Banyak data Student Staff yang akan dibuat : "); count = Integer.parseInt(br.readLine());
            for (i = 0; i < count; i++) {
                System.out.println("=== [ Input Data Student Staff " + (i + 1) + " ] ===");
                System.out.println("Nomor Pokok Mahasiswa : "); npm = br.readLine();
                System.out.println("Nama Mahasiswa        : "); nama = br.readLine();
                System.out.println("Gaji Pokok            : "); gajiP = Double.parseDouble(br.readLine());
                System.out.println("Jenis Kantor          : "); kantor = br.readLine();
                System.out.println("Jam Kerja             : "); jamK = Integer.parseInt(br.readLine());
                mhs.add(new StudentStaff(npm, nama, gajiP, kantor, jamK));
            }
            System.out.println("=================================================");
            for (i = 0; i < mhs.size(); i++) {
                System.out.println("[ Data Mahasiswa yang Bekerja " + (i + 1) + "]");
                mhs.get(i).showData();
                System.out.println("=================================================");
            }
            System.out.println("=================================================");
        } catch (Exception e) {}
    }
}
