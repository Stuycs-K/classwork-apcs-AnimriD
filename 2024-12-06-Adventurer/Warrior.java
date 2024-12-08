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
    return 1000;
  }
  public int restoreSpecial(int n){
    return super.restoreSpecial(n);
  }
  public String attack(Adventurer other){
    Random rand = Random();
    int j = rand.nextInt(this.getSpecial() + 1);
    other.HP = other.HP - j;
    String returnable = "" + other.getName() + "was dealt " + j + "damage. ";
    if(other.HP <= 0){
      returnable += other.getName() + " is now dead.";
    }
    return returnable;
  }
  public String support(Adventurer other){
    Random rand = Random();
    int j = rand.nextInt(this.getSpecial() + 1);
    other.HP = other.HP + j;
    this.HP = this.HP - j;
    String returnable = "" + this.getName() + " gave " + other.getName() + " " + j + " amt of HP";
    return returnable;
  }

  public String support(){
    Random rand = Random();
    int j = rand.nextInt(this.HP + 1);
    this.HP = this.HP + j;
    if(this.HP > this.maxHP){
      this.HP = this.maxHP;
    }
    return "Self healed";
  }

}
