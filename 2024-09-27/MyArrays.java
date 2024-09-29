public class MyArrays{
  public static String arrayToString(int[]nums){
    String returnable = "[";
    for(int x = 0; x < nums.length - 1;x++){
      String add = "" + nums[x];
      returnable = returnable + add + ", ";
    }
    returnable += nums[nums.length-1] + "]";
    return returnable;
  }
  public static int[] returnCopy(int[] ary){
    int[] returnable = new int[ary.length];
    for(int counter = 0; counter < ary.length; counter++){
      returnable[counter] = ary[counter];
    }
    return returnable;
  }
  public static int[] concatArray(int[]ary1, int[]ary2){
    int[] returnable = new int[ary1.length + ary2.length];
    for(int counter = 0; counter < ary1.length; counter++){
      returnable[counter] = ary1[counter];
    }
    for(int x = 0; x < ary2.length; x++){
      returnable[x + ary1.length] = ary2[x];
    }
    return returnable;
  }
  public static void main(String[] args){
    int [] arr = {1,2,3};
    System.out.println(arr);
    String a = arrayToString(arr);
    System.out.println(a);
    int [] arr2 = returnCopy(arr);
    String b = arrayToString(arr2);
    System.out.println("Expected: false and true " + (arr==arr2) + " and " + b.equals(a));
    int [] arr3 = concatArray(arr,arr2);
    String c = arrayToString(arr3);
    System.out.println("Expected: {1,2,3,1,2,3}" + c);
  }
}
