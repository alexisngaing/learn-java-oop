package dao;

/**
 * Nama : Thessalonica Angelina Meil
 * NPM  : 210711122
 * 
 * Nama : Alexis Divasonda Sigat Ngaing
 * NPM  : 210711407
 */

import connection.DbConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Pasien;

public class PasienDAO {
    private DbConnection dbCon = new DbConnection();
    private Connection con;
    
    public List<Pasien> showListPasien(){
        con = dbCon.makeConnection();
        
        String sql = "SELECT * FROM pasien";
        System.out.println("Mengambil data Pasien...");
        
        List<Pasien> list = new ArrayList();
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            if (rs != null){
                while(rs.next()) {
                    Pasien p = new Pasien(
                            Integer.parseInt(rs.getString("id")),
                            rs.getString("nama"),
                            rs.getString("ktp"),
                            rs.getString("no_telepon") 
                    );
                    list.add(p);
                }
            }
            rs.close();
            statement.close();
        } catch(Exception e) {
            System.err.println("Error reading Pasien!");
            System.out.println(e);
        }
        dbCon.closeConnection();
        
        return list;
    }
    
    public void insertPasien(Pasien p) {
        con = dbCon.makeConnection();
        
        String sql = "INSERT INTO pasien(nama, ktp, no_telepon) "
                + "VALUES ("
                + "'" + p.getNama() + "', "
                + "'" + p.getKtp() + "', "
                + "'" + p.getNoTelepon() + "')";
        
        System.out.println("Adding Pasien...");
        
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added " + result + " Pasien");
            statement.close();
        } catch (Exception e) {
            System.err.println("Error adding Pasien!");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    public void updatePasien(Pasien p) {
        con = dbCon.makeConnection();
        
        String sql = "UPDATE pasien SET "
                + "nama = '" + p.getNama() + "', "
                + "ktp = '" + p.getKtp() + "', "
                + "no_telepon = '" + p.getNoTelepon() + "'"
                + "WHERE id ='" + p.getId() + "'";
        
        System.out.println("Update Pasien...");
        
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Updated " + result + " Pasien");
            statement.close();
        } catch (Exception e) {
            System.err.println("Error adding Pasien!");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    public void deletePasien(int id) {
        con = dbCon.makeConnection();
        
        String sql = "DELETE FROM pasien WHERE id = '" + id + "'";
        
        System.out.println("Delete Pasien...");
        
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Deleted " + result + " Pasien");
            statement.close();
        } catch (Exception e) {
            System.err.println("Error delete Pasien!");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    public List<Pasien> showPasienBySearch(String query) {
        con = dbCon.makeConnection();
        
        String sql = "SELECT * FROM pasien WHERE (id LIKE "
                + "'%" + query + "%'"
                + "OR nama LIKE '%" + query + "%'"
                + "OR ktp LIKE '%" + query + "%'"
                + "OR no_telepon '%" + query + "%')";
        
        System.out.println("Mengambil data Pasien...");
        
        List<Pasien> list = new ArrayList();
        
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if (rs != null) {
                while (rs.next()) {
                    Pasien p = new Pasien(
                            Integer.parseInt(rs.getString("id")),
                            rs.getString("nama"),
                            rs.getString("ktp"),
                            rs.getString("no_telepon")
                    );
                    list.add(p);
                }
            }
            rs.close();
            statement.close();
        } catch (Exception e) {
            System.err.println("Error reading database!");
            System.out.println(e);
        }
        dbCon.closeConnection();
        return list;
    }
}
