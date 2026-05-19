package Operators;

import java.util.Scanner;

public class Find_largest_among_3_numbers 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of a :");
        int a=sc.nextInt();
        System.out.print("enter the value of b :");;
        int b=sc.nextInt();
        System.out.print("Enter the value of c :");
        int c=sc.nextInt();
        if(a>b && a>c)
        {
            System.out.println("A is the largest number");
        }
        else if (b>a && b>c)
        {
            System.out.println("B is the largest number");
        }
        else if (c>a && c>b) 
        {
            System.out.println("C is the largest number");
        }
        else 
        {
            System.out.println("All numbers are equal");
        }
    }
    
}
