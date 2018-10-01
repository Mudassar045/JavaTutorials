public class LoopPractice
{
    public static void main(String args[])
    {
        int i = 0; 
        int counter = 0;
        /*for(;i<=counter;i++)
        {
            counter+=2;
            if(counter>=250)
            break;
        }
                System.out.println(String.format("Value of i = %d, Value of counter=%d",i,counter));
        */
        while(true)
        {
            counter+=2*3;
            if(counter>=250)
            break;
            
        }
        System.out.println(String.format("Value of counter=%d",counter));
    }
}