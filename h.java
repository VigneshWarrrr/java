import java.util.Scanner;
public class h
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        String a;
        System.out.println("Enter the Name with space in the begining:");
        a=in.nextLine();
        String b="";
        
        int l=a.length();
        for(int i=0;i<l;i++)
        {
            char ch=a.charAt(i);
            if(ch==' ')
            {
                char bc=a.charAt(i+1);
                System.out.print(bc+" ");
            }
            
        }
        
        
    }
}
