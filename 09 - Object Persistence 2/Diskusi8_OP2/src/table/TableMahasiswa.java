package table;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import entity.Mahasiswa;

public class TableMahasiswa extends AbstractTableModel{
    private List<Mahasiswa> list;
    
    public TableMahasiswa(List<Mahasiswa> list) {
        this.list = list;
    }

    public int getRowCount() {
        return list.size();
    }
    
    public int getColumnCount() {
        return 3;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getNPM();
            case 1:
                return list.get(rowIndex).getNamaMahasiswa();
            case 2:
                return list.get(rowIndex).getProdi().getNamaProdi();
            case 3:
                return list.get(rowIndex).getProdi().getKodeProdi();
            default:
                return null;
        }
    }

    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "NPM";
            case 1:
                return "Nama Mahasiswa";
            case 2:
                return "Program Studi";
            default:
                return null;
        }
    }
}
