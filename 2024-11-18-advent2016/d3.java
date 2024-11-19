import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class d3 {
    public static int countTrianglesA(String filename) {
        try {
            int count = 0;
            File file = new File(filename);
            Scanner input = new Scanner(file);
            while (input.hasNextLine()) {
                int s1 = input.nextInt();
                int s2 = input.nextInt();
                int s3 = input.nextInt();
                if (validTri(s1, s2, s3)) {
                    count++;
                }
            }
            input.close();
            return count;
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
            return 0;
        }

    }
     public static int countTrianglesB(String filename) {
        int count = 0;
        try {
            for (int column = 0; column < 3; column++) {
                File file = new File(filename);
                Scanner input = new Scanner(file);
                while (input.hasNextLine()) {
                    for (int i = 0; i < column; i++) { // shift to the correct column
                        input.nextInt();
                    }
                    int s1 = input.nextInt();
                    input.nextInt();
                    input.nextInt();
                    int s2 = input.nextInt();
                    input.nextInt();
                    input.nextInt();
                    int s3 = input.nextInt();
                    if (validTri(s1, s2, s3)) {
                        count++;
                    }
                    for (int i = column; i < 2; i++) { // go to the end of the row
                        input.nextInt();
                    }
                }
                input.close();
            }
        return count;
        }catch(FileNotFoundException ex) {
            System.out.println("File not found");
            return 0;
        }
     }
            
  public static boolean validTri (int a, int b, int c) {
    return a + b > c && b + c > a && c + a > b;
  }
  public static void main(String[] args){
        System.out.println(countTrianglesA("d3_2016.txt"));
        System.out.println(countTrianglesB("d3_2016.txt"));
  }
}

