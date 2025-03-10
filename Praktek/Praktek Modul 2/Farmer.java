public class Farmer {
    String Name, Favourite;
    public Farmer (String Name, String Favourite) {
        this.Name = Name;
        this.Favourite = Favourite;
    }
    void Talk () {
        System.out.println ("Hello My Name Is " + Name + " And My Favourite Plant Is " + Favourite);
    }
}
