package diskusi74;

public class Lingkaran extends Bentuk2D {

    private double jejari;

    public Lingkaran(double centreX, double centreY, double radius )  throws InvalidRadiusException, InvalidWideLengthException {
        if (radius < 0 ) {
            throw new InvalidRadiusException(radius);
        } else if (radius == 0 ) {
            throw new InvalidWideLengthException(radius);
        }
    }

    public Lingkaran(double _jejari) {
        jejari = _jejari;
    }

    public double luas() {
        return 3.14 * jejari * jejari;
    }

    public double keliling() {
        return 2 * 3.15 * jejari;
    }

    public void display() {
        System.out.println("Luas Lingkaran : " + luas());
        System.out.println("Keliling Lingkaran : " + keliling());
    }
}

