package gd7_b_11407;

/**
 *
 * @author Alexis Divasonda S. N.
 */
public class GD7_B_11407 {

    public static void main(String[] args) {
        Generic<String> G1 = new Generic<String>("Motor");
        System.out.println("Data String adalah " + G1.getValue());
        
        Generic<Integer> G2 = new Generic<Integer>(2012);
        System.out.println("Data Integer adalah " + G2.getValue());
        
        Generic<Double> G3 = new Generic<Double>(88.8);
        System.out.println("Data Double adalah " + G3.getValue());
        
        Generic<Float> G4 = new Generic<Float>(87.9f);
        System.out.println("Data Float adalah " + G4.getValue());
        
        Generic<Boolean> G5 = new Generic<Boolean>(true);
        System.out.println("Data Boolean adalah " + G5.getValue());
       
        Generic<Character> G6 = new Generic<Character>('A');
        System.out.println("Data Character adalah " + G6.getValue());

        PairTwo<String, Integer> P1 = new PairTwo<String, Integer>("Motor", 2013);
        System.out.println("\nSalah satu kendaraan beroda dua adalah " + P1.getValue1() +
                           "\nKendaraan tersebut dibuat pada tahun " + P1.getValue2());
        
        Mobil mobil = new Mobil("Sedan", 4);
        PairTwo<String, Mobil> P2 = new PairTwo<String, Mobil>("Empat", mobil);
        System.out.println("\nMobil itu beroda "+P2.getValue1() +
                           " Berjenis " + P2.getValue2().getNama() + ", memiliki kapasitas " +
                           P2.getValue2().getKapasitas() + " Penumpang");
        
        PairThree<String, Character, Double> PT3 = new PairThree<String, Character, Double>("Enam", 'B', 200.1,2013);
        System.out.println("\nKendaraan itu beroda "+PT3.getValue1() + ", berplat " + PT3.getValue2() +
                           ", memiliki bobot " + PT3.getValue3() + " dan dibuat pada tahun " + PT3.getValue4());
    }
}
