public class Hewan {
    String Nama, Jenis, Suara;
    // Constructor
    public Hewan (String Nama, String Jenis, String Suara) {
        this.Nama = Nama;
        this.Jenis = Jenis;
        this.Suara = Suara;
    }
    // TampilkanInfo Untuk menampilkan Informasi Hewan
    public void TampilkanInfo () {
        System.out.println("Nama : " + Nama);
        System.out.println("Jenis : " + Jenis);
        System.out.println("Suara : " + Suara + "\n");
    }
}