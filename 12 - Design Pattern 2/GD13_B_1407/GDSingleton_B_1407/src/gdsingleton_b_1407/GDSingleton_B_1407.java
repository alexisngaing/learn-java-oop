package gdsingleton_b_1407;

public class GDSingleton_B_1407 {

    public static void main(String[] args) {
        Database db1 = Database.getInstance("MySQL", "UAJY");
        Database db2 = Database.getInstance("PostgreSQL", "UAJY");
    }
}
