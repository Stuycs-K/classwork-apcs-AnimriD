// When calling the speak method on a Bird object
// the words "The Mighty" was added before the name of the object
// calling speak on animal objects remained the same with no "The Mighty".
/* This shows that you can not store an animal in a bird.
  This is because in order to construct Bird in the subclass,
  you need more variables than you would in the Animal class, meaning you can't construct the bird. */
public class Driver{
  public static void main (String []args) {
    Animal a = new Animal("meow", 8, "kitty");
    a.speak();
    Bird birdie = new Bird("caw", 4, "bald eagle", 200, "brown");
    birdie.speak();
    Animal a1 = new Animal("hello", 16, "human");
    Bird b1 = new Bird("cawcaw", 7, "falcon", 70, "brown");
    //Bird b2 = new Animal("rawr", 200, "lion");
    Animal a2 = new Bird("squeak", 24, "pigeon", 100, "grey");
    a1.speak();
    b1.speak();
    a2.speak();
  }
}
