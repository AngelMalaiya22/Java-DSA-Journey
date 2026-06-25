package Functions;
import java.util.Scanner;
public class Find_Sum_of_Digits 
{
    public static int SumOfDigits(int num)
    {
        int sum=0,d;
        while(num!=0)
        {
            d=num%10;
            sum=sum+d;
            num=num/10;
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=sc.nextInt();
        int sum=SumOfDigits(num);
        System.out.println("Sum of digits is "+sum);
    }
    
}
