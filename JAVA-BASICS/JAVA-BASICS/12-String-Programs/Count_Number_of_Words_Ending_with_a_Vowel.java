package string_programs;
import java.util.Scanner;
public class Count_Number_of_Words_Ending_with_a_Vowel 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enetr the string :");
        String str=sc.nextLine();
        int count=0;
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
            {
                if(str.charAt(i-1)=='a' || str.charAt(i-1)=='e' || str.charAt(i-1)=='i' || str.charAt(i-1)=='o' || str.charAt(i-1)=='u')
                {
                    count++;
                }
            }
        }
        if(str.charAt(str.length()-1)=='a' || str.charAt(str.length()-1)=='e' || str.charAt(str.length()-1)=='i' || str.charAt(str.length()-1)=='o' || str.charAt(str.length()-1)=='u')
        {
            count++;
        }
        System.out.println("Number of words ending with a vowel : " + count);
    }
    
}
