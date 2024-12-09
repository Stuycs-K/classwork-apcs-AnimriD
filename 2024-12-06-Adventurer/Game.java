import java.util.Scanner;
import java.util.Random;
public class Game{
  public static void main(String[] args){
    Random rand = new Random();
    Adventurer player = new Warrior("Bob", 15) {};
    player.setSpecial(rand.nextInt(player.getSpecialMax()));
    Adventurer opps = new CodeWarrior("Joe", 15);
    System.out.println("" + player.getName() + ", " + player.getHP() + "/" + player.getmaxHP() + "HP, " + player.getSpecial() + "/" + player.getSpecialMax() + player.getSpecialName());
    System.out.println("" + opps.getName() + ", " + opps.getHP() + "/" + opps.getmaxHP() + ", " + opps.getSpecial() + "/" + opps.getSpecialMax() + opps.getSpecialName());
    System.out.println("Type: (a)ttack/ (sp)ecial/ (su)pport/ quit");
    Scanner userInput = new Scanner(System.in);

  }
}
