public class Task3
{
    public static void main(String args[])
    {
        int max = 500;
        for (int i = 1; i <= max; i++)
        {
            int num = i, temp=0;
            while (num > 0)
            {
                int k = num % 10;
                temp = temp + k*k*k;
                num = num / 10;
            }
            if (temp == i)
                System.out.println(i);
        } 
    }
}