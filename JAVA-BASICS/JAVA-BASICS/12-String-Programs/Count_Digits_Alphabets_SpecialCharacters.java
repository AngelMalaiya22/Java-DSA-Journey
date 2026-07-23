package string_programs;
import java.util.Scanner;
public class Count_Digits_Alphabets_SpecialCharacters 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string :");
        String str=sc.nextLine();
        int aCount=0,dCount=0,sCount=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
            {
                aCount++;
            }
            else if(ch>='0' && ch<='9')
            {
                dCount++;
            }
            else 
            {
                sCount++;
            }
        }
        System.out.println("The number of alphabets in the string is "+aCount);
        System.out.println("The number of digits in the string is "+dCount);
        System.out.println("The number of special characters in the string is "+sCount);
    }
    
}
