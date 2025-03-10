import java.util.Date;
public class MainRename {
    public static void main (String [] args) {
        Plant plant1 = new Plant("Corn");
        Farmer farm1 = new Farmer("Loka", plant1.Name);
        Plant plant2 = new Plant("Rice");
        Farmer farm2 = new Farmer("Pscal", plant2.Name);

        System.out.println("Hello World");
        System.out.println("Current Date : " + new Date());
        farm1.Talk();
        farm2.Talk();
    }
}
