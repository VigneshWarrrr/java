import java.util.Scanner;
public class calculator_switch
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        char op;
        double a,b;
        System.out.println("Enter the first number");
        a=in.nextDouble();
        System.out.println("Enter the second number");
        b=in.nextDouble();
        System.out.println("**Menu**");
        System.out.println("Enter any operator(either-+,-,*,/ or %)");
        System.out.println("Enter your choice");
        op=in.next().charAt(0);
        switch(op)
        {
            case'+':
            double sum=a+b;
            System.out.println("The Sum="+sum);
            break;
            case'-':
            double diff=a-b;
            System.out.println("The Difference="+diff);
            break;
            case'*':
            double pro=a*b;
            System.out.println("The Product="+pro);
            break;
            case'/':
            double q=a/b;
            System.out.println("The Quotient="+q);
            break;
            case'%':
            double re=a%b;
            System.out.println("The remainder="+re);
            break;
            default:
            System.out.println("Wrong Choice");
            
            }
        }
    }
            
        
        
        
    
