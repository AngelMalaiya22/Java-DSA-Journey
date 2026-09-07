package string_programs;
import java.util.Scanner;
public class Remove_All_Occurrences_of_a_Character 
{
    public static void main(String args[])
    {
        String str;
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string : ");
        str=sc.nextLine();
        System.out.print("Enter the character : ");
        ch=sc.next().charAt(0);
        String newstr="";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=ch)
            {
                newstr=newstr+str.charAt(i);
            }
        }
        System.out.println("String after removing all occurrences of the character: " + newstr);
    }
}
