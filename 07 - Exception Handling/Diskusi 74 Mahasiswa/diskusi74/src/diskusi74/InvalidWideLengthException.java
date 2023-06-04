package diskusi74;

public class InvalidWideLengthException extends Exception {
    private double w;

    public InvalidWideLengthException(double wide) {
        w = wide;
    }

    public void printError() {
        System.out.println("Panjang [" + w + "] tidak boleh nol");
    }
}
