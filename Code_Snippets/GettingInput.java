import java.util.Scanner;
public class GettingInput
{
    public static void main(String args[])
    {
        //creating scanner object
        Scanner getInput = new Scanner(System.in);         
        
        System.out.print("Enter a input: ");
        String str = getInput.nextLine();
        System.out.println(str);
    }
}