public class MainC2M2 {
    public static void main (String[] args) {
        // Membuat Object Rekening 1 dan Rekening 2
        RekeningBank Rekening1 = new RekeningBank("202410370110055", "Pascal", 0);
        RekeningBank Rekening2 = new RekeningBank("202410370110000", "Loka", 0);
        // Memanggil Metode Info
        Rekening1.Info();
        Rekening2.Info();
        // Memanggi Metode SetorUang
        Rekening1.setorUang(200000);
        Rekening2.setorUang(500000);
        // Memanggil TarikUang
        Rekening1.tarikUang(100000);
        Rekening2.tarikUang(600000);

    }
}
