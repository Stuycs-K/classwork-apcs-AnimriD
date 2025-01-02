public class fib{
  public static int solution(int n){
    int fibnum = 0;
    if(n == 0){
      fibnum += 0;
    }else if(n == 1){
      fibnum += 1;
    }
    else{

      fibnum = solution(n - 1) + solution(n - 2);
    }
    return fibnum;
  }
  public static void main(String[] ars){
    System.out.println(solution(46));
  }

}
