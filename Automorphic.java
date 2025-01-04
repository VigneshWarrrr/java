//a number is said to be automorphic if the square of the number contains the original number
import java.util.Scanner;
public class Automorphic
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int num,f=0,p;
        System.out.println("Enter a number");
        num=in.nextInt();
        p=num*num;
        do
        {
            if(num%10!=p%10)
            {
            f=f+1;
            break;
        }
        else
        {
            num=num/10;
            p=p/10;
        }
        
        }
        while(num>0);
        if(f==0)
        System.out.println("It is an Automorphic Number");
        else
        System.out.println("It is not an Automorphic Number");
    }
}