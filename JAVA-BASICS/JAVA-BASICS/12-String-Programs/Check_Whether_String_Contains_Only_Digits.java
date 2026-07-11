package string_programs;
import java.util.Scanner;
public class Check_Whether_String_Contains_Only_Digits 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string :");
        String str=sc.nextLine();
        int c=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9')
            {
                c++;
            }
        }
        if(c==str.length())
        {
            System.out.println("The string contains only digits.");
        }
        else
        {
            System.out.println("The string does not contain only digits.");
        }
    }
}
