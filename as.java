import java.util.Scanner;
public class as
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int i,a[]=new int[10];
        for(i=0;i<10;i++)
        {
            System.out.println("Enter the numbers:");
            a[i]=in.nextInt();
        }
        for(i=0;i<10;i++)
        {
            if(a[i]<0)
            {
                System.out.print(","+a[i]);
            }
        }
        for(i=0;i<10;i++)
        {
            if(a[i]>0)
            {
                System.out.print(","+a[i]);
            }
        }
    }
}