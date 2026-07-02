package Recursion_Programs;
import java.util.Scanner;
public class Find_Product_of_Digits 
{
    public static void addition(int num, int prod)
    {
        if(num==0)
        {
            System.out.print(prod);
            return;
        }
        prod=prod*(num%10);
        num/=10;
        addition(num, prod);
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int num=sc.nextInt();
        int prod=1;
        addition(num, prod);
    }
}
