package Recursion_Programs;
import java.util.Scanner;
public class Check_Palindrome_Number 
{
    public static void palindrome(int num, int rev, int n)
    {
        if(num==0)
        {
            if(n==rev)
            {
                System.out.println("True");;
            }
            else
            {
                System.out.println("False");
            }
        }
        else
        {
            rev=rev*10+(num%10);
            num=num/10;
            palindrome(num, rev, n);
        }
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int num=sc.nextInt();
        int rev=0;
        int n=num;
        palindrome(num, rev, n);
    }
}
