package dao;

import connection.DbConnection;
import entity.Prodi;
import entity.Mahasiswa;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MahasiswaDAO {
    private DbConnection dbcon = new DbConnection();
    private Connection con;

    public void insertMahasiswa(Mahasiswa m) {
        con = dbcon.makeConnection();
        
        String sql = "INSERT INTO mahasiswa(npm, nama_mhs, kode_prodi) VALUES ('"
                + m.getNPM() + "','" + m.getNamaMahasiswa() + "','"
                + m.getProdi().getKodeProdi() + "')";

        System.out.println("Adding Mahasiswa...");

        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added " + result + " Mahasiswa");
            statement.close();
        } catch (Exception e) {
            System.out.println("Error adding Mahasiswa...");
            System.out.println(e);
        }
        
        dbcon.closeConnection();
    }
    
    public void updateMahasiswa(Mahasiswa m) {
        con = dbcon.makeConnection();
        
        String sql = "UPDATE mahasiswa SET nama_mhs = '" + m.getNamaMahasiswa()
                + "', kode_prodi = '" + m.getProdi().getKodeProdi()
                + "' WHERE npm = '" + m.getNPM() + "'";
        
        System.out.println("Editing Mahasiswa...");

        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Edited " + result + " Mahasiswa " + m.getNPM());
            statement.close();
        } catch (Exception e) {
            System.out.println("Error editing Mahasiswa...");
            System.out.println(e);
        }
        dbcon.closeConnection();
    }

    public void deleteMahasiswa(String npm) {
        con = dbcon.makeConnection();
        
        String sql = "DELETE FROM mahasiswa WHERE npm = '" + npm + "'";

        System.out.println("Deleting Mahasiswa...");

        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Delete " + result + " Mahasiswa " + npm);
            statement.close();
        } catch (Exception e) {
            System.out.println("Error deleting Mahasiswa...");
            System.out.println(e);
        }
        dbcon.closeConnection();
    }

    public List<Mahasiswa> showMahasiswa(String query) {
        con = dbcon.makeConnection();
        
        String sql = "SELECT m.*, p.* FROM mahasiswa as m JOIN prodi as p ON m.kode_prodi = p.kode_prodi WHERE (m.npm LIKE "
                + "'%" + query + "%'"
                + "OR m.nama_mhs LIKE '%" + query + "%'"
                + "OR p.nama_prodi LIKE '%" + query + "%')";
        
        System.out.println("Mengambil data Mahasiswa...");
        List<Mahasiswa> list = new ArrayList();

        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            if (rs != null) {
                while (rs.next()) {
                    Prodi p = new Prodi(rs.getString("p.kode_prodi"),
                            rs.getString("p.nama_prodi"));

                    Mahasiswa m = new Mahasiswa(rs.getString("m.npm"),
                            rs.getString("m.nama_mhs"), p);
                    
                    list.add(m);
                }
            }
            rs.close();
            statement.close();
        } catch (Exception e) {
            System.out.println("Error reading database...");
            System.out.println(e);
        }
        dbcon.closeConnection();
        return list;
    }
}
