package control;

import dao.MataKuliahDAO;
import java.util.List;
import model.MataKuliah;
import table.TableMataKuliah;

public class MataKuliahControl {
    private MataKuliahDAO mkDao = new MataKuliahDAO();
    
    public void insertDataMataKuliah(MataKuliah mk){
        mkDao.insertMataKuliah(mk);
    }
    
    public TableMataKuliah showMataKuliah(String query) {
        List<MataKuliah> dataMataKuliah = mkDao.showMataKuliah(query);
        TableMataKuliah tableMataKuliah = new TableMataKuliah(dataMataKuliah);
        
        return tableMataKuliah;
    }
    
    public void updateDataMataKuliah(MataKuliah mk){
        mkDao.updateMataKuliah(mk);
    }
    public void deleteDataMataKuliah(int id){
        mkDao.deleteMataKuliah(id);
    }
}
