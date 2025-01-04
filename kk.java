import java.util.Scanner;
public class kk
{
    public static void main()
    {
       Scanner in=new Scanner(System.in);
        String a;
        System.out.println("Enter the String:");
        a=in.nextLine();
        String c="";
        
        String b=a.toUpperCase();
        for(int i=0;i<b.length();i++)
        {
            char ch=b.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {
                 c=c+'*';
                 continue;
                }
                else if(ch=='B'||ch=='C'||ch=='D'||ch=='F'||ch=='G'||ch=='H'||
                ch=='J'||ch=='K'||ch=='L'||ch=='M'||ch=='N'||ch=='P'||ch=='Q'||
                ch=='R'||ch=='S'||ch=='T'||ch=='V'||ch=='W'||ch=='X'||ch=='Y'||
                ch=='Z')
                 
                 {
                 c=c+'@';
                }
                else
                {
                    c=c+'#';
                }
    }
    System.out.println(c);
}
}