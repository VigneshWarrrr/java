//if the sum of the digits of the square of a number is equal to the original number then it is called a neon number
import java.util.Scanner;
public class Neon
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int p,n,d,s=0;
        System.out.println("Enter a number");
        n=in.nextInt();
        p=n*n;
        do
        {
            d=p%10;
            s=s+d;
            p=p/10;
        }
            while(p!=0);
        if(s==n)
            System.out.println("It is a neon number");
        else
            System.out.println("It is not a neon number");
        }
    }
