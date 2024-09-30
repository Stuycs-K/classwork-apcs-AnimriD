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
    return new int[1][1];
  }
  public static void main(String[] args){
    int[][] test;
    test = new int[][] {{3, 4, 5, 6}, {28, 3, 54, 7}, {69}};
    System.out.println(arrToString(test));
  }
}
