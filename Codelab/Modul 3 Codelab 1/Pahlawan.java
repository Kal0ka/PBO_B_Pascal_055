public class Pahlawan extends KarakterGame {
    public Pahlawan(String Name, int HP) {
        super(Name, HP);
    }
    @Override
    public void Serang (KarakterGame Target) {
        System.out.println (getName() + " Menyerang " + Target.getName() + " Menggunakan pedang.");
        Target.setHP(Target.getHP() - 20);
        System.out.println (Target.getName() + " Memiliki Sisa HP " + Target.getHP());
    }
}
