package Functions;
import java.util.Scanner;
public class Check_Even_or_Odd 
{
    public static int CheckEvenOrOdd(int num)
    {
        if(num%2==0)
        {
            return 0;
        }
        else 
        {
            return 1;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int num=sc.nextInt();
        int result=CheckEvenOrOdd(num);
        if(result==0)
        {
            System.out.println("NUmber is even number");
        }
        else 
        {
            System.out.println("Number is odd number ");
        }
    }
}

