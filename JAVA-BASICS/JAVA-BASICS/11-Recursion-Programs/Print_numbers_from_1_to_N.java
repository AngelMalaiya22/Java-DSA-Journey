package Recursion_Programs;
import java.util.Scanner;
public class Print_numbers_from_1_to_N 
{
    public static void print(int i, int N)
    {
        if(i==(N+1))
        {
            return;
        }
        else
        {
            System.out.print(i+" ");
            print(i+1,N);
        }
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the range : ");
        int N=sc.nextInt();
        int i=1;
        print(i, N);
    }
    
}
