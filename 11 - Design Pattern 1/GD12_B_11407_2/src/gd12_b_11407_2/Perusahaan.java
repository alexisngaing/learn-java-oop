package gd12_b_11407_2;

import java.util.ArrayList;

public class Perusahaan {
    private String namaPerusahaan;
    private float bonus;
    private ArrayList<Observer> pegawai;
    
    public Perusahaan(String namaPerusahaan) {
        this.namaPerusahaan = namaPerusahaan;
        bonus = 0;
        this.pegawai = new ArrayList<Observer>();
    }
    
    public void registerObserver(Observer obs) {
        pegawai.add(obs);
    }
    
    public void removeObserver(Observer obs) {
        pegawai.remove(obs);
    }
    
    public void notifyObserver(float bonus) {
        for (Observer obs : pegawai) {
            obs.update(bonus);
        }
    }
    
    public void tambahBonus(float bonus) {
        this.bonus = bonus;
        notifyObserver(bonus);
    }
}
