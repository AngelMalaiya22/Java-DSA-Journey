package Recursion_Programs;
import java.util.Scanner;
public class Find_GCD_of_Two_Numbers 
{
    public static void GCD(int num1, int num2, int max, int i, int range)
    {
        if(i==range)
        {
            System.out.print(max);
            return;
        }
        else
        {
            if(num1%i==0 && num2%i==0)
            {
                if(max<i)
                {
                    max=i;
                }
            }
            GCD(num1, num2, max, i+1, range);
        }
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number 1 : ");
        int num1=sc.nextInt();
        System.out.print("Enter the number 2 : ");
        int num2=sc.nextInt();
        int max=0;
        int i=1;
        int range;
        if(num1>num2)
        {
            range=num1;
        }
        else
        {
            range=num2;
        }
        GCD(num1, num2, max, i, range);
    }
}
