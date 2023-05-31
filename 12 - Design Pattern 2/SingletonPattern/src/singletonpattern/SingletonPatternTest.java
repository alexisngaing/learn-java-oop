package singletonpattern;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SingletonPatternTest {
    public static void main(String[] args) throws IOException {

        EmployeeFactory ef = new EmployeeFactory();
//        Asuransi kis = new Asuransi();
        Asuransi kis = Asuransi.getInstance();
        Asuransi kis2 = Asuransi.getInstance();
        Employee direktur = ef.create("Manager", "Arief Nugraha", "Direktur", kis);
        Employee mankeu = ef.create ("Manager", "Suryana", "Manajer Keuangan", kis);
        Employee mansdm = ef.create ("Manager", "Susila","Manajer SDM", kis);
        Employee kaakun = ef.create ("Manager", "Septarini","Kabag Akuntansi", kis);
        Employee kaaudt = ef.create ("Manager", "Herjuna","Kabag Audit", kis);
        Employee kapsdm = ef.create ("Manager", "Dewi Yani", "Kabag SDM", kis);
        Employee kaprom = ef.create ("Manager", "Eleonora", "Kabag Promosi", kis);
        Employee skeu1  = ef.create ("Staf", "Panduwinata", "Staf Keuangan", kis);
        Employee skeu2  = ef.create ("Staf", "Megadewi", "Staf Keuangan", kis);
        Employee ssdm1  = ef.create ("Staf", "Trifina", "Staf SDM", kis);
        Employee ssdm2  = ef.create ("Staf", "Kanda", "Staf SDM", kis);
        Employee ssdm3  = ef.create ("Staf", "Arjuna", "Staf SDM", kis);

        direktur.addChild(mankeu); direktur.addChild(mansdm);
        mankeu.addChild(kaakun); mankeu.addChild(kaaudt);
        kaakun.addChild(skeu1);
        kaaudt.addChild(skeu2);
        mansdm.addChild(kapsdm); mansdm.addChild(kaprom);
        kapsdm.addChild(ssdm1); kapsdm.addChild(ssdm2);
        kaprom.addChild(ssdm3);

        direktur.traverseEmp();

        InputStreamReader values = new InputStreamReader (System.in);
        BufferedReader br = new BufferedReader(values);

        do {
            System.out.print("\nInput kenaikan premi [0..1] : ");
            String valueStr = br.readLine();
            if (valueStr.equalsIgnoreCase("00"))
                break;
            kis.setState(Float.parseFloat(valueStr));
            direktur.traverseEmp();
        } while(true);
    }
}
