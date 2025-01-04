import java.util.Scanner;
public class Max_min
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int a,m,n,max=0,min=0;
        System.out.println("Enter the first number");
        n=in.nextInt();
        max=n;
        min=n;
        System.out.println("Enter the Remaining number");
        for(a=1;a<=10;a++)
        {
            m=in.nextInt();
            if(m<min)
            min=m;
            if(m>max)
            max=m;
            
            
        }
        System.out.println("The greatest number="+max);
        System.out.println("The smallest number="+min);
    }
}