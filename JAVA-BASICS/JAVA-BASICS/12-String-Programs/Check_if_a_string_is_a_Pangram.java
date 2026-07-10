package string_programs;

import java.util.Scanner;

public class Check_if_a_string_is_a_Pangram 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();
        str = str.toLowerCase();
        
        boolean[] alphabetPresent = new boolean[26];
        int uniqueCount = 0;
        
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z')
            {
                int index = ch - 'a';
                if(!alphabetPresent[index])
                {
                    alphabetPresent[index] = true;
                    uniqueCount++;
                }
            }
        }
        
        if(uniqueCount == 26)
        {
            System.out.println("String is Pangram");
        }
        else
        {
            System.out.println("String is not Pangram");
        }
    }
}