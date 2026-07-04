package Recursion_Programs;

public class Print_Number_from_1_to_5 
{
    public static void print(int n)
    {
        if(n==6)
        {
            return;
        }
        System.out.print(n+" ");
        print(n+1);
    }
    public static void main(String args[])
    {
        print(1);
    }
}
