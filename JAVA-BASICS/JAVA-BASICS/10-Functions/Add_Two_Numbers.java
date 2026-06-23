package Functions;
import java.util.Scanner;
public class Add_Two_Numbers 
{
    public static int AddTwoNumbers(int a,int b)
    {
        int sum=a+b;
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of a : ");
        int a=sc.nextInt();
        System.out.print("Enter value of b : ");
        int b=sc.nextInt();
        int result=AddTwoNumbers(a,b);
        System.out.println("Sum of a and b is "+result);
    }
}
    