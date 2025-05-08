package com.praktikum.main;
import com.praktikum.users.User;
import com.praktikum.users.Mahasiswa;
import com.praktikum.users.Admin;
import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        User user = null;
        User mhs = new Mahasiswa("Loka", "202410370110055");
        User adm = new Admin("Loka", "Loka2005");
        while (user == null) {
            System.out.println("Pilih Login\n1. Admin\n2. Mahasiswa");
            System.out.print("Masukan Pilihan : ");
            int Pilihan = scan.nextInt();
            scan.nextLine();
            if (Pilihan == 1) {
                if (((Admin) adm).login()) {
                    user = adm;
                } else {
                    System.out.println("Username Atau Password Salah!.");
                }
            } else if (Pilihan == 2) {
                if (((Mahasiswa) mhs).login()) {
                    user = mhs;
                } else {
                    System.out.println("Nama Atau NIM Salah!.");
                }
            } else {
                System.out.println("Pilihan tidak valid. Coba lagi.");
            }
        }
        user.displayAppMenu();
    }
}
