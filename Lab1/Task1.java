public class Task1 
{
  static int count = 0;  
  //checks whether an int is prime or not.
static boolean isPrime(int n)
 {
    
    for(int i=2;i*i<=n;i++) {
	count++;
        if(n%i==0)
            return false;
    }
    return true;
}
    public static void main(String args[])
    {
      int counter = 1;
      for(int i = 2; counter<=100; i++)
      {
          if(isPrime(i)==true)
          {
            System.out.print(" "+i);
            counter++;
          }
      }
    System.out.println("count: "+count);
    }
}