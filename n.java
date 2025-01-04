import java.util.Scanner;
public class n
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        String a;
        System.out.println("Enter the Sentence/Word:");
        a=in.nextLine();
        String c="";
        int l=a.length();
        String b=a.toUpperCase();
        for(int i=0;i<l;i++)
        {
            char ch=b.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {
                continue;
            }
            c=c+ch;
        }
        System.out.println(c);
    }
}