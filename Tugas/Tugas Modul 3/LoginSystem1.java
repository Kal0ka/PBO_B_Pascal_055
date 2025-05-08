import java.util.Scanner;
public class LoginSystem1 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        Mahasiswa1 mhs = new Mahasiswa1("Loka", "202410370110055");
        Admin1 adm = new Admin1("", "", "Loka", "Loka2005");
        System.out.println("Pilih Login\n1. Admin\n2. Mahasiswa");
        System.out.print("Masukan Pilihan : ");
        int Pilihan = scan.nextInt();
        if (Pilihan == 1) {
            adm.login();
        } else if (Pilihan == 2) {
            mhs.login();
        }

    }
}
