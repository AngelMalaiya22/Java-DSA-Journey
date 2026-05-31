package Numbers_Based_Program;

import java.util.Scanner;

public class Fibonacci_Series
{
    public static void main(String args[])
    {
        int a = 0, b = 1, c;
        int range;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the range of fibo series : ");
        range = sc.nextInt();

        System.out.print(a + " " + b + " ");

        for(int i = 1; i <= range - 2; i++)
        {
            c = a + b;

            System.out.print(c + " ");

            a = b;
            b = c;
        }
    }
}