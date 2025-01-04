import java.util.Scanner;
public class f
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        String a;
        System.out.println("Enter the String with a space in the begining:");
        a=in.nextLine();
        String b="";
        String c="";
        int l=a.length();
        for(int i=0;i<l;i++)
        {
            char ch=a.charAt(i);
            int g=i;
            int h=a.indexOf(' ',i+1);
            if(ch==' ')
            {
                b=a.substring(g,h);
                
            }
        }
        int v=b.length();
        for(int j=v-1;j>=0;j--)
        {
            char bc=b.charAt(j);
            c=c+bc;
            if(c==b)
            System.out.print(c+" ");
        }
    }
}
        