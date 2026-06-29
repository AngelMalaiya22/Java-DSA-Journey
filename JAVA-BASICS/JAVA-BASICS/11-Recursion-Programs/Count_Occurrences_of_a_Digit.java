package Recursion_Programs;
import java.util.Scanner;
public class Count_Occurrences_of_a_Digit 
{
    public static void CountDigit(int num, int n, int c)
    {
        if(num==0)
        {
            System.out.print(c);
            return;
        }
        else
        {
            if((num%10)==n)
            {
                c++;
            }
            num/=10;
            CountDigit(num, n, c);
        }
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=sc.nextInt();
        int c=0;
        System.out.print("Enter the digit for counting occurrences : ");
        int n=sc.nextInt();
        CountDigit(num, n, c);
    }
    
}
