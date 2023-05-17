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
            System.err.println("Error show data Pasien!");
            System.out.println(e);
        }
        dbCon.closeConnection();
        
        return list;
    }
}
