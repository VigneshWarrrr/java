import java.util.Scanner;
public class arr_3
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int a,b,c=0;
        
        System.out.println("Enter 1st Integer");
        System.out.println("Enter 2nd Integer");
        a=in.nextInt();
        b=in.nextInt();
        c=a+b;
        System.out.println("The result is="+c);
    }
}