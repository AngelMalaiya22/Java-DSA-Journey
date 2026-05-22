package Conditional_Statements;

import java.util.Scanner;

public class Pass_or_fail_system 
{
    public static void main(String args[])
    {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your marks : ");
        num=sc.nextInt();
        if(num>=33)
        {
            System.out.println("You have passed the exam ");
        }
        else 
        {
            System.out.println("You have failed the exam");
        }
    }    
}
