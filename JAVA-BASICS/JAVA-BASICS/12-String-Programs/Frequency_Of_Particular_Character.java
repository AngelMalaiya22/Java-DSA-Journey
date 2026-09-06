package string_programs;
import java.util.Scanner;
public class Frequency_Of_Particular_Character 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string :");
        String str=sc.nextLine();
        System.out.print("Enter the character of which you want to find frequency :");
        char s=sc.next().charAt(0); 
        int freq=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==s)
            {
                freq++;
            }
        }
        System.out.println("Frequency of the character '" + s + "' in the string is: " + freq);
    }
    
}
