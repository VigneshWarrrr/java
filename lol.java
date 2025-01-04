import java.util.Scanner;
public class lol
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        String Str;
        System.out.println("Enter the word or sentence:");
        Str=in.nextLine();
        int b=0,c=0;
        int len=Str.length();
        for(int i=0;i<=len;i++)
        {
            char ch=Str.charAt(i);
            if(ch==' ')
            b=b+1;
            else
            c=c+1;
        }
        System.out.println("The number of words="+b);
        System.out.println("The Number of letters in the Sentence or word="+c);
    }
}
