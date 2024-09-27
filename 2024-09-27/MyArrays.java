public class MyArrays{
  public String arrayToString(int[]nums){
    String returnable = "[";
    for(int x = 0; x < nums.length - 1;x++){
      String add = nums[x];
      returnable = retrunable + add + ", ";
    }
    returnable += nums[nums.length-1] + "]";
    return returnable;
  }
  public static int[] returnCopy(int[] ary){
    int[] returnable =
  }
  public static int[] concatArray(int[]ary1, int[]ary2){

  }
  public static void main(String[] args){
    arrayToString({1,2,3});
    System.out.println();
  }
}
