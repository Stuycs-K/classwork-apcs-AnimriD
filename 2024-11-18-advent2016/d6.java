import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class d6{
    public static String d6 (String filename){
        try{
            File file = new File(filename);
            Scanner input = new Scanner(file);
            String returnable = "";
        }catch(FileNotFoundException ex){
            return "File not Found!";
        }
    }
    public static void main(String[] args){
        System.out.println(d6("d6_2016.txt"));
    }
}