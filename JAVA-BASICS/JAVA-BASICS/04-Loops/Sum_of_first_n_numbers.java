package Loops;

import java.util.Scanner;

public class Sum_of_first_n_numbers 
{
    public static void main(String args[])
        {
            int n;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number of till which you want to print the sum : ");
            n=sc.nextInt();
            int sum=0;
            for(int i=0;i<=n;i++)
            {
                sum=sum+i;
            }
            System.out.println("The sum of first "+n+" number is : "+sum);
        }
    
}
