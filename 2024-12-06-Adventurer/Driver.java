import java.util.Random;
public class Driver{
    public static void main(String[] args){}
        Adventurer w1 = new Warrior("Max", 15);
        System.out.println(w1.getHP());
        System.out.println(w1.getmaxHP());
        Adventurer w2 = new Warrior("Lando", 14);
        System.out.println(w2.getHP());
        System.out.println(w2.getmaxHP());
        w1.getSpecial();
        w1.setSpecial(7);
        w1.getSpecialMax();
        w2.getSpecial();
        w2.setSpecial(0);
        System.out.println(w1.attack(w2));
        System.out.println(w2.getHP());
        System.out.println(w2.support());
        System.out.println(w2.getHP());
        System.out.println(w1.specialAttack(w2));
}
