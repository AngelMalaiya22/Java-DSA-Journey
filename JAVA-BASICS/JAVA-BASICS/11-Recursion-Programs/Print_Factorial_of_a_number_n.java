package Recursion_Programs;
import java.util.Scanner;
public class Print_Factorial_of_a_number_n 
{
    public static int fact(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        else
        {
            return n*fact(n-1);
        }
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=sc.nextInt();
        int result=fact(n);
        System.out.print("Factorial of the number is "+result);
    }
}
