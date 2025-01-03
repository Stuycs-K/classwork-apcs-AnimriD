public class alphabet{
  public static void makeWords(int remainingLetters, String result, String alphabet){
      if(remainingLetters == 0){
        System.out.println("");
      } else{
        for(int x = 0; x < alphabet.length(); x++){
          char temp = alphabet.charAt(x);
          makeWords(remainingLetters - 1,temp,alphabet);
        }
      }
  }
  public static void main(String[] args){
    System.out.println(makeWords(2, "", "abc"));
  }
}
