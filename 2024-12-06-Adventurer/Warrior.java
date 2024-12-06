public class Warrior extends Adventurer{
  public Warrior(String name){
    super(name);
  }
  public Warrior(String name, int hp){
    super(name, hp);
  }
  private int swords;
  public int restoreSpecial(int n){
    this.swords = n;
    super.restoreSpecial(n);
  }
}
