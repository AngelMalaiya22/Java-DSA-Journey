package string_programs;
import java.util.Scanner;
public class Count_UpperCase_and_LowerCase 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string :");
        String str=sc.nextLine();
        int countUpper=0,countLower=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)>='A' && str.charAt(i)<='Z')
            {
                countUpper++;
            }
            else if(str.charAt(i)>='a' && str.charAt(i)<='z')
            {
                countLower++;
            }
        }
        System.out.println("The number of uppercase characters in the string is "+countUpper);
        System.out.println("The number of lowercase characters in the string is "+countLower);
    }
}
