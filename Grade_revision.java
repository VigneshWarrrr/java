import java.util.Scanner;
public class Grade_revision
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int bas,ex,op=0;
        double nbas;
        String nm;
        System.out.println("Enter you name:");
        nm=in.nextLine();
        System.out.println("Enter your Salary:");
        System.out.println("Enter your Experience");
        bas=in.nextInt();
        ex=in.nextInt();
        op=bas;
        nbas=in.nextDouble();
        if(ex>0&&ex<=3)
        {
            nbas=1000+(op*0.1);
        }
        else if(ex>3&&ex<=5)
        {
            nbas=3000+(op*0.12);
        }
        else if (ex>5&&ex<=10)
        {
            nbas=5000+(op*0.15);
        }
        else if(ex>10)
        {
            nbas=8000+(op*0.20);
        }
        
        System.out.println("Name:"+nm);
        System.out.println("Salary:"+bas);
        System.out.println("Experience="+ex);
        System.out.println("Increment of Salary="+nbas);
    }
}