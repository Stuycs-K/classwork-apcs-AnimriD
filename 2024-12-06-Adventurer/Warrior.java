import java.util.Random;
public abstract class Warrior extends Adventurer{
  public Warrior(String name){
    super(name);
  }
  public Warrior(String name, int hp){
    super(name, hp);
  }
  private int swords;
  public String getSpecialName(){
    return "swords";
  }
  public int getSpecial(){
    return this.swords;
  }
  public void setSpecial(int n){
    this.swords = n;
  }
  public int getSpecialMax(){
    return 100;
  }
  public int restoreSpecial(int n){
    return super.restoreSpecial(n);
  }
  public String attack(Adventurer other){
    Random rand = new Random();
    int j = rand.nextInt(this.getSpecial() + 1);
    other.setHP(other.getHP() - j);
    String returnable = "" + other.getName() + " was dealt " + j + "damage. ";
    if(other.getHP() <= 0){
      returnable += other.getName() + " is now dead.";
    }
    return returnable;
  }
  public String support(Adventurer other){
    Random rand = new Random();
    int j = rand.nextInt(this.getSpecial() + 1);
    other.setHP(other.getHP() + j);
    this.setHP(this.getHP() - j);
    String returnable = "" + this.getName() + " gave " + other.getName() + " " + j + " amt of HP";
    return returnable;
  }

  public String support(){
    Random rand = new Random();
    int j = rand.nextInt(this.getHP() + 1);
    this.setHP(this.getHP() + j);
    if(this.getHP() > this.getmaxHP()){
      this.setHP(this.getmaxHP());
    }
    return "Self healed";
  }

  public String specialAttack(Adventurer other){
    Random rand = new Random();
    int j = rand.nextInt(this.getSpecial() + 1);
    other.setHP(other.getHP() - j);
    this.swords = this.swords - j;
    String returnable = "" + this.getName() + " attacked " + other.getName() + " with " + j;
    return returnable;
  }
}
