package diskusi74;

public class Segitiga extends Bentuk2D {

    private double alas;
    private double tinggi;

    public Segitiga(double _alas, double _tinggi) {
        alas = _alas;
        tinggi = _tinggi;
    }

    public double luas() {
        return 0.5 * alas * tinggi;
    }

    public double keliling() {
        //double sisi = Math.sqrt((alas*alas)+(tinggi*tinggi));
        return alas + alas + alas;//diumpamakan segitiga sama sisi
    }

    public void display() {
        System.out.println("Luas Segitiga : " + luas());
        System.out.println("Keliling Segitiga : " + keliling());
    }
}
