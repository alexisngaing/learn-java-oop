public class Main {
    public static void main(String[] args) {
//        BasicGeneric<String> basicGeneric = new BasicGeneric<String>("Hello World");
//        System.out.println("Data String : " + basicGeneric.getData());
//
//        BasicGeneric<Integer> basicGeneric2 = new BasicGeneric<Integer>(123);
//        System.out.println("Data Integer : " + basicGeneric2.getData());

        BasicGeneric<Integer> basicGeneric = new BasicGeneric<Integer>(100);
        System.out.println("Data Integer : " + basicGeneric.getData());

        BasicGeneric<Double> basicGeneric2 = new BasicGeneric<Double>(5.42);
        System.out.println("Data Double : " + basicGeneric2.getData());
    }
}