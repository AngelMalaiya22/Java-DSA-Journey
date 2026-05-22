package Conditional_Statements;

import java.util.Scanner;

public class Simple_calculator_using_switch 
{
    public static void main(String args[])
    {
        int a, b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a:");
        a=sc.nextInt();
        System.out.println("Enter the value of b :");
        b=sc.nextInt();
        System.out.println("ENter your choice : ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");   
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int choice;
        choice=sc.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("Result of Addition is: " + (a+b));
                break;
            case 2:
                System.out.println("Result of Subtraction is: " + (a-b));
                break;
            case 3:
                System.out.println("Result of Multiplication is: " + (a*b));
                break;
            case 4:
                System.out.println("Result of Division is: " + (a/b));
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
    
}
