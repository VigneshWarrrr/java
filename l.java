import java.util.Scanner;
public class l
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        String a;
        System.out.println("Enter the name:");
        a=in.nextLine();
        int l=a.length();
        int b=a.lastIndexOf(' ');
        String s=a.substring(b+1);
        String I=a.substring(0,b);
        System.out.println(s+" "+I);
    }
}

        