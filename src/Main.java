import Actions.Proverbs;
import Actions.Quiz;
import Clothes.Shoes;
import Actions.Song;
import Actors.Goat;
import Actors.Neznaika;
import Clothes.Hat;
import Location.Location;

public class Main {
    public static void main(String[] args) {
        Goat k = new Goat("Козлик", 44);
        Neznaika n = new Neznaika("Незнайка", 40);
        Shoes shoes = new Shoes(k);
        Hat hat = new Hat("красный", 5);
        Song s = new Song("\"Это было, это будет,\nГде-то рядом, где-то тут,\nНарисованные люди очень весело живут\nОн немного невезучий,\nОзорной и смелый плут,\nВсе его чему-то учат\nИ Незнайкою зовут.\"");
        Quiz q = new Quiz("Как сдать лабы? ", "Нужно вовремя делать лабы и сдавать их");
        boolean Shoes;
        boolean Hat = false;

        System.out.println(Location.UNDER_BRIDGE.getPlace());
        k.SayItIsNotHard();
        n.TryOn(shoes);
        if (n.getSizeOfShoes() == shoes.getSize()){
            System.out.println("Ботинки в самый раз!");
            Shoes = true;
        }
        else if (n.getSizeOfShoes() > shoes.getSize()) {
            System.out.println("Ботинки большие(");
            Shoes = false;
        } else {
            System.out.println("Ботинки оказались малы...");
            Shoes = false;
        }
        k.GoHunting();

        n.StayOn(Location.UNDER_BRIDGE);
        if (Shoes) {
            n.ShoesYes();
        } else {
            n.ShoesNo();
        }
        if (Hat) {
            n.HatYes(hat);
        } else {
            n.HatNo();
        }
        n.ThinkAbout();
        n.Sing(s);
        n.MadeRiddles(q);
        n.GuessRiddles(q);
        System.out.println(n.Riddle(q));
        n.SayProverbs(Proverbs.A);
        n.SayProverbs(Proverbs.B);
        n.SayProverbs(Proverbs.C);
        n.RememberLife();
        n.RememberFriends();
    }
}