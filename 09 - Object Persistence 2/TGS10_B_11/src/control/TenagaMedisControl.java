package control;

import dao.TenagaMedisDAO;
import java.util.List;
import model.TenagaMedis;

/**
 * Nama : Thessalonica Angelina Meil
 * NPM  : 210711122
 * 
 * Nama : Alexis Divasonda Sigat Ngaing
 * NPM  : 210711407
 */

public class TenagaMedisControl {
    private TenagaMedisDAO tDao = new TenagaMedisDAO();
    
    public void insertDataTenagaMedis(TenagaMedis t){
        tDao.insertTenagaMedis(t);
    }
    
    public String showDataDokter(){
        List<TenagaMedis> dataTenagaMedis = tDao.showTenagaMedis();
        
        String desktopString = "";
        
        for(int i =0; i < dataTenagaMedis.size(); i++){
            if(dataTenagaMedis.get(i).getJenis().equals("Dokter"))
                desktopString = desktopString + dataTenagaMedis.get(i).showData() + "\n";
        }
        
        return desktopString;
    }
    
    public String showDataPerawat(){
        List<TenagaMedis> dataTenagaMedis = tDao.showTenagaMedis();
        
        String desktopString = "";
        
        for (int i =0; i < dataTenagaMedis.size(); i++){
            if(dataTenagaMedis.get(i).getJenis().equals("Perawat"))
                desktopString = desktopString + dataTenagaMedis.get(i).showData() + "\n";
        }
        
        return desktopString;
    }
    
    public TenagaMedis searchTenagaMedis(String idTenagaMedis) {
        TenagaMedis t = null;
        t = tDao.searchTenagaMedis (idTenagaMedis);
        
        return t;
    }
    
    public void updateDataTenagaMedis(TenagaMedis t, String idTenagaMedis){
        tDao.updateTenagaMedis(t, idTenagaMedis);
    }
    
    public void deleteDataTenagaMedis(String idTenagaMedis){
        tDao.deleteTenagaMedis(idTenagaMedis);
    }
    
    public int idDokter() { 
        List<TenagaMedis> dataTenagaMedis = tDao.showTenagaMedis();
                 
        String temp = null;

        for (int i =0; i < dataTenagaMedis.size(); i++){
            if (dataTenagaMedis.get(i).getJenis().equals("Dokter"))
                    temp = dataTenagaMedis.get(i).getIdTenagaMedis();
        }
        
        if (temp != null) {
            return Integer.parseInt(temp.substring(4)) + 1;
        } else {
            return 1;
        }
    }
    
    public int idPerawat() {
        List<TenagaMedis> dataTenagaMedis = tDao.showTenagaMedis();
                 
        String temp = null;

        for (int i =0; i < dataTenagaMedis.size(); i++){
            if (dataTenagaMedis.get(i).getJenis().equals("Perawat"))
                    temp = dataTenagaMedis.get(i).getIdTenagaMedis();
        }
        
        if (temp != null) {
            return Integer.parseInt(temp.substring(4)) + 1;
        } else {
            return 1;
        }
    }

    public List<TenagaMedis> showAllTenagaMedis() {
        List<TenagaMedis> dataTenagaMedis = tDao.showTenagaMedis();
        return dataTenagaMedis;
    }
}
