package diskusi74;

public class Bujursangkar extends PersegiPanjang {
    
    public Bujursangkar(double _sisi) {
        super(_sisi,_sisi);
    }
    
    public void display() {
        super.display();
        System.out.println("Luas Bujursangkar : " + luas());
        System.out.println("Keliling Bujursangkar : " + keliling());
    }
}