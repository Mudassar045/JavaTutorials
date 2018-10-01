import java.util.Scanner;
public class PrimeFactorization
{
    static boolean isPrime(int n)
    {   
        for(int i=2;i*i<=n;i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner getInput = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = getInput.nextInt();
        int temp = num;
	int count = 0;
	System.out.print(num+" = ");
        for (int i = 2; i <temp/2;) {
            if(isPrime(i)==true && num%i==0)
             {   
                num = num/i;
		count ++;
               // System.out.print(" "+i);
             }
            else
		{
		if(count!=0)
		System.out.print((i)+"^"+count+".");
               	i++;
		count = 0;
		}
        }
    }
}