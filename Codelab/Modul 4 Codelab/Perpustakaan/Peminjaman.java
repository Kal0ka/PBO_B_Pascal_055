package Perpustakaan;

public interface Peminjaman {
    void pinjamBuku(String judul);
    void pinjamBuku(String judul, int lamaHari);
    void kembalikanBuku(String judul);
}