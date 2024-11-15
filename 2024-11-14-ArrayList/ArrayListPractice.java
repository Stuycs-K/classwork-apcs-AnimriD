public class Driver {
  public static void main(String[] args) {
    int testNum = 0;
    String testName;

    /****************************************************
    Test 1 - Testing createRandomArray
    ****************************************************/

    testNum++;
    testName = "createRandomArray";

    ArrayList<String> a = ArrayListPractice.createRandomArray(100);
    System.out.println(a.toString());

    /****************************************************
    Test 2 - Testing Empty
    ****************************************************/

    testNum++;
    testName = "replaceEmpty";
    ArrayListPractice.replaceEmpty(a);
    System.out.println(a.toString());

    /****************************************************
    Test 3 - Testing Reverse
    ****************************************************/

    testNum++;
    testName = "Reverse";
    ArrayList<String> b = ArrayListPractice.createRandomArray(5);
    ArrayList<String> c = ArrayListPractice.makeReversedList(b);
    System.out.println(b.toString());
    System.out.println(c.toString());


    System.out.println(ArrayListPractice.mixLists(b,c).toString());

  }
}
