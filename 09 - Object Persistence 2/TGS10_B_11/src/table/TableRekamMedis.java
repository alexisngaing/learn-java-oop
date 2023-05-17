package table;

/**
 * Nama : Thessalonica Angelina Meil
 * NPM  : 210711122
 * 
 * Nama : Alexis Divasonda Sigat Ngaing
 * NPM  : 210711407
 */

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.RekamMedis;

public class TableRekamMedis extends AbstractTableModel {
    private List<RekamMedis> list;

    public TableRekamMedis(List<RekamMedis> list) {
        this.list = list;
    }

    @Override
    public int getRowCount() {
        return list.size();
    }
    
    @Override
    public int getColumnCount(){
        return 8;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0 :
                return list.get(rowIndex).getTenagaMedis().getNama();
            case 1 :
                return list.get(rowIndex).getTenagaMedis().getJenis();
            case 2 :
                return list.get(rowIndex).getPasien().getNama();
            case 3 :
                return list.get(rowIndex).getDiagnosis();
            case 4 :
                return list.get(rowIndex).getTotalBiaya();
            case 5 :
                return list.get(rowIndex).getTindakan();
            case 6 :
                return list.get(rowIndex).getTenagaMedis().getNpaidi();
            case 7 :
                return list.get(rowIndex).getTenagaMedis().getPpni();
            case 8 :
                return list.get(rowIndex).getId();
            case 9 :
                return list.get(rowIndex).getTenagaMedis().getIdTenagaMedis();
            case 10 :
                return list.get(rowIndex).getPasien().getId();
            default :
                return null;
        }
    }
    
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0 :
                return "Nama Tenaga Medis";
            case 1 :
                return "Jenis Tenaga Medis";
            case 2 :
                return "Nama Pasien";
            case 3 :
                return "Diagnosis";
            case 4 :
                return "Total Biaya";
            case 5 :
                return "Tindakan";
            case 6 :
                return "NPAIDI";
            case 7 :
                return "PPNI";
            default :
                return null;
        } 
    }
}
