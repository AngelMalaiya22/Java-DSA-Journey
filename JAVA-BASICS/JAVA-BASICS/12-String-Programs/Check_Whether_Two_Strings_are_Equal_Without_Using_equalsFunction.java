package string_programs;
import java.util.Scanner;
public class Check_Whether_Two_Strings_are_Equal_Without_Using_equalsFunction
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENter the string 1 : ");
        String str1=sc.nextLine();
        System.out.print("Enter the string 2 : ");
        String str2=sc.nextLine();
        int c=0;
        if(str1.length() == str2.length())
        {
            for(int i=0;i<str1.length();i++)
            {
                if(str1.charAt(i) == str2.charAt(i))
                {
                    c++;
                }
            }
            if(c==str1.length())
            {
                System.out.println("Both string are equal");
            }
            else
            {
                System.out.println("Both string are not equal");
            }
        }
        else{
            System.out.println("BOth are not equal");
        }
    }
}
