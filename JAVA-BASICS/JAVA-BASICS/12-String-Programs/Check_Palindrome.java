package string_programs;
import java.util.Scanner;
public class Check_Palindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENter the string  : ");
        String str=sc.nextLine();
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        if(rev.equals(str))
        {
            System.out.println("THe string is palindrome string ");
        }
        else 
        {
            System.out.println("The string is not a palindrome string ");
        }
    }
}
