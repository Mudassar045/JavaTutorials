import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class AlphabetSeparator{
    public static void main(String args[])
    {
      Scanner getInput = new Scanner(System.in);
      System.out.print("Enter a string: ");
      String input = getInput.next();
      // closing input stream
      getInput.close();
      // creating array list
      ArrayList<String> V = new ArrayList<String>();
      ArrayList<String> C = new ArrayList<String>();
      for(int i = 0; i<input.length();i++)
      {
          switch (input.charAt(i)) {
              case 'a':
              case 'e':
              case 'i':
              case 'o':
              case 'u':
              V.add(Character.toString(input.charAt(i)));    
              break;
              default:
              C.add(Character.toString(input.charAt(i)));
                  break;
          }
      }
      Collections.sort(V);
      Collections.sort(C);
      for (String var : V) {
          System.out.print(" "+var);
      }
      System.out.println();
      for (String var : C) {
        System.out.print(" "+var);
    }  
    }
}