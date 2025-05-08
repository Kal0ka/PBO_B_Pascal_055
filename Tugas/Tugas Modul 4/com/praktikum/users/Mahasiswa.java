package com.praktikum.users;
import java.util.Scanner;
import com.praktikum.actions.MahasiswaActions;

public class Mahasiswa extends User implements MahasiswaActions {
    Scanner scan = new Scanner (System.in);
    public Mahasiswa (String name, String nim) {
        super (name, nim);
    }
    @Override
    public void reportItem() {
        System.out.print("Nama Barang : ");
        String namaBarang = scan.nextLine();
        System.out.print("Deskripsi Barang : ");
        String deskripsi = scan.nextLine();
        System.out.print("Lokasi Ditemukan : ");
        String lokasiBarang = scan.nextLine();
    }
    @Override
    public void viewReportedItems() {
        System.out.println("Fitur Lihat Laporan Belum Tersedia");
    }
    @Override
    public void displayAppMenu() {
        int pilih = -1;
        while (pilih != 0) {
            System.out.println("1. Laporkan Barang Hilang");
            System.out.println("2. Lihat Daftar Laporan");
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
                reportItem();
            } else if (pilih == 2) {
                viewReportedItems();
            } else if (pilih == 0) {
                System.out.println("Anda Berhasil Keluar");
            } else {
                System.out.println("Mohon Masukan Pilihan Yang Benar!");
            }
        }
        scan.close();
    }
    @Override
    public boolean login() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan Nama : ");
        String StudentName = scan.nextLine();
        System.out.print("Masukan NIM : ");
        String StudentNim = scan.nextLine();
        if (StudentName.equals(getName()) && StudentNim.equals(getNim())) {
            System.out.println("Login Berhasil!");
            return true;
        } else {
            System.out.println("Login Gagal!.");
            return false;
        }
    }
}
