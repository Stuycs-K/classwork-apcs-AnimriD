public abstract class Warrior extends Adventurer{
  public Warrior(String name){
    super(name);
  }
  public Warrior(String name, int hp){
    super(name, hp);
  }
  private int swords;
  public abstract String getSpecialName(){
    return "swords";
  }
  public abstract int getSpecial(){
    return this.swords;
  }
  public abstract void setSpecial(int n){
    this.swords = n;
  }
  public abstract int getSpecialMax(){
    return 1000;
  }
  public int restoreSpecial(int n){
    return super.restoreSpecial(n);
  }


}
