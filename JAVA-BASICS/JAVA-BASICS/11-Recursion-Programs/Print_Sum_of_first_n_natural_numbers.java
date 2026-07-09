package Recursion_Programs;
import java.util.Scanner;
public class Print_Sum_of_first_n_natural_numbers 
{
    public static void add(int i, int n, int sum)
    {
        if(i==n)
        {
            sum=sum+i;
            System.out.println(sum);
            return;
        }
        sum=sum+i;
        add(i+1,n,sum);
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the range : ");
        int n=sc.nextInt();
        int sum=0;
        int i=1;
        add(i, n, sum);
    }
}
