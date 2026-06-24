package Functions;
import java.util.Scanner;
public class Count_Digits 
{
    public static int CountDigits(int num)
    {
        int c=0;
        while(num!=0)
        {
            c++;
            num=num/10;
        }
        return c;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int num=sc.nextInt();
        int result=CountDigits(num);
        System.out.println("Number of digits in the number is "+result);
    }
    
}
