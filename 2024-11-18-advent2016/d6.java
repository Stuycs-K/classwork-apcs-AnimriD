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

            ArrayList<String> columns;
            columns = new ArrayList<String>();

            while(input.hasNextLine()){
              columns.add(input.nextLine());
            }

            ArrayList<String> alphabet;
            alphabet = new ArrayList<String>();
            for(int y = 0; y < 26 )

            for(int x = 0; x < columns.size(); x++){

            }
        }

        catch(FileNotFoundException ex){
            return "File not Found!";
        }
    }
    public static void main(String[] args){
        System.out.println(d6("d6_2016.txt"));
    }
}
