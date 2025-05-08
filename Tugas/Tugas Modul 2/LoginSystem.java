import java.util.Scanner;
public class LoginSystem {
    public static void main (String[] args) {
        Scanner scr = new Scanner(System.in);
        Admin admin = new Admin("Loka", "Loka200 5");
        Mahasiswa mhs = new Mahasiswa("Loka", "202410370110055");
        System.out.println("Pilih Login\n1. Admin\n2. Mahasiswa");
        System.out.print("Masukan Pilihan : ");
        int Pilihan = scr.nextInt();
        if (Pilihan == 1) {
            admin.Login();
        } else if (Pilihan == 2) {
            mhs.Login();
        }
    }
}
