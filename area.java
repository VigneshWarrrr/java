//area of a square
import java.util.Scanner;
public class area
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        double a;
        System.out.println("Enter the Side of the Square");
        a=in.nextDouble();
        double b=a*a;
        System.out.println("The area is="+b);
    }
}