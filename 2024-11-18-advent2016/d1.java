import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class d1{
  public static int d1(String filename){
    try{
      File file = new File("filename");
      Scanner input = new Scanner(file);

      int dir = 0;
      int orientation = 0;

      while(input.hasNext()){
        String next = input.next();
        String new = next.substring(0,2);
        if(charAt.next(0) == "R"){
          orientation = (orientation + 1) % 4;
        }
      }
    }catch(FileNotFoundException ex){
      System.out.println("File not found");
      return;
    }
  }
}
