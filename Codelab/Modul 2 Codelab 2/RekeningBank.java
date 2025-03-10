// Kelas RekeningBank
public class RekeningBank {
    // Atribut
    String NomorRekening, NamaPemilik;
    double Saldo;
    // Constructor
    public RekeningBank (String NomorRekening, String NamaPemilik, double Saldo) {
        this.NomorRekening = NomorRekening;
        this.NamaPemilik = NamaPemilik;
        this.Saldo = Saldo;
    }
    // Metode Menampilkan Info
    public void Info () {
        System.out.println("Nomor Rekening : " + NomorRekening);
        System.out.println("Nama Pemilik : " + NamaPemilik);
        System.out.println("Saldo : Rp." + Saldo + "\n");
    }
    // Metode Setor Uang
    public void setorUang (double jumlah) {
        Saldo += jumlah;
        System.out.println(NamaPemilik + " Menyetor Rp." + jumlah + " Saldo Sekarang : " + Saldo);
    }
    // Metode Tarik Uang
    public void tarikUang(double jumlah) {
        if (Saldo > jumlah) {
            Saldo -= jumlah;
            System.out.println(NamaPemilik + " Menarik Saldo Sejumlah : Rp." + jumlah + " Saldo Sekarang : Rp." + Saldo);
        }else if (Saldo < jumlah) {
            System.out.println(NamaPemilik + " Menarik Saldo Sejumlah : Rp." + jumlah + " (Gagal! Saldo tidak mencukupi) Saldo Sekarang : Rp." + Saldo);
        }
    }
}
