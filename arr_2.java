import java.util.Scanner;
public class arr_2
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int a[]=new int[20];
        System.out.println("Enter 20 temperatures:");
        double b;
        
        for(int i=0;i<20;i++)
        {
            a[i]=in.nextInt();
        }
        for(int i=0;i<20;i++)
        {
            b=(5*(a[i]-32))/9;
            System.out.println(+b);
        }
        
}
}