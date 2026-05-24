package Loops;

import java.util.Scanner;

public class Multiplication_table 
{
    public static void main(String args[])
    {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of which you want to print the table : ");
        num=sc.nextInt();
        for (int i=1;i<11;i++)
        {
            System.out.println(num+"*"+i+"="+(num*i));
        }
    }
    
}
