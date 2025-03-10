public class MainC2M2 {
    public static void main (String[] args) {
        RekeningBank Rb1 = new RekeningBank("202410370110055", "Pascal", 0);
        RekeningBank Rb2 = new RekeningBank("202410370110000", "Loka", 0);
        Rb1.Info();
        Rb2.Info();
        Rb1.setorUang(200000);
        Rb2.setorUang(500000);
        Rb1.tarikUang(100000);
        Rb2.tarikUang(600000);

    }
}
