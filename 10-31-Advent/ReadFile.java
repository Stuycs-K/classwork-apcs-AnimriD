import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ReadFile {
  public static void main(String[] args){
    try {
      File file = new File("PUT_FILENAME_HERE");//1
      Scanner input = new Scanner(file);
        //CODE THAT SCANS THE FILE.
      input.close();//releases the file from your program

    }catch (FileNotFoundException ex) {
        //File not found what should you do?
      System.out.println("ReadFile.java");
      return; //you can return from a void function just don't put a value.
    }
  }

}
