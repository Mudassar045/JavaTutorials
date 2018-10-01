import java.util.Scanner;
public class BasicCalculator
{
    public static void main(String args[])
    {
        System.out.println("NANO-CALCULATOR");

        Scanner getInput = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = getInput.nextInt();
        System.out.print("Enter second number: ");
        int num2 = getInput.nextInt();

        int sum = num1 + num2;

        System.out.println("Sum of "+num1+" and "+num2+" is: "+sum);
        
    }
}