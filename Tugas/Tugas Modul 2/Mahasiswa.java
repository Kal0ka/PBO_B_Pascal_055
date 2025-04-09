import java.util.Scanner;
public class Mahasiswa {
    Scanner scr = new Scanner(System.in);
    String Nama;
    String Nim;
    public Mahasiswa (String Nama, String Nim) {
        this.Nama = Nama;
        this.Nim = Nim;
    }
    public void Login () {
        System.out.print("Masukan Username : ");
        String StudentName = scr.nextLine();
        System.out.print("Masukan NIM : ");
        String StudentNim = scr.nextLine();
        if (StudentName.equals(Nama) && StudentNim.equals(Nim)) {
            System.out.println("\nLogin Mahasiswa Berhasil!");
            DisplayInfo();
        } else System.out.println("Login Gagal! Nama atau NIM Salah.");
    }
    public void DisplayInfo () {
        System.out.println("Nama : " + Nama);
        System.out.println("NIM : " + Nim);
    }
}
