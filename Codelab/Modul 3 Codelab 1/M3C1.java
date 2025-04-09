public class M3C1 {
    public static void main (String [] args) {
        KarakterGame karakter = new KarakterGame("Karakter Umum", 100);
        Pahlawan Ph1 = new Pahlawan("Brimstone", 150);
        Musuh ms1 = new Musuh ("Viper", 200);
        System.out.println(Ph1.getName() + " Memiliki HP Sebesar " + Ph1.getHP());
        System.out.println(ms1.getName() + " Memiliki HP Sebesar " + ms1.getHP());
        Ph1.Serang(ms1);
        ms1.Serang(Ph1);
    }
}
