package diskusi74;

public class InvalidRadiusException extends Exception {
    private double radius;

    public InvalidRadiusException(double _radius) {
        radius = _radius;
    }
    public void printError() {
        System.out.println("Radius [" + radius + "] tidak boleh nol");
    }
}
