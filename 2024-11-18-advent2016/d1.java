import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class d1{
  public static int d1(String filename){
    try{
      File file = new File(filename);
      Scanner input = new Scanner(file);
      int orientation = 0;
      int x = 0;
      int y = 0;

      ArrayList<String> data;
      data = new ArrayList<String>();
      ArrayList<Integer> data1;
      data1 = new ArrayList<Integer>();
      while(input.hasNext()){
        data.add(input.next());
      }

      int[][] nice = new int[][]{{1,0}, {0,-1}, {-1,0}, {0,1}};
      for(int j = 0; j < data.size(); j++){
        String temp = data.get(j);
        if(temp.charAt(0) == 'R'){
          orientation = (orientation + 1) % 4;
        }
        if(temp.charAt(0) == 'L'){
          orientation = (orientation - 1 + 4) % 4;
        }
        int distance = Integer.parseInt(temp.substring(1));
        x += distance * nice[orientation][0];
        y += distance * nice[orientation][1];
      }
      return Math.abs(x) + Math.abs(y);

    }catch(FileNotFoundException ex){
      System.out.println("File not found");
      return 0;
    }
  }

  public static void main(String[] args){
    System.out.println(d1("2016_d1.txt"));
  }
}
