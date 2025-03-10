public class MainC1M2 {
    public static void main (String[] args) {
        // Membuat Object Hewan 1 dan Hewan 2
        Hewan hewan1 = new Hewan("Kucing","Mamalia","Nyaan~~");
        Hewan hewan2 = new Hewan("Anjing","Mamalia","Woof~~");
        // Memanggil Metode TampilkanInfo()
        hewan1.TampilkanInfo();
        hewan2.TampilkanInfo();
    }
}