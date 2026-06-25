package Functions;
import java.util.Scanner;
public class Maximum_of_Two_Number 
{
    public static int Max(int a,int b)
    {
        if(a>b)
        {
            return a;
        }
        else 
        {
            return b;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of a :");
        int a=sc.nextInt();
        System.out.print("Enter the value of b :");
        int b=sc.nextInt();
        int result=Max(a,b);
        System.out.println("Maximum of two numbers is : "+result);
    }
    
}
