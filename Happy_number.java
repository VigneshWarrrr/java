import java.util.Scanner;
public class Happy_number
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int num,sum=0,d=0;
        System.out.println("Enter the number");
        num=in.nextInt();
        sum=num;
        do
        {
            num=sum;
            sum=0;
            do
            {
                d=num%10;
                sum=sum+d*d;
                num=num/10;
            }
            while(num>0);
        }while(sum>0);
        
        if(sum==1)
        System.out.println("It is a Happy Number");
        else
        System.out.println("It is not a Happy Number");
    }
}
