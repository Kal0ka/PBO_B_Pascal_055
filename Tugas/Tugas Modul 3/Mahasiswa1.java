import java.util.Scanner;
public class Mahasiswa1 extends User {
    Scanner scan = new Scanner (System.in);
    public Mahasiswa1 (String name, String nim) {
        super(name, nim);
    }
    @Override
    public void login () {
        System.out.print("Masukan Nama : ");
        String StudentName = scan.nextLine();
        System.out.print("Masukan NIM : ");
        String StudentNim = scan.nextLine();
        if (StudentName.equals(getName()) && StudentNim.equals(getNim())) {
            displayInfo();
        } else System.out.println("Login Gagal! Nama atau NIM Salah.");
    }
    @Override
    public void displayInfo () {
        System.out.println("\nLogin Mahasiswa Berhasil!");
        System.out.println ("Nama Mahasiswa : " + getName());
        System.out.println ("NIM : " + getNim());
    }
}
