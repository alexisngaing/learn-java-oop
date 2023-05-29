package gd12_b_11407_1;

import java.util.ArrayList;

public class Kepala implements IComposite {
    private String namaKepala;
    private ArrayList<IComposite> bawahan;
    
    public Kepala(String namaKepala) {
        this.namaKepala = namaKepala;
        this.bawahan = new ArrayList<IComposite>();
    }
    
    public void tambahBawahan(IComposite comp) {
        bawahan.add(comp);
    }
    
    @Override
    public void showData() {
        System.out.println(IComposite.space + " Bapak Kepala " + namaKepala);
        IComposite.space.append("   ");
        
        for (IComposite comp : bawahan) {
            System.out.println(IComposite.space + " Bawahan dari " + namaKepala + " ");
            comp.showData();
        }
        IComposite.space.setLength(IComposite.space.length() - 3);
    }
}
