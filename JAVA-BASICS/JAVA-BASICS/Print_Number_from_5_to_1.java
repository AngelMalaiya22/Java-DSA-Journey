package Recursion_Programs;

public class Print_Number_from_5_to_1 
{
    public static void print(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        print(n-1);
    }

    public static void main(String args[])
    {
        print(5);
    }
}
