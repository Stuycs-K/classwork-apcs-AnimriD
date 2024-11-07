public class Driver{
  public static void main (String []args) {
    Animal a = new Animal("meow", 8, "kitty");
    a.speak();
    Bird birdie = new Bird("caw", 4, "bald eagle", 200, "brown");
    birdie.speak();
  }
}
