import java.util.Scanner;
public class gg
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        boolean a;
        char b;
        System.out.println("Enter the Letter or Digit:");
        b=in.next().charAt(0);
        a=Character.isLetterOrDigit(b);
        System.out.println(a);
        
    }
}
