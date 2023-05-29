package gd12_b_11407_2;

public abstract class Observer {
    protected Perusahaan model;
    protected String namaPgw;
    protected float gaji;
    
    public Observer(Perusahaan model, float gaji, String namaPgw) {
        this.model = model;
        this.gaji = gaji;
        this.namaPgw = namaPgw;
        this.model.registerObserver(this);
    }
    
    public abstract void update(float bonus);
}
