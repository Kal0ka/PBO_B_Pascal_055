public class RekeningBank {
    String NomorRekening;
    String NamaPemilik;
    double Saldo;
    public RekeningBank (String NomorRekening, String NamaPemilik, double Saldo) {
        this.NomorRekening = NomorRekening;
        this.NamaPemilik = NamaPemilik;
        this.Saldo = Saldo;
    }
    public void Info () {
        System.out.println("Nomor Rekening : " + NomorRekening);
        System.out.println("Nama Pemilik : " + NamaPemilik);
        System.out.println("Saldo : Rp." + Saldo + "\n");
    }
    public void setorUang (double jumlah) {
        Saldo += jumlah;
        System.out.println(NamaPemilik + " Menyetor Rp." + jumlah + " Saldo Sekarang : " + Saldo);
    }
    public void tarikUang(double jumlah) {
        if (Saldo > jumlah) {
            Saldo -= jumlah;
            System.out.println(NamaPemilik + " Menarik Saldo Sejumlah : Rp." + jumlah + " Saldo Sekarang : Rp." + Saldo);
        }else if (Saldo < jumlah) {
            System.out.println(NamaPemilik + " Menarik Saldo Sejumlah : Rp." + jumlah + " (Gagal! Saldo tidak mencukupi) Saldo Sekarang : Rp." + Saldo);
        }
    }
}
