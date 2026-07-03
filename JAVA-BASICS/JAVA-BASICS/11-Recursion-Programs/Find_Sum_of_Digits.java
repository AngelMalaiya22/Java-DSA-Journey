package Recursion_Programs;
import java.util.Scanner;
public class Find_Sum_of_Digits 
{
    public static void addition(int num, int sum)
    {
        if(num==0)
        {
            System.out.print(sum);
            return;
        }
        sum=sum+(num%10);
        num/=10;
        addition(num, sum);
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int num=sc.nextInt();
        int sum=0;
        addition(num, sum);
    }
    
}
