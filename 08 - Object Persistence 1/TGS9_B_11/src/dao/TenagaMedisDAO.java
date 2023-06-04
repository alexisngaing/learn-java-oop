package dao;

import connection.DbConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.TenagaMedis;

/**
 * Nama : Thessalonica Angelina Meil
 * NPM  : 210711122
 * 
 * Nama : Alexis Divasonda Sigat Ngaing
 * NPM  : 210711407
 */

public class TenagaMedisDAO {
     private DbConnection dbCon = new DbConnection();
     private Connection con;
     
     public void insertTenagaMedis(TenagaMedis t){
        con = dbCon.makeConnection();
        String sql = "INSERT INTO tenaga_medis(id_tenaga_medis, nama, jenis, tahunmasuk, notelepon, npaidi, ppni) " 
            + "VALUES (" 
            + "'" + t.getIdTenagaMedis() + "', " 
            + "'" + t.getNama() + "', "
            + "'" + t.getJenis() + "', " 
            + "'" + t.getTahunMasuk() + "', " 
            + "'" + t.getNoTelepon() +"', " 
            + "'" + t.getNpaidi() + "', " 
            + "'" + t.getPpni() + "')";
        
        System.out.println("Adding Tenaga Medis!");
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added " + result + " Tenaga Medis");
            statement.close();
        } catch (Exception e){
            System.err.println("Error adding Tenaga Medis!");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    public List<TenagaMedis> showTenagaMedis(){
        con = dbCon.makeConnection();
        
        String sql = "SELECT * FROM tenaga_medis";
        System.out.println("Mengambil data Tenaga Medis!");
        
        List<TenagaMedis> list = new ArrayList();
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            if (rs != null){
                while(rs.next()) {
                    TenagaMedis t = new TenagaMedis(
                            rs.getString("id_tenaga_medis"),
                            rs.getString("nama"),
                            rs.getString("jenis"),
                            Integer.parseInt(rs.getString("tahunmasuk")),
                            rs.getString("notelepon"),
                            rs.getString("npaidi"),
                            Integer.parseInt(rs.getString("ppni")) 
                    );
                    list.add(t);
                }
            }
            rs.close();
            statement.close();
        } catch(Exception e){
            System.err.println("Error reading database!");
            System.out.println(e);
        }
        dbCon.closeConnection();
        
        return list;
    }
    
    public TenagaMedis searchTenagaMedis(String idTenagaMedis){
        con = dbCon.makeConnection();
        
        String sql = "SELECT * FROM tenaga_medis WHERE id_tenaga_medis = '" + idTenagaMedis + "'";
        System.out.println("Searching Tenaga Medis...");
        
        TenagaMedis t = null;
        
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            if(rs != null) {
                while(rs.next()) {
                     t = new TenagaMedis(
                            rs.getString("id_tenaga_medis"),
                            rs.getString("nama"),
                            rs.getString("jenis"),
                            Integer.parseInt(rs.getString("tahunmasuk")),
                            rs.getString("notelepon"),
                            rs.getString("npaidi"),
                            Integer.parseInt(rs.getString("ppni")) 
                    );
                }
            }
            rs.close();
            statement.close();
        } catch(Exception e) {
            System.err.println("Error reading database!");
            System.out.println(e);
        }
        dbCon.closeConnection();
        
        return t;       
    }
    
    public void updateTenagaMedis(TenagaMedis t, String idTenagaMedis) {
        con = dbCon.makeConnection();

        String sql = "UPDATE tenaga_medis SET nama = '" + t.getNama() + "', "
                + "jenis = '" + t.getJenis() + "', "
                + "tahunmasuk = '" + t.getTahunMasuk() + "', "
                + "notelepon = '" + t.getNoTelepon() + "', "
                + "npaidi = '" + t.getNpaidi() + "', "
                + "ppni = '" + t.getPpni() + "' "
                + "WHERE id_tenaga_medis = '" + idTenagaMedis + "'";
        System.out.println("Editing Tenaga Medis!");

        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Edited " + result + " TenagaMedis" + idTenagaMedis);
            statement.close();
        } catch (Exception e) {
            System.err.println("Error editing Tenaga Medis!");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    public void deleteTenagaMedis(String idTenagaMedis) {
        con = dbCon.makeConnection();

        String sql = "DELETE FROM tenaga_medis WHERE id_tenaga_medis = '" + idTenagaMedis + "'";
        System.out.println("Deleting Tenaga Medis!");

        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Deleted " + result + " TenagaMedis" +idTenagaMedis);
            statement.close();
        } catch (Exception e) {
            System.err.println("Error deleting Tenaga Medis!");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
}
