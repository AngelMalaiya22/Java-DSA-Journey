package StringBuilder_Programs;
import java.util.Scanner;

public class Check_Palindrome_Using_StringBuilder 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str=sc.nextLine();
        
        StringBuilder sb=new StringBuilder(str);
        
        // Reverse the content of the StringBuilder
        String reversedStr = sb.reverse().toString();
        
        // Compare the original string with the reversed string
        if(str.equalsIgnoreCase(reversedStr))
        {
            System.out.print("The string is a palindrome.");
        }
        else
        {
            System.out.print("The string is not a palindrome.");
        }
        
        sc.close();
    }
}