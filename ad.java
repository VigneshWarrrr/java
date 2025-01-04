import java.util.Scanner;
public class ad
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int a[]=new int[10];
        int i,n=0,p=0;
        System.out.println("Enter the 10 numbers:");
        for(i=0;i<a.length;i++)
        {
            a[i]=in.nextInt();
        }
        for(i=0;i<a.length;i++)
        {
            if(a[i]<0)
            {
            n=a[i];
            System.out.print(+n+",");
        }
    }
    for(i=0;i<a.length;i++)
    {
             if(a[i]>0)
            {
                p=a[i];
                System.out.print(+p+",");
            }
        }
            
            
        
    }
}