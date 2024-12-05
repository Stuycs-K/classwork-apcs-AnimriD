import java.util.*;
import java.util.Arrays;
import java.util.Random;
public class Driver{
    public static int[] creator(){
        int [] returnable = new int[3];
        Random rand = new Random();
        for(int x =0; x < 3; x++){
            returnable[x] = rand.nextInt(100);
        }
        return returnable;
    }
    public static int[] hello (int[] arr){
        int[] data = new int[3];
        for(int x = 0; x < 3; x++){
            if(arr[x] < 25){
                data[x] = Text.RED;
            } else if(arr[x] > 75){
                data[x] = Text.GREEN;
            }else{
                data[x] = Text.WHITE;
            }
        }
        return data;
    }

    public static void main(String[] args){
        System.out.print(Text.CLEAR_SCREEN);
        int [] test = creator();
        int [] colors = hello(test);
        for(int x = 0; x < 3; x++){
            if(x == 1 || x== 0){
                Text.go(1, 80 - (80/(x+ 1)));
            } 
            else{
                Text.go(1,79);
            }
            Text.color(colors[x]);
            System.out.print(test[x]);
        }
        int r = 0;
        while(r < 80){
        Text.go(2,1 + r);
        Text.color(Text.WHITE);
        System.out.print("");
        System.out.print("#");
        r++;
        }
        int[] cs = new int [] {Text.BLACK, Text.RED, Text.GREEN, Text.YELLOW, Text.BLUE, Text.MAGENTA, Text.CYAN, Text.WHITE};
        for(int x =0 ; x < 27; x++){
            Text.go(x+3, 1);
            Random rand = new Random();
            int y = rand.nextInt(8);
            int j = Text.background(cs[y]);
            Text.color(j);
            for(int i = 0; i  < 80; i++){
                System.out.print(" ");
            }
        }
        for(int x = 0; x < 27; x++){
            Text.erase(x + 3, 27/ (x + 1), x);
            Text.erase(x+3, 80- 27/(x+1), x);
        }
        Text.go(31,1);
        System.out.print(Text.RESET);
    }
}