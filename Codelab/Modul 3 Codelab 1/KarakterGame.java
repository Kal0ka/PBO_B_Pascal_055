public class KarakterGame {
    private String Name;
    private int HP;
    public KarakterGame(String Name,int HP) {
        setName(Name);
        setHP(HP);
    }
    public void setName (String Name) {
        this.Name = Name;
    }
    public void setHP(int HP) {
        if (HP > 0) {
            this.HP = HP;
        } else {
            System.out.println("HP Tidak Boleh Netative!");
            this.HP = 0;
        }
    }
    public String getName() {
        return Name;
    }
    public int getHP() {
        return HP;
    }
    public void Serang(KarakterGame Target) {
    }
}
