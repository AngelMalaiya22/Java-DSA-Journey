package string_programs;
import java.util.Scanner;
public class Check_Palindrome_String 
{   
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str=sc.nextLine();
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        if(str.equals(rev))
        {
            System.out.println("The string is palindrome ");
        }
        else 
        {
            System.out.println("The string is not a palindrome ");
        }
    }
    
}
