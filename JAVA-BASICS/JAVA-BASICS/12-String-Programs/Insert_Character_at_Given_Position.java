package string_programs;

import java.util.Scanner;

public class Insert_Character_at_Given_Position 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the string : ");
        String str = sc.nextLine();
        
        System.out.print("Enter the character you want to insert in the string : ");
        char ch = sc.next().charAt(0);
        
        System.out.print("Enter the position at which you want to insert : ");
        int index = sc.nextInt();
        
        String s = "";
        
        for(int i = 0; i <= str.length(); i++)
        {
            if(i == (index - 1))
            {
                s = s + ch;
            }
            
            if(i < str.length())
            {
                s = s + str.charAt(i);
            }
        }
        
        System.out.println("The updated string is " + s);
    }
}