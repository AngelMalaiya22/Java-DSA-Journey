package Recursion_Programs;
import java.util.Scanner;
public class Count_Digits_in_a_Number 
{
    public static void count(int num, int c)
    {
        if(num==0)
        {
            System.out.print(c);
            return;
        }
        c++;
        num/=10;
        count(num, c);
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int num=sc.nextInt();
        int c=0;
        count(num, c);
    }
}
