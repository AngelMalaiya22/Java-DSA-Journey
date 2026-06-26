package Functions;
import java.util.Scanner;
public class Palindrome_number 
{
    public static int reverse(int num)
    {
        int rev=0,d;
        while(num!=0)
        {
            d=num%10;
            rev=rev*10+d;
            num=num/10;
        }
        return rev;
    }
    public static int palindrome(int num)
    {
        int Reverse=reverse(num);
        if(Reverse==num)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=sc.nextInt();
        int r = palindrome(num);
        if(r==0)
        {
            System.out.println("Number is a palindrome number ");
        }
        else
        {
            System.out.println("Number is not a palindrome number ");
        }
    }
}
