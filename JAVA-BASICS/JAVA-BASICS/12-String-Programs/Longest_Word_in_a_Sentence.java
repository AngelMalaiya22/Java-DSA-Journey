package string_programs;
import java.util.Scanner;
public class Longest_Word_in_a_Sentence 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string :");
        String str=sc.nextLine();
        String wrd=" ";
        String longestwrd=" ";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i) !=' ')
            {
                wrd=wrd+str.charAt(i);
            }
            else
            {
                if(wrd.length()> longestwrd.length())
                {
                    longestwrd=wrd;
                }
                wrd=" ";
            }
        }
        System.out.println("Longest word is : "+longestwrd);
    }
}
