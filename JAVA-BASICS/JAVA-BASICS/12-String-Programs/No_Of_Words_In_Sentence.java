package string_programs;
import java.util.Scanner;
public class No_Of_Words_In_Sentence 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string :");
        String str=sc.nextLine();
        int count=1;
        String space=" ";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i) == space.charAt(0))
            {
                count++;
            }
        }
        System.out.println("The number of words in the sentence is : "+count);
    }
}
