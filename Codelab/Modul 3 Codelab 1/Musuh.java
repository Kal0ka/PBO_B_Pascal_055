public class Musuh extends KarakterGame{
    public Musuh (String Name, int HP) {
        super(Name, HP);
    }
    @Override
    public void Serang (KarakterGame Target) {
        System.out.println (getName() + " Menyerang " + Target.getName() + " Menggunakan pedang.");
        Target.setHP(Target.getHP() - 25);
        System.out.println (Target.getName() + " Memiliki Sisa HP " + Target.getHP());
    }

}
