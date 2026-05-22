package Conditional_Statements;

import java.util.Scanner;

public class Grade_calculator 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int marks;
        System.out.print("Enter your marks : ");
        marks=sc.nextInt();
        if(marks>=90)
        {
            System.out.println("Your Grade is A");
        }
        else if (marks>=80)
            {
                System.out.println("Your Grade is B");
            }
            else if (marks>=70)
            {
                System.out.println("Your Grade is C");
            }
            else if (marks>=60)
            {
                System.out.println("Your Grade is D");
            }
            else 
            {
                System.out.println("Your Grade is F");
            }
    }
    
}
