import java.util.Scanner;
public class RekeningBank {
    Scanner scr = new Scanner(System.in);
    String NomorRekening;
    String NamaPemilik;
    double Saldo = 0;
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
    public void setor () {
        System.out.print("Masukan Nominal : ");
        double NewSaldo = scr.nextDouble();
        Saldo += NewSaldo;
        System.out.println(NamaPemilik + " Menyetor Rp." + NewSaldo + " Saldo Sekarang : " + Saldo);
    }
    public void tarik () {
        System.out.print("Masukan Nominal : ");
        double SaldoAmbil = scr.nextDouble();

        if (Saldo > SaldoAmbil) {
            Saldo -= SaldoAmbil;
            System.out.println(NamaPemilik + " Menarik Saldo Sejumlah : Rp." + SaldoAmbil + " Saldo Sekarang : Rp." + Saldo);
        }else if (Saldo < SaldoAmbil) {
            System.out.println(NamaPemilik + " Menarik Saldo Sejumlah : Rp." + SaldoAmbil + " (Gagal! Saldo tidak mencukupi) Saldo Sekarang : Rp." + Saldo);
        }
    }
}
