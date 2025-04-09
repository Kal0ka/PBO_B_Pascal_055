import java.util.Scanner;
public class Admin1 extends User {
    Scanner scan = new Scanner(System.in);
    private String username;
    private String pass;
    public Admin1 (String name, String nim, String username, String pass) {
        super (name, nim);
        this.username = username;
        this.pass = pass;
    }
    @Override
    public void login () {
        System.out.print("Masukan Username : ");
        String AdminInput = scan.nextLine();
        System.out.print("Masukan Password : ");
        String AdminPass = scan.nextLine();
        if (AdminInput.equals(username) && AdminPass.equals(pass)) {
            displayInfo();
        } else System.out.println("Login Gagal! Usename atau Password Salah.");
    }
    @Override
    public void displayInfo () {
        System.out.println("\nLogin Admin Berhasil!");
        System.out.println ("Username : " + username);
        System.out.println ("Password : " + pass);
    }
}
