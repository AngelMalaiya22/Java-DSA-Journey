package string_programs;
import java.util.Scanner;
public class First_Non_Repeating_Character 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++)
        {
            int freq=0;
            for(int j=0;j<str.length();j++)
            {
                if(str.charAt(i)==str.charAt(j) && i!=j)
                {
                    freq++;
                }
            }
            if(freq==0)
            {
                System.out.println("First non-repeating character in the string is: " + str.charAt(i));
                break;
            }
        }
    }
    
}
