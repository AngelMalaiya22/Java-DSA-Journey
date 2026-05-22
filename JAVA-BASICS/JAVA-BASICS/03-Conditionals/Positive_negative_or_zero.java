package Conditional_Statements;

import java.util.Scanner;

public class Positive_negative_or_zero 
{
    public static void main(String args[])
    {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        num=sc.nextInt();
        if(num>0)
        {
            System.out.println("NUmber is positive");
        }
        else if(num<0)
        {
            System.out.println("Number is negative");
        }
        else 
        {
            System.out.println("Number is equal to zero");
        }

    }
    
}
