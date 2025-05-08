package com.praktikum.users;
import java.util.Scanner;
import com.praktikum.actions.AdminActions;

public class Admin extends User implements AdminActions {
    Scanner scan = new Scanner(System.in);
    private String username, pass;
    public Admin (String username, String pass) {
        super ("", "");
        this.username = username;
        this.pass = pass;

    }
    @Override
    public void manageItems() {
        System.out.println("Fitur Kelola Barang Belum Tersedia");
    }
    @Override
    public void manageUsers() {
        System.out.println("Fitur Kelola Mahasiswa Belum Tersedia");
    }
    @Override
    public void displayAppMenu() {
        int pilih = -1;
        while (pilih != 0) {
            System.out.println("1. Kelola Laporan Barang");
            System.out.println("2. Kelola Data Mahasiswa");
            System.out.println("0. Logout");
            System.out.print("Masukan Pilihan : ");


            if (scan.hasNextInt()) {
                pilih = scan.nextInt();
                scan.nextLine();
            } else {
                System.out.println("Input tidak valid. Harap masukkan angka.");
                scan.nextLine();
                continue;
            }

            if (pilih == 1) {
                manageItems();
            } else if (pilih == 2) {
                manageUsers();
            } else if (pilih == 0) {
                System.out.println("Anda Berhasil Keluar!");
            } else {
                System.out.println("Mohon Masukan Pilihan Yang Benar!");
            }
        }

        scan.close();
    }
    @Override
    public boolean login() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan Username : ");
        String AdminInput = scan.nextLine();
        System.out.print("Masukan Password : ");
        String AdminPass = scan.nextLine();
        if (AdminInput.equals(username) && AdminPass.equals(pass)) {
            System.out.println("Login Berhasil");
            return true;
        } else {
            System.out.println("Login Gagal!");
            return false;
        }
    }
}
