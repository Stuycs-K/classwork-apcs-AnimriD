import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class d2{
    public static int d2(String filename){
        try{
            File file = new File(filename);
            Scanner input = new Scanner(file);
            String returnable = "";

            ArrayList<String> newer = new ArrayList<String>();
            while(input.hasNextLine()){
                newer.add(input.nextLine());
            }
            for(int x = 0; x < newer.size(); x++){
                int j = 5;
                for(int y = 0; y < newer.get(x).length(); y++){
                    if (newer.get(x).charAt(y) == 'L'){
                        if(!(j % 3 == 1)) {
                          j--;
                        }
                      }
                   if (newer.get(x).charAt(y) == 'R'){
                     if(!(j % 3 == 0)){
                       j++;
                     }
                   }
                   if (newer.get(x).charAt(y) == 'U'){
                     if(!(j <= 3)) {
                       j = j - 3;
                     }
                   }
                   if(newer.get(x).charAt(y) == 'D'){
                     if(!(j >= 7)) {
                       j = j + 3;
                     }
                   }
                }
                returnable += j;
            }
            return Integer.parseInt(returnable);
        }
        catch(FileNotFoundException ex){
            System.out.println("File not found");
            return 0;
        }
    }
    public static String d22(String filename){
        try{
            File file = new File(filename);
            Scanner input = new Scanner(file);
            String returnable = "";

            ArrayList<String> newer = new ArrayList<String>();
            while(input.hasNextLine()){
                newer.add(input.nextLine());
            }
            ArrayList<String> results = new ArrayList<String>(Arrays.asList(("1", "2", "3", "4", "5", "6","7","8","9","A","B","C","D")));
            for(int x = 0; x < newer.size(); x++){
                int j = 5;
                for(int y = 0; y < newer.get(x).length(); y++){
                  if (newer.get(x).charAt(y) == 'L'){
                    if(!(j == 2 || j == 5 || j == 1 || newer.get(x).equals("A") || newer.get(x).equals("D"))){
                      j += results.get(j - 1);
                    }
                  }
                  if (newer.get(x).charAt(y) == 'R'){
                    if(!(j == 4 || j == 1 || j == 9 || newer.get(x).equals("C") || newer.get(x).equals("D"))){
                      j += results.get(j + 1);
                    }
                  }
                  if (newer.get(x).charAt(y) == 'U'){
                    if(!(j==1 || j == 2 || j == 4 || j == 5 || j == 9)){
                      j += results.get(j - 4);
                    }
                   }
                  if(newer.get(x).charAt(y) == 'D'){
                    if(!(j == 5 || j == 9 || newer.get(x).equals("A")) || newer.get(x).equals("C")){
                      j += results.get(j + 4);
                    }
                   }
                }
                returnable += j;
            }
            return returnable;
        }
        catch(FileNotFoundException ex){
            System.out.println("File not found");
            return 0;
        }
    }
    public static void main(String[] args){
        System.out.println(d2("d2_2016.txt"));
    }


}
