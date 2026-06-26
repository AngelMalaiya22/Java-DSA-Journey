package Functions;

import java.util.Scanner;

public class Menu_Driven_Function_Program
{
    public static void Add_Two_Numbers(int a,int b)
    {
        int sum = a + b;

        System.out.println("Sum of a and b is " + sum);
    }

    public static void Subtraction(int a,int b)
    {
        int diff = a - b;

        System.out.println("Difference of a and b is " + diff);
    }

    public static void Prime_Check(int num)
    {
        int c = 0;

        for(int i = 2; i < num; i++)
        {
            if(num % i == 0)
            {
                c++;
            }
        }

        if(c == 0)
        {
            System.out.println("Number is a prime number");
        }
        else
        {
            System.out.println("Number is not a prime number");
        }
    }

    public static void Factorial(int num)
    {
        int fact = 1;

        for(int i = 1; i <= num; i++)
        {
            fact = fact * i;
        }

        System.out.println("Factorial of the number is " + fact);
    }

    public static void main(String args[])
    {
        System.out.println("Menu Driven Function Program");

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Prime Check");
        System.out.println("4. Factorial");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your choice : ");

        int choice = sc.nextInt();

        System.out.println("Enter value of a : ");

        int a = sc.nextInt();

        System.out.println("Enter value of b : ");

        int b = sc.nextInt();

        switch(choice)
        {
            case 1:
                Add_Two_Numbers(a,b);
                break;

            case 2:
                Subtraction(a,b);
                break;

            case 3:
                Prime_Check(a);
                break;

            case 4:
                Factorial(a);
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}