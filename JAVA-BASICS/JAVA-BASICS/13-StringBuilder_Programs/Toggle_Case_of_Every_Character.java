package StringBuilder_Programs;
import java.util.Scanner;

public class Toggle_Case_of_Every_Character 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str=sc.nextLine();
        
        StringBuilder sb=new StringBuilder(str);
        
        for(int i=0; i<sb.length(); i++)
        {
            char ch=sb.charAt(i);
            
            // If the character is uppercase, convert to lowercase
            if(Character.isUpperCase(ch))
            {
                sb.setCharAt(i, Character.toLowerCase(ch));
            }
            // If the character is lowercase, convert to uppercase
            else if(Character.isLowerCase(ch))
            {
                sb.setCharAt(i, Character.toUpperCase(ch));
            }
        }
        
        System.out.print("The updated string is : " + sb);
        
        sc.close();
    }
}