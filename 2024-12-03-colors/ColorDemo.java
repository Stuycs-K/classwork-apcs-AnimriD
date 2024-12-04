public class ColorDemo{
  public static final String CLEAR_SCREEN =  "\u001b[2J";
  public static final String HIDE_CURSOR =  "\u001b[?25l";
  public static final String SHOW_CURSOR =  "\u001b[?25h";
  public static int BLUE = 34;
  public static int YELLOW = 33;
  public static int WHITE = 37;
  public static String color(int foreground,int background){
    String colors = "\u001b[" + foreground + ";" + (10+background) + "m";
    return colors;
  }
  public static void main(String[] args){

    System.out.print("\u001b[2J");
    System.out.print("\u001b[34m");
    System.out.print("\u001b[41m");
    System.out.print("\u001b[1m");
    System.out.println("USA");
    System.out.print(color(YELLOW, BLUE));
    System.out.print("\u001b[1m");
    System.out.print("\u001b[4m");
    System.out.println("Chelsea FC");
    System.out.print("\u001b[?25h");
    for(int r = 0; r < 256; r+=32){
      for(int g = 0; g <= 126; g+=32){
        for(int b = 0; b <= 80; b+=32){
          System.out.print("\u001b[38;2;"+r+";"+g+";"+b+";7m.");
        }
      }
    System.out.println();
  }
  System.out.print("\u001b[0m");
  }
}
