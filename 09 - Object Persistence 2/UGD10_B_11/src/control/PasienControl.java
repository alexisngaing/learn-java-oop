package control;

/**
 * Nama : Thessalonica Angelina Meil
 * NPM  : 210711122
 * 
 * Nama : Alexis Divasonda Sigat Ngaing
 * NPM  : 210711407
 */

import dao.PasienDAO;
import java.util.List;
import model.Pasien;

public class PasienControl {
    private PasienDAO pDao = new PasienDAO();
    
    public List<Pasien> showListPasien() {
        List<Pasien> dataPasien = pDao.showListPasien();

        return dataPasien;
    }
}
