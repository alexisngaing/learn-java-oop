package dao;

import connection.DbConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Dosen;
import model.MataKuliah;

public class MataKuliahDAO {
    private DbConnection dbCon = new DbConnection();
    private Connection con;
    
    public void insertMataKuliah(MataKuliah mk){
        con = dbCon.makeConnection();
        
        String sql = "INSERT INTO mata_kuliah(nomor_induk_dosen, nama, deskripsi, metode_pembelajaran, kelas) VALUES ('" 
                    + mk.getDosen().getNomorIndukDosen() + "','" 
                    + mk.getNama() + "','" 
                    + mk.getDeskripsi()+ "','"
                    + mk.getMetode_pembelajaran() + "','" 
                    + mk.getKelas() + "')";
        
        System.out.println("Adding Mata Kuliah...");
        
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added " + result + " Mata Kuliah");
            statement.close();
        } catch (Exception e) {
            System.err.println("Error Adding Mata Kuliah [!]");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    public List<MataKuliah> showMataKuliah(String query) {
        con = dbCon.makeConnection();
        
        String sql = "SELECT mk.*, d.* FROM mata_kuliah as mk JOIN dosen as d ON d.nomor_induk_dosen = mk.nomor_induk_dosen WHERE (mk.nama LIKE "
                + "'%" + query + "%'"
                + "OR mk.deskripsi LIKE '%" + query + "%'"
                + "OR mk.metode_pembelajaran LIKE '%" + query + "%'"
                + "OR mk.kelas LIKE '%" + query + "%'"
                + "OR d.nama LIKE '%" + query + "%')";
        
        System.out.println("Mengambil data Mata Kuliah...");
        
        List<MataKuliah> list = new ArrayList();
        
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if (rs != null) {
                while (rs.next()) {
                    Dosen d = new Dosen (
                            rs.getString("d.nomor_induk_dosen"),
                            rs.getString("d.nama"),
                            rs.getString("d.email"),
                            rs.getString("d.no_handphone")
                    );
                    MataKuliah mk = new MataKuliah(
                            Integer.parseInt(rs.getString("mk.id")), 
                            rs.getString("mk.nama"), 
                            rs.getString("mk.deskripsi"), 
                            rs.getString("mk.metode_pembelajaran"),
                            rs.getString("mk.kelas"), 
                            d);
                    list.add(mk);
                }
            }
            rs.close();
            statement.close();
        } catch (Exception e) {
            System.err.println("Error reading Dosen [!]");
            System.out.println(e);
        }
        dbCon.closeConnection();
        
        return list;
      
    }
    
    public void updateMataKuliah(MataKuliah mk) {
        con = dbCon.makeConnection();
        
        String sql = "UPDATE mata_kuliah SET nomor_induk_dosen = '" + mk.getDosen().getNomorIndukDosen() + "', "
                    + "nama = '" + mk.getNama() + "', "
                    + "deskripsi = '" + mk.getDeskripsi() + "', "
                    + "metode_pembelajaran = '" + mk.getMetode_pembelajaran() + "', "
                    + "kelas = '" + mk.getKelas() + "', "
                    + "WHERE id = '" + mk.getId() + "'";
        
        System.out.println("Editing Mata Kuliah...");
        
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Edited " + result + " Matakuliah " + mk.getId());
            statement.close();
        } catch (Exception e) {
            System.err.println("Error editing Mata Kuliah [!]");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
     
     public void deleteMataKuliah(int id) {
         con = dbCon.makeConnection();
         
         String sql = "DELETE FROM mata_kuliah WHERE id = " + id + "";
         System.out.println("Deleting Mata Kuliah...");
         
         try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Deleted " + result + " Mata Kuliah " + id);
            statement.close();
        } catch (Exception e) {
            System.err.println("Error deleting Mata Kuliah [!]");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
}
