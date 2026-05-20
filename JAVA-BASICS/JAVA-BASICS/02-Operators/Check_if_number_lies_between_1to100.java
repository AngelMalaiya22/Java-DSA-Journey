package Operators;

import java.util.Scanner;

public class Check_if_number_lies_between_1to100 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=sc.nextInt();
        if(num>=1 && num<=100)
        {
            System.out.println("Number is lies between 1 to 100");
        }
        else 
        {
            System.out.println("Number does not lies between 1 to 100");
        }
    }
}
