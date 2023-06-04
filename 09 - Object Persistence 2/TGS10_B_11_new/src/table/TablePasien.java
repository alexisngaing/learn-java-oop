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
import model.Pasien;

public class TablePasien extends AbstractTableModel {
    private List<Pasien> list;
    
    public TablePasien(List<Pasien> list) {
        this.list = list;
    }
    
    public int getRowCount() {
        return list.size();
    }
    
    public int getColumnCount() {
        return 4;
    }
    
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0 :
                return list.get(rowIndex).getId();
            case 1 :
                return list.get(rowIndex).getNama();
            case 2 :
                return list.get(rowIndex).getKtp();
            case 3 :
                return list.get(rowIndex).getNoTelepon();
            default :
                return null;
        }
    }
    
    public String getColumnName(int column) {
        switch (column) {
            case 0 :
                return "ID";
            case 1 :
                return "Nama";
            case 2 :
                return "No. KTP";
            case 3 :
                return "No. Telepon";
            default :
                return null;
        }
    }
}
