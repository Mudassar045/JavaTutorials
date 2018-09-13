import java.util.Scanner;
public class Task5
{
    public static void main(String args[])
    {
        Scanner getInput = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = getInput.nextInt();
        boolean flag = true;
        while (flag)
        {
            //check prime
            boolean prime = true;
            for (int j = 2; j <= num / 2; j++)
            {
                if (num%j == 0)
                {
                    prime = false;
                }
            }
            if ((num - 1) % 11 == 0&&prime)
            {
                flag = false;
            }
            if(flag)
                num++;
        }
        System.out.println("The smallest number is: "+num);
    }
}