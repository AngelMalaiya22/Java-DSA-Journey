package Functions;
import java.util.Scanner;
public class Reverse_function 
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
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=sc.nextInt();
        int result=reverse(num);
        System.out.println("The reverse of the number is "+result);
    }
}
