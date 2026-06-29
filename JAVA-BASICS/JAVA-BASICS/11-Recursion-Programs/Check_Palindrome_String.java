package Recursion_Programs;
import java.util.Scanner;
public class Check_Palindrome_String 
{
    public static void palindrome(String str, String rev, int index)
    {
        if(index == -1)
        {
            if(rev.equals(str))
            {
                System.out.print("True");
                return;
            }
            else
            {
                System.out.print("False");
                return;
            }
        }
        else
        {
            rev = rev + str.charAt(index);
            palindrome(str, rev, index - 1);
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();
        String rev = "";
        int index = str.length() - 1;
        palindrome(str, rev, index);
    }
}