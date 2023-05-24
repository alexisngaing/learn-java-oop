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
import model.RekamMedis;
import model.TenagaMedis;
import model.Pasien;

public class RekamMedisDAO {
    private DbConnection dbCon = new DbConnection();
    private Connection con;
     
    public void insertRekamMedis(RekamMedis rm) {
        con = dbCon.makeConnection();
        String sql = "INSERT INTO rekam_medis(id_tenaga_medis, id_pasien, diagnosis, total_biaya, tindakan) " 
            + "VALUES (" 
            + "'" + rm.getTenagaMedis().getIdTenagaMedis() + "', " 
            + "'" + rm.getPasien().getId() + "', "
            + "'" + rm.getDiagnosis() + "', " 
            + "'" + rm.getTotalBiaya() + "', " 
            + "'" + rm.getTindakan() + "')";
        
        System.out.println("Adding Rekam Medis...");
        
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added " + result + " Rekam Medis");
            statement.close();
        } catch (Exception e) {
            System.err.println("Error adding Tenaga Medis!");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }



    public List<RekamMedis> showRekamMedis(String query) {
        con = dbCon.makeConnection();

        String sql = "SELECT rm.*, tm.*, p.* FROM rekam_medis as rm JOIN tenaga_medis as tm ON rm.id_tenaga_medis = tm.id_tenaga_medis JOIN pasien as p ON rm.id_pasien = p.id WHERE (tm.nama LIKE "
                + "'%" + query + "%'"
                + "OR tm.jenis LIKE '%" + query + "%'"
                + "OR p.nama LIKE '%" + query + "%'"
                + "OR rm.diagnosis LIKE '%" + query + "%'"
                + "OR rm.total_biaya LIKE '%" + query + "%'"
                + "OR rm.tindakan LIKE '%" + query + "%'"
                + "OR tm.npaidi LIKE '%" + query + "%'"
                + "OR tm.ppni LIKE '%" + query + "%')"
                + "ORDER BY rm.id";

        System.out.println("Mengambil data Rekam Medis...");

        List<RekamMedis> list = new ArrayList();

        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            if (rs != null) {
                while (rs.next()) {
                    TenagaMedis tm = new TenagaMedis(
                            rs.getString("tm.id_tenaga_medis"),
                            rs.getString("tm.nama"),
                            rs.getString("tm.jenis"),
                            Integer.parseInt(rs.getString("tm.tahunmasuk")),
                            rs.getString("tm.notelepon"),
                            rs.getString("tm.npaidi"),
                            Integer.parseInt(rs.getString("tm.ppni"))
                    );

                    Pasien p = new Pasien(
                            Integer.parseInt(rs.getString("p.id")),
                            rs.getString("p.nama"),
                            rs.getString("p.ktp"),
                            rs.getString("p.no_telepon")
                    );

                    RekamMedis rm = new RekamMedis(
                            Integer.parseInt(rs.getString("rm.id")),
                            rs.getString("rm.diagnosis"),
                            Float.parseFloat(rs.getString("rm.total_biaya")),
                            rs.getString("rm.tindakan"), tm, p
                    );
                    list.add(rm);
                }
            }
            rs.close();
            statement.close();
        } catch(Exception e) {
            System.err.println("Error reading database!");
            System.out.println(e);
        }
        dbCon.closeConnection();

        return list;
    }
    
    public void updateRekamMedis(RekamMedis rm){
        con = dbCon.makeConnection();

        String sql = "UPDATE rekam_medis SET "
                + "id_tenaga_medis = '" + rm.getTenagaMedis().getIdTenagaMedis() + "', "
                + "id_pasien = '" + rm.getPasien().getId() + "', "
                + "diagnosis = '" + rm.getDiagnosis() + "', "
                + "total_biaya = '" + rm.getTotalBiaya() + "', "
                + "tindakan = '" + rm.getTindakan() + "'"
                + "WHERE id = '" + rm.getId() + "'";

        System.out.println("Update Rekam Medis...");

        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Updated " + result + " Rekam Medis");
            statement.close();
        } catch (Exception e) {
            System.err.println("Error update Rekam Medis!");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }

    public void deleteRekamMedis(int id){
        con = dbCon.makeConnection();

        String sql = "DELETE FROM rekam_medis WHERE id = '" + id + "'";

        System.out.println("Deleting Rekam Medis...");

        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Delete " + result + " Rekam Medis");
            statement.close();
        } catch (Exception e) {
            System.err.println("Error delete Rekam Medis!");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
}
