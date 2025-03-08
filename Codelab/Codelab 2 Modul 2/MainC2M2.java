public class MainC2M2 {
    public static void main (String[] args) {
        RekeningBank Rb1 = new RekeningBank("202410370110055", "Pascal", 0);
        RekeningBank Rb2 = new RekeningBank("202410370110000", "Loka", 0);
        Rb1.Info();
        Rb1.setor();
        Rb1.tarik();
        Rb2.Info();
        Rb2.setor();
        Rb2.tarik();
    }
}
