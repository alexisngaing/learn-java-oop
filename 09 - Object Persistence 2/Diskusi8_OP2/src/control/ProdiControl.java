package control;

import java.util.List;
import dao.ProdiDAO;
import entity.Prodi;

public class ProdiControl {
    private ProdiDAO pDao = new ProdiDAO();
    
    public void insertDataProdi(Prodi p) {
        pDao.insertProdi(p);
    }
    
    public String showDataProdi() {

    List<Prodi> dataProdi = pDao.showProdi();

    String prodiString = "";

    for (int i=0; i < dataProdi.size(); i++) {
        prodiString = prodiString + dataProdi.get(i).getKodeProdi() + " || " 
                + dataProdi.get(i).getNamaProdi() + "\n";
    }

    return prodiString;
    }
    
    public List<Prodi> showListProdi() {
        List<Prodi> dataProdi = pDao.showProdi();
        return dataProdi;
    }
    
    public void updateDataProdi(Prodi p) {
        pDao.updateProdi(p);
    }
    
    public void deleteDataProdi(String kodeProdi) {
        pDao.deleteProdi(kodeProdi);
    }
    
    public Prodi searchDataProdi(String kodeProdi) {
        Prodi p = null;
        p = pDao.searchProdi(kodeProdi);
        return p;
    }
}
