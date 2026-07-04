package Recursion_Programs;
import java.util.Scanner;
public class Print_a_Reverse_of_the_String 
{
    public static void reverse(String str, int i)
    {
        if(i<0)
        {
            return;
        }
        else
        {
            System.out.print(str.charAt(i));
            reverse(str,i-1);
        }
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string :");
        String str=" ";
        str=sc.nextLine();
        int i=str.length()-1;
        System.out.print("The Reverse of the string is : ");
        reverse(str,i);
    }
}
