import java.util.Scanner;
public class arr_1
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int a[]=new int[20];
        System.out.println("Enter the 20 numbers:");
        int e=0,o=0;
        for(int i=0;i<20;i++)
        {
            a[i]=in.nextInt();
            
        }
        for(int i=0;i<20;i++)
        {
            if(a[i]%2==0)
            e+=a[i];
            else
            o+=a[i];
        }
        System.out.println("The Sum of Even numbers="+e);
        System.out.println("The Sum of Odd numbers="+o);
    }
}