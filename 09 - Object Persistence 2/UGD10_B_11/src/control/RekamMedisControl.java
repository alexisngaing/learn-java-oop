package control;

/**
 * Nama : Thessalonica Angelina Meil
 * NPM  : 210711122
 * 
 * Nama : Alexis Divasonda Sigat Ngaing
 * NPM  : 210711407
 */

import dao.RekamMedisDAO;
import java.util.List;
import model.RekamMedis;
import table.TableRekamMedis;

public class RekamMedisControl {
    private RekamMedisDAO rmDao = new RekamMedisDAO();
    
    public void insertRekamMedis(RekamMedis rm) {
        rmDao.insertRekamMedis(rm);
    }
    
    public TableRekamMedis showRekamMedis(String query) {
        List<RekamMedis> dataRekamMedis = rmDao.showRekamMedis(query);
        TableRekamMedis tableRekamMedis = new TableRekamMedis(dataRekamMedis);
        
        return tableRekamMedis;
    }
    
    public void updateRekamMedis(RekamMedis rm){
        rmDao.updateRekamMedis(rm);
    }
    
    public void deleteRekamMedis(int id){
        rmDao.deleteRekamMedis(id);
    }
}
