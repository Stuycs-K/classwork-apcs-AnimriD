import java.util.*;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;

public class d124{
    public static int d1(String filename){
        try{
            File file = new File(filename);
            Scanner input = new Scanner(file);
            int sum = 0;

            ArrayList<Integer> col = new ArrayList<Integer> ();
            ArrayList<Integer> colu = new ArrayList<Integer> ();
            int loc = 1;
            while(input.hasNextLine()){
                if(loc % 2 != 0){
                    col.add(input.nextInt());
                }
                if(loc % 2 == 0){
                    colu.add(input.nextInt());
                }
                loc++;
            }
            Collections.sort(col);
            Collections.sort(colu);
            //System.out.println(col);
            //System.out.println(colu);

            ArrayList<Integer> colum = new ArrayList<Integer>();
            for(Integer element: col){
                if(!colum.contains(element)){
                    colum.add(element);
                }
            }
            ArrayList<Integer> column = new ArrayList<Integer>();
            for(Integer el: colu){
                if(!column.contains(el)){
                    column.add(el);
                }
            }
            //System.out.println(colum);
            //System.out.println(column);
            System.out.println(colum.size() > column.size());
            System.out.println(colum.size());
            System.out.println(column.size());
int minSize = Math.min(colum.size(), column.size());
for (int x = 0; x < minSize; x++) {
    sum += Math.abs(colum.get(x) - column.get(x));
}
        return sum;
        } catch(FileNotFoundException ex){
            System.out.println("File not found");
            return 0;
        }
    }
    public static void main(String[] args){
        System.out.println(d1("d1_2024.txt"));
    }
}
