import java.util.Scanner;

public class BasicSwitch
{
    public static void main(String args[])
    {
        Scanner getInput = new Scanner(System.in);
        
        System.out.println("[Choice Menu]");
        System.out.println("Add - 1");
        System.out.println("Sub - 2");
        System.out.println("Mul - 3");
        System.out.println("Div - 4");
        System.out.println("End - 0");
        
        System.out.println();

        System.out.print("Enter first number: ");
        int num1 = getInput.nextInt();
        System.out.print("Enter second number: ");
        int num2 = getInput.nextInt();

        int choice = 0;

        System.out.print("Enter your choice: ");
        choice = getInput.nextInt();
        switch (choice) {
            case 1:
        
            System.out.println("Addition of "+num1+" and "+num2+" is: "+(num1+num2));
                break;
            case 2:
            System.out.println("Subtraction of "+num1+" and "+num2+" is: "+(num1-num2));
                break;
            case 3:
            System.out.println("Multiplication of "+num1+" and "+num2+" is: "+(num1*num2));
                break;
            case 4:
            System.out.println("Division of "+num1+" by "+num2+" is: "+(num1/num2));
                break;
            case 0:
                System.err.println("program terminated");
                break;
            default:
                System.out.println("Make a right choice");
                break;
        }

    }
}