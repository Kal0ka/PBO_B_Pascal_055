import java.util.Scanner;
public class Admin {
    Scanner scr = new Scanner(System.in);
    String Username ;
    String Password;

    public Admin (String Username, String Password){
        this.Username = Username;
        this.Password = Password;

    }
    public void Login () {
        System.out.print("Masukan Username : ");
        String AdminInput = scr.nextLine();
        System.out.print("Masukan Password : ");
        String AdminPass = scr.nextLine();
        if (AdminInput.equals(Username) && AdminPass.equals(Password)) {
            System.out.println("Login Admin Berhasil!");
        } else System.out.println("Login Gagal! Usename atau Password Salah.");
    }
}
