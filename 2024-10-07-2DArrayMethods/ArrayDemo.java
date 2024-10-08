import java.util.Arrays;
public class ArrayDemo{
  public static void main(String[]args){
    //write your tests here!
    //You can now use Arrays.toString(yourArray) instead of writing arrayToString again.
    //Compare Arrays.toString(yourArray) to YOUR arrayToString() method to make sure yours is correct
    //do not use any other Arrays.method()
    int[][] test1 = new int[][] {{1,2,3}, {5,6,7}, {4,8, 9}, {10,0,-1}};
    int[][] test2 = new int[][] {{-1,2,-3}, {-5,6,-7}, {8, -9, 4}, {10, 0, -5}};
    System.out.println("Expected true: " + Arrays.toString(test1) + " "+ (arrToString(test1)));
    System.out.println("Expected true: " + Arrays.toString(test2) + " "+ (arrToString(test2)));
    System.out.println("Expected 0: " + countZeros2D(test1));
    System.out.println("Expected 1: " + countZeros2D(test2));
    System.out.println("Expected 55: " + arr2DSum(test1));
    System.out.println("Expected 10: " + arr2DSum(test2));
    System.out.println("Before replaceNegative test1: " + arrToString(test1));
    replaceNegative(test1);
    System.out.println("After replaceNegative test1: " + arrToString(test1)); 
    System.out.println("Before replaceNegative test2: " + arrToString(test2));
    replaceNegative(test2);
    System.out.println("After replaceNegative test2: " + arrToString(test2));
    System.out.println("Expected false: " + (copy(test1) == test1) + " Expected true: " + Arrays.toString(copy(test1)).equals(Arrays.toString(test1)));
    System.out.println("Expected false: " + (copy(test2) == test2) + " Expected true: " + Arrays.toString(copy(test2)).equals(Arrays.toString(test2)));
    System.out.println(Arrays.toString(swapRC(test1)));
    System.out.println(Arrays.toString(swapRC(test2)));
    System.out.println(htmlTable(test1));
    System.out.println(htmlTable(test2));
  }

  //0. Include your prior methods to help you print a 1D/2D array of ints.
  public static String arrToString(int[]nums){
    String returnable = "[";
    for(int x = 0; x < nums.length - 1;x++){
      returnable+= nums[x] + ",";
    }
    returnable += nums[nums.length-1] + "]";
    return returnable;
  }

  //The name of different methods can be the same,
  //as long as the parameters are different! (type and/or quantity must be different)
  //Pro tip: you should be using your 1D arrToString in this method!
  public static String arrToString(int[][]ary){
    String returnable = "[";
    for (int i = 0; i < ary.length - 1; i++) {
      returnable += arrToString(ary[i]) + ",";
    }
    returnable += arrToString(ary[ary.length - 1]) + "]";
    return returnable;
  }


  //1. Calculate and return how many elements equal zero in the 2D array.
  public static int countZeros2D(int[][] nums){
    int count = 0;
    for(int counter = 0; counter < nums.length; counter ++){
      for(int countx = 0; countx < nums[counter].length; countx++){
        if (nums[counter][countx] == 0){
          count ++;
        }
      }
    }
    return count;
  }

  //2. Calculate the sum of a 2d array
  /*Return the sum of all of the values in the 2D array
   *Use a nested loop instead of a helper method*/
  public static int arr2DSum(int[][]nums){
    int sum = 0;
    for(int x = 0; x < nums.length; x++){
      for(int y = 0; y < nums[x].length; y++){
        sum += nums[x][y];
      }
    }
    return sum;
  }

  //3. Modify a given 2D array of integer as follows:
  //Replace all the negative values:
  //-When the row number is the same as the column number replace
  //that negative with the value 1
  //-All other negatives replace with 0
  public static void replaceNegative(int[][] vals){
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

  //5. Rotate an array by returning a new array with the rows and columns swapped.
  //   You may assume the array is rectangular and neither rows nor cols is 0.
  //   e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  public static int[][] swapRC(int[][]nums){
    int[][] returnable = new int[nums[0].length][nums.length];
    for(int i = 0; i < nums.length; i++){
      for(int x = 0; x < nums[0].length; x++){
        returnable[x][i] = nums[i][x];
      }
    }
  return returnable;
}
  //6. Make an HTML table by putting a table tag around the entire 2d array,
  //   tr tags around each row, and td tags around each value.
  //   You may use a helper method
  //   Note there is no whitespace in the string, it all one line with no spaces/tabs.
  //   e.g. htmlTable(new int[][]{{1,2},{3}})  returns:
  // "<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>"
  public static String htmlTable(int[][]nums){
    String html = "<table><tr>";
    for(int x = 0; x < nums.length; x++){
      for(int y = 0; y <nums[x].length; y++){
        html += "<td>";
        html += nums[x][y];
        html += "</td>";
      }
    }
  html += "</tr></table>";
  return html;
  }
}
