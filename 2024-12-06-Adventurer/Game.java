import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class Game{
  public static void main(String[] args){
    Random rand = new Random();
    Adventurer player = new Warrior("Bob", 15) {};
    player.setSpecial(rand.nextInt(player.getSpecialMax()));
    Adventurer opps = new CodeWarrior("Joe", 15);
    System.out.println("" + player.getName() + ", " + player.getHP() + "/" + player.getmaxHP() + "HP, " + player.getSpecial() + "/" + player.getSpecialMax() + player.getSpecialName());
    System.out.println("" + opps.getName() + ", " + opps.getHP() + "/" + opps.getmaxHP() + "HP, " + opps.getSpecial() + "/" + opps.getSpecialMax() + opps.getSpecialName());
    System.out.println("Type: (a)ttack/ (sp)ecial/ (su)pport/ quit");
    ArrayList<String> commands = new ArrayList<String>();
    commands.add("attack");
    commands.add("special");
    commands.add("support");
    commands.add("attack");
    commands.add("special");
    commands.add("support");
    Scanner userInput = new Scanner(System.in);
    String input = userInput.nextLine();
    if(input.equals("a") || input.equals("attack")){
      System.out.println(player.attack(opps));
    } else if(input.equals("sp")|| input.equals("special")){
      System.out.println(player.specialAttack(opps));
    } else if(input.equals("su") || input.equals("support")){
      System.out.println(player.support());
    } else if(input.equals("quit")){
      System.out.println("You're a quitter");
      return;
    } else{
      System.out.println("Response is invalid. Try again");
    }
    while(opps.getHP() > 0 || player.getHP() > 0){
      int j = rand.nextInt(6) - 1;
      if(j == 0){
        System.out.println(player.attack(opps));
      }
      if(j == 1){
        System.out.println(player.specialAttack(opps));
      }
      if(j == 2){
        System.out.println(player.support());
      }
      if(j == 3){
        System.out.println(opps.attack(player));
      }
      if(j == 4){
        System.out.println(opps.specialAttack(player));
      }
      if(j == 5){
        System.out.println(opps.support());
      }
    }
  if (opps.getHP() == 0){
    System.out.println("you won");
  }
  else{
    System.out.println("you lost get better");
  }
}
}
