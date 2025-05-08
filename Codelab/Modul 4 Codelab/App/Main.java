package App;

import Perpustakaan.*;

public class Main {
    public static void main(String[] args) {
        // Membuat objek buku
        Buku buku1 = new NonFiksi("Soekarno", "Radja", "Sejarah & Ilmu Pengetahuan");
        Buku buku2 = new Fiksi("Kancil & Buaya", "Lilis Hu", "Dongeng");


        buku1.displayInfo();
        buku2.displayInfo();

        System.out.println();


        Anggota anggota1 = new Anggota("Pascal Kaloka", "B055");
        Anggota anggota2 = new Anggota("Bazz", "B000");


        anggota1.displayInfo();
        anggota2.displayInfo();

        System.out.println();


        anggota1.pinjamBuku("Soekarno");
        anggota2.pinjamBuku("Kancil & Buaya", 7);

        System.out.println();


        anggota1.kembalikanBuku("Soekarno");
        anggota2.kembalikanBuku("Kancil & Buaya");
    }
}
