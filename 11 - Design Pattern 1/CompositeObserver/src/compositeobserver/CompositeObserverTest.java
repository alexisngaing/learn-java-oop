package compositeobserver;

import java.io.*;

public class CompositeObserverTest {
    public static void main(String[] args) throws IOException {

        Asuransi kis = new Asuransi();
        Employee direktur = new Manager("Arief Nugraha", "Direktur", kis);
        Employee mankeu = new Manager("Suryana", "Manajer Keuangan", kis);
        Employee mansdm = new Manager("Susila","Manajer SDM", kis);
        Employee kaakun = new Manager("Septarini","Kabag Akuntansi", kis);
        Employee kaaudt = new Manager("Herjuna","Kabag Audit", kis);
        Employee kapsdm = new Manager("Dewi Yani", "Kabag SDM", kis);
        Employee kaprom = new Manager("Eleonora", "Kabag Promosi", kis);
        Employee skeu1  = new Staf("Panduwinata", "Staf Keuangan", kis);
        Employee skeu2  = new Staf("Megadewi", "Staf Keuangan", kis);
        Employee ssdm1  = new Staf("Trifina", "Staf SDM", kis);
        Employee ssdm2  = new Staf("Kanda", "Staf SDM", kis);
        Employee ssdm3  = new Staf("Arjuna", "Staf SDM", kis);

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
