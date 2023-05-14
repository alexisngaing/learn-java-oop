package control;

import java.util.List;
import dao.MahasiswaDAO;
import entity.Mahasiswa;
import table.TableMahasiswa;

public class MahasiswaControl {
    private MahasiswaDAO mDao = new MahasiswaDAO();
    
    public TableMahasiswa showMahasiswa(String query) {
        List<Mahasiswa> dataMahasiswa = mDao.showMahasiswa(query);
        TableMahasiswa tableMahasiswa = new TableMahasiswa(dataMahasiswa);

        return tableMahasiswa;
    }

    // method for insert mahasiswa data
    public void insertDataMahasiswa(Mahasiswa m) {
        mDao.insertMahasiswa(m);
    }
    
    // method for edit mahasiswa data
    public void updateDataMahasiswa(Mahasiswa m) {
        mDao.updateMahasiswa(m);
    }
    
    // method for delete mahasiswa data by npm
    public void deleteDataMahasiswa(String npm) {
        mDao.deleteMahasiswa(npm);
    }
}
