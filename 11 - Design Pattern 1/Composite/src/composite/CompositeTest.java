package composite;

public class CompositeTest {

    public static void main(String[] args) {
        Employee direktur = new Manager("Arief Nugraha", "Direktur");
        Employee mankeu = new Manager("Suryana", "Manajer Keuangan");
        Employee mansdm = new Manager("Susila","Manajer SDM");
        Employee kaakun = new Manager("Septarini","Kabag Akuntansi");
        Employee kaaudt = new Manager("Herjuna","Kabag Audit");
        Employee kapsdm = new Manager("Dewi Yani", "Kabag SDM");
        Employee kaprom = new Manager("Eleonora", "Kabag Promosi");
        Employee skeu1  = new Staf("Panduwinata", "Staf Keuangan");
        Employee skeu2  = new Staf("Megadewi", "Staf Keuangan");
        Employee ssdm1  = new Staf("Trifina", "Staf SDM");
        Employee ssdm2  = new Staf("Kanda", "Staf SDM");
        Employee ssdm3  = new Staf("Arjuna", "Staf SDM");

        direktur.addChild(mankeu); direktur.addChild(mansdm);
        mankeu.addChild(kaakun); mankeu.addChild(kaaudt);
        kaakun.addChild(skeu1);
        kaaudt.addChild(skeu2);
        mansdm.addChild(kapsdm); mansdm.addChild(kaprom);
        kapsdm.addChild(ssdm1); kapsdm.addChild(ssdm2);
        kaprom.addChild(ssdm3);

        direktur.traverseEmp();
    }
}
