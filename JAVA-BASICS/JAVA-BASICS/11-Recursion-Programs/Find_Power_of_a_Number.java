package Recursion_Programs;
import java.util.Scanner;

public class Find_Power_of_a_Number 
{
    public static int power(int n, int p)
    {
        if (p == 0) 
        {
            return 1;
        }
        return n * power(n, p - 1);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("Enter the power : ");
        int p = sc.nextInt();
        
        int result = power(n, p);
        System.out.println("Result: " + result);
    }
}