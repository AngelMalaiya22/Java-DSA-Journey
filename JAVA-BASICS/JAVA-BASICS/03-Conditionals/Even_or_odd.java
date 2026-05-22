package Conditional_Statements;

import java.util.Scanner;

public class Even_or_odd 
{
    public static void main(String args[])
    {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        num=sc.nextInt();
        if(num%2==0)
        {
            System.out.println("Number is even number ");
        }
        else 
        {
            System.out.println("Number is odd number ");
        }
    }
}
