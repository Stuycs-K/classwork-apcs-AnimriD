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
}
