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
                        if(j - 1 <= 0){
                            y++;
                        }
                        else{
                            j = j - 1;
                        }
                    }
                    if(newer.get(x).charAt(y) == 'R'){
                        if(j++ >= 10){
                            y++;
                        }else{
                            j++;
                        }
                    }
                    if(newer.get(x).charAt(y) == 'U'){
                        if(j - 3 <= 0){
                            y++;
                        }else{
                            j = j - 3;
                        }
                    }
                    if(newer.get(x).charAt(y) == 'D'){
                        if(j + 3 >= 10){
                            y++;
                        }
                        else{
                            j = j + 3;
                        }
                    }
                }
                returnable += j;
            }
            return Integer.parseInt(returnable);
        }catch(FileNotFoundException ex){
            System.out.println("File not found");
            return 0;
        }
    }

    public static void main(String[] args){
        System.out.println(d2("d2_2016.txt"));
    }
}