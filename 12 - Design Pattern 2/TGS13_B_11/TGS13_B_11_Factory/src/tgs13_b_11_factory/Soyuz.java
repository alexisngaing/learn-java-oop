package tgs13_b_11_factory;

/**
 *
 * @author yamacat
 */
public abstract class Soyuz {
    protected String docking;
    protected int daya;
    protected double tangkiOksigen;
    protected String fungsiKhusus;

    public Soyuz(String docking, int daya, double tangkiOksigen, String fungsiKhusus) {
        this.docking = docking;
        this.daya = daya;
        this.tangkiOksigen = tangkiOksigen;
        this.fungsiKhusus = fungsiKhusus;
    }

    public abstract void showData();
}
