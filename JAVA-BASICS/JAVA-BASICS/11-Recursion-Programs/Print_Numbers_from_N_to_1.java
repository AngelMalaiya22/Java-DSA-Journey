package Recursion_Programs;
import java.util.Scanner;
public class Print_Numbers_from_N_to_1 
{
    public static void print(int N)
    {
        if(N==0)
        {
            return;
        }
        else
        {
            System.out.print(N+" ");
            print(N-1);
        }
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the range : ");
        int N=sc.nextInt();
        print(N);
    }
}
