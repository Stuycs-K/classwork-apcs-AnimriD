import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class TriangleTester {
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
        File file = new File(filename);
        Scanner input = new Scanner(file);
        while (input.hasNextLine()) {
            try {
                int[] a = new int[3];
                int[] b = new int[3];
                int[] c = new int[3];

                for (int i = 0; i < 3; i++) {
                    a[i] = input.nextInt();
                    b[i] = input.nextInt();
                    c[i] = input.nextInt();
                }

                for (int i = 0; i < 3; i++) {
                    if (validTri(a[i], b[i], c[i])) {
                        count++;
                    }
                }
            } catch (NoSuchElementException ex) {
                System.out.println("Incomplete line. Count " + count);
                }
            }
            input.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
        return count;
    }
  public static boolean validTri (int a, int b, int c) {
    return a + b > c && b + c > a && c + a > b;
  }
  public static void main(String[] args){
        System.out.println(countTrianglesA("inputTri.txt"));
        System.out.println(countTrianglesB("inputTri.txt"));
  }
}
