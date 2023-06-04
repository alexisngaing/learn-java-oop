package diskusi74;

public class PersegiPanjang extends Bentuk2D {

    protected double panjang;
    protected double lebar;

    public PersegiPanjang(double _panjang, double _lebar) throws InvalidWideLengthException {
        if (_panjang < 0 || _lebar < 0) {
            throw new InvalidWideLengthException(panjang: _panjang, lebar: _lebar);
        } else {
            panjang = _panjang;
            lebar = _lebar;
        }
    }

    public double luas() {
        return panjang * lebar;
    }

    public double keliling() {
        return 2 * (panjang + lebar);
    }

    public void display() {
        System.out.println("Luas Persegi Panjang : " + luas());
        System.out.println("Keliling Persegi Panjang : " + keliling());
    }
}