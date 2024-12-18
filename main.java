import java.util.Scanner;
import java.util.ArrayList;

public class Main {

  public static void main (String ... args){
      
    Scanner input = new Scanner(System.in);
    long binary = 0;
    long[] binaryArray;
    String binaryStr;
    boolean isBinary = false;
    while(true){
      while(true){
        System.out.print("Escreva o número binário que represente um decimal: ");
        if(input.hasNextLong()){
          binary = input.nextLong();

          if(binary > 0)
            break;

          System.out.println("Valor inválido, escreva apenas um número binário");
        }
        else{
          System.out.println("Valor inválido, escreva apenas um número binário");
          input.nextLine();
        }
      }
      binaryStr = Long.toString(binary);
      binaryArray = new long[binaryStr.length()];

      for (int i = 0; i < binaryStr.length(); i++){
          binaryArray[i] = Long.parseLong(String.valueOf(binaryStr.charAt(i)));
          if(binaryArray[i] != 0 && binaryArray[i] != 1){
            System.out.println("Valor inválido, escrava apenas um número binário");
            isBinary = false;
            break;
          }
          isBinary = true;
      }
      if(isBinary)
        break;
    }
      long priorValue = 0;
      for (int i = 0; i < binaryArray.length; i++){
        priorValue = priorValue * 2 + binaryArray[i];
      }
      System.out.println(priorValue);
  }
}
