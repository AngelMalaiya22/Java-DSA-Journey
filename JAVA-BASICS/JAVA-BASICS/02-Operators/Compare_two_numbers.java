package Operators;

import java.util.Scanner;

public class Compare_two_numbers
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a ");
        int a=sc.nextInt();
        System.out.println("Enter the value of b ");
        int b=sc.nextInt();
        if(a>b)
        {
            System.out.println("A is greater than b");
        }
        else if (a<b)
        {
            System.out.println("B is greater than A");
        }
        else
        {
            System.out.println("A and B are equal");
        }
    }
    
}
