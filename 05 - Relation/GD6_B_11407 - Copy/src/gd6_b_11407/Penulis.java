package gd6_b_11407;

/**
 *
 * @author Alexis Divasonda Sigat Ngaing
 */
public class Penulis {
    private String namaPena, email;
    
    public Penulis(String namaPena, String email) {
        this.namaPena = namaPena;
        this.email = email;
    }
    
    public void showPenulis() {
        System.out.println("Nama Pena Penulis : " + namaPena);
        System.out.println("Email             : " + email);
    }
}
