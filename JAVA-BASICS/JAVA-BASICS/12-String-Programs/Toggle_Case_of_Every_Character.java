package string_programs;
import java.util.Scanner;
public class Toggle_Case_of_Every_Character 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)>='A' && str.charAt(i)<='Z')
            {
                System.out.print((char)(str.charAt(i)+32));
            }
            else if(str.charAt(i)>='a' && str.charAt(i)<='z')
            {
                System.out.print((char)(str.charAt(i)-32));
            }
            else
            {
                System.out.print(str.charAt(i));
            }
        }
    }
    
}
