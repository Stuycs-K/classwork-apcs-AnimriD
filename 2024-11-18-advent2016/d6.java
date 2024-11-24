import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class d6{
    public static char counter(ArrayList<String> dd){
        int[] counter = new int[26];
        for(int x = 0; x < dd.size(); x++){
            char y = dd.get(x).charAt(0);
            counter[y - 'a']++;  
        }
        char most = 'a';
        int maxFrequency = 26;
        int place = 0;
        for(int x = 0; x < counter.length; x++){
            if (counter[x] < maxFrequency){
                maxFrequency = counter[x];
                most = (char) ('a' + x);
            }
        }
        return most;
    }
    public static String d6 (String filename){
        try{
            File file = new File(filename);
            Scanner input = new Scanner(file);
            String returnable = "";

            ArrayList<ArrayList<String>> columns = new ArrayList<>();

            for(int x = 0; x < 8; x++){
                columns.add(new ArrayList<>());
            }

            while (input.hasNextLine()) {
                String line = input.nextLine();
                for (int i = 0; i < line.length(); i++) {
                    columns.get(i).add(line.substring(i, i + 1));
                }
            }
            input.close();

            for(int x = 0; x <columns.size(); x++){
                returnable += counter(columns.get(x));
            }
            return returnable;
         
        }

        catch(FileNotFoundException ex){
            return "File not Found!";
        }
    }
    public static void main(String[] args){
        System.out.println(d6("d6_2016.txt"));
    }
}
