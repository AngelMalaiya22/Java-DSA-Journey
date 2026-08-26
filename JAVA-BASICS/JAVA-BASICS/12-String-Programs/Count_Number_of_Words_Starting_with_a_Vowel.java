package string_programs;
import java.util.Scanner;
public class Count_Number_of_Words_Starting_with_a_Vowel 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string :");
        String str=sc.nextLine();
        int count=0;
        str=str.toLowerCase();
        if(str.charAt(0)=='a' || str.charAt(0)=='e' || str.charAt(0)=='i' || str.charAt(0)=='o' || str.charAt(0)=='u')
        {
            count++;
        }
        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
            {
                if(str.charAt(i+1)=='a' || str.charAt(i+1)=='e' || str.charAt(i+1)=='i' || str.charAt(i+1)=='o' || str.charAt(i+1)=='u')
                {
                    count++;
                }
            }
        }
        System.out.println("Number of words starting with a vowel : " + count);
    }
    
}
