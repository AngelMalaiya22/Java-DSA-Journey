package Recursion_Programs;
import java.util.Scanner;
public class Print_the_fibonacci_sequence_till_nth_term 
{
    public static void fibo(int a, int b, int c, int n)
    {
        if(n==0)
        {
            return;
        }
        else
        {
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
            fibo(a, b, c, n-1);
        }

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the range : ");
        int n=sc.nextInt();
        int a=0,b=1,c=0;
        System.out.print(a+" "+b+" ");
        fibo(a, b, c, n);
        
    }
}
