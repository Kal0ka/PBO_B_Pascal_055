import java.util.Scanner;
import java.time.LocalDate;
public class Codelab1 {
    public static void main (String[] args) {
        Scanner scr = new Scanner (System.in);
        System.out.print("Masukan Nama : ");
        String name =scr.nextLine();
        System.out.print("Pilih Jenis Kelamin (P/L): ");
        char gender =scr.next().charAt(0);
        System.out.print("Pilih Tahun Lahir : ");
        int birth =scr.nextInt();
        scr.close();
        int thisYear = LocalDate.now().getYear();
        int age = thisYear - birth;
        String genderFix;
        if (gender == 'L' || gender == 'l') {
            genderFix = "Laki Laki";
        } else if (gender == 'P' || gender == 'p') {
            genderFix = "Perempuan";
        } else genderFix = "Tidak Diketahui";
        System.out.println("\n\nNama : " + name);
        System.out.println("Jenis Kelamin : " + genderFix);
        System.out.println("Umur : " + age + " Tahun");


    }
}
