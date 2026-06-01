package Numbers_Based_Program;

import java.util.Scanner;

public class Palindrome_number 
{
    public static void main(String args[])
    {
        int num, n, d=0,rev=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        num=sc.nextInt();
        n=num;
        while(num!=0)
        {
            d=num%10;
            rev=rev*10+d;
            num=num/10;
        }
        if(n==rev)
        {
            System.out.println("The number is a Palindrome number ");
        }
        else 
        {
            System.out.println("The number is not a palindrome number");
        }
    }
    
}
