// Amrit Das - amritd@nycstudents.net  Aydan Ferrao-aydanf@nycstudents.net
public class ArrayMethods{
  public static String arrayToString(int[]nums){
    String returnable = "[";
    for(int x = 0; x < nums.length - 1;x++){
      String add = "" + nums[x];
      returnable = returnable + add + ", ";
    }
    returnable += nums[nums.length-1] + "]";
    return returnable;
  }
  //3. Write arrToString, with a 2D array parameter.
  //Note: Different parameters are allowed with the same function name.
  /**Return a String that represets the 2D array in the format:
    * "[[2, 3, 4], [5, 6, 7], [2, 4, 9]]"
    * Note the comma+space between values, and between arrays
    * You are encouraged to notice that you may want to re-use
    * previous code, but you should NOT duplicate that code. (Don't copy/paste or retype it)
    */
  public static String arrToString(int[][]ary){
    String returnable = "[";
    for (int i = 0; i < ary.length; i++) {
      returnable += arrayToString(ary[i]);
    }
    returnable += "]";
    return returnable;
  }

  /*Return the sum of all of the values in the 2D array */
  public static int arr2DSum(int[][]nums){
    int sum = 0;
    for(int i = 0; i < nums.length; i++){
      for(int x = 0; x <nums[i].length; x++){
        sum += nums[i][x];
      }
    }
    return sum;
  }

  /**Rotate an array by returning a new array with the rows and columns swapped.
    * You may assume the array is rectangular and neither rows nor cols is 0.
    * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
    */
  public static int[][] swapRC(int[][]nums){
    int[][] returnable = new int[nums[0].length][nums.length];
    for(int i = 0; i < nums.length; i++){
      for(int x = 0; x < nums[0].length; x++){
        returnable[x][i] = nums[i][x];
      }
    }
    return returnable;
  }
  //3. Modify a given 2D array of integer as follows:
  //Replace all the negative values:
  //-When the row number is the same as the column number replace
  //that negative with the value 1
  //-All other negatives replace with 0
  public static int[][] replaceNegative(int[][] vals){
    for(int x = 0; x < vals.length;x++){
      for(int y = 0; y <vals[x].length; y++){
        if (x == y && vals[x][y] < 0){
          vals[x][y] = 1;
        }
        if (x != y && vals[x][y] < 0){
          vals[x][y] = 0;
        }
      }
    }
    return vals;
  }

  //4. Make a copy of the given 2d array.
  //When testing : make sure that changing the original does NOT change the copy.
  //DO NOT use any built in methods that "copy" an array.
  //You SHOULD write a helper method for this.
  //If you don't see a good way to do that, you should stop and look at prior methods.
  public static int[] helper(int[] nums){
    int [] copy = new int [nums.length];
    for(int x = 0; x < nums.length; x++){
      copy[x] = nums[x];
    }
    return copy;
  }
  public static int[][] copy(int[][] nums){
    int[][] nums2 = new int[nums.length][];
    for(int x = 0; x < nums.length; x++){
      nums2[x] = helper(nums[x]);
    }
    return nums2;
  }
  public static void main(String[] args){
    int[][] test1 = new int[][] {{3, 4, 5, 6}, {28, 3, 54, 7}, {69}};
    System.out.println(arrToString(test1));

    int[][] test2 = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    String s = arrToString(test2);
    System.out.println(s);

    int x = arr2DSum(test2);
    System.out.println(x);

    int[][] swapped = swapRC(test2);
    String y = arrToString(swapped);
    System.out.println(y);

    int[][] test3 = new int[][]{{306,232,333}, {232,306,212}};
    int[][] swapped1 = swapRC(test3);
    String z = arrToString(swapped1);
    int m = arr2DSum(test3);
    System.out.println(m);
    System.out.println(z);

    int[][] test4 = new int[][] {{3, -4, -5}, {2,-3}, {-1}};
    System.out.println(arrToString(replaceNegative(test4)));

    int[][] test5 = new int[][] {{1,2,3}, {4,5,6}, {7,8,9}};
    String abc = arrToString(test5);
    int[][] bcd = copy(test5);
    String jba = arrToString(bcd);
    System.out.println("Expected different" + test5 + " " + bcd  + "Expected same " + abc.equals(jba));

  }
}
