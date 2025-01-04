//if the sum of the cubes of a given number is equal to the number then it is called a Armstrong number
import java.util.Scanner;
public class Armstrong
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int a,s=0,num,n;
        System.out.println("Enter a number");
        n=in.nextInt();
        num=n;
        while(n>0)
        {
            a=n%10;
            s=s+a*a*a;
            n=n/10;
        }
        if(num==s)
            System.out.println("It is an Armstrong number");
            else
            System.out.println("It is not an Armstrong number");
        }
    }
            
            
        
    
