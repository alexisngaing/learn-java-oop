package gdsingleton_b_1407;

public class Database {
    private static Database dbInstance = null;
    private String dbCon, dbName;

    private Database(String dbCon, String dbName) {
        this.dbCon = dbCon;
        this.dbName = dbName;
    }

    public static Database getInstance(String dbCon, String dbName) {
        System.out.println("\nMembuat objek database baru...");

        if (Database.dbInstance == null) {
            Database.dbInstance = new Database(dbCon, dbName);
            System.out.println("Objek database berhasil dibuat");
            System.out.println("Connection : " + dbCon);
            System.out.println("DB name    : " + dbName);
        } else {
            System.out.println("Objek database gagal dibuat karena sudah");
            System.out.println("ada objek database yang dibuat sebelumnya!");
            System.out.println("Connection : " + dbCon);
            System.out.println("DB name    : " + dbName);
        }
        return Database.dbInstance;
    }
}
