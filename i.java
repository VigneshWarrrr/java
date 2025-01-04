import java.util.Scanner;
public class i
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        String a;
        System.out.println("Enter the String with a space in the begining :");
        a=in.nextLine();
        String b="";
        int l=a.length();
        for(int i=0;i<l;i++)
        {
            char ch=a.charAt(i);
            if(ch==' ')
            {
                char bc=a.charAt(i+1);
                b=b+bc;
            }
        }
        System.out.print(b);
    }
}