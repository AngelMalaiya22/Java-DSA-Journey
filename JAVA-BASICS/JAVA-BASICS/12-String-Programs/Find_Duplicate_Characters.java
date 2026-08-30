package string_programs;
import java.util.Scanner;

public class Find_Duplicate_Characters 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string :");
        String s = sc.nextLine();
        
        // Convert string to character array to allow modification
        char[] ch = s.toCharArray();
        int freq;
        
        for(int i = 0; i < ch.length; i++)
        {
            // If the character is already processed, skip it
            if(ch[i] == '0' || ch[i] == ' ') {
                continue;
            }
            
            freq = 1; // Start count at 1 for the current character
            
            // Look ahead for duplicates
            for(int j = i + 1; j < ch.length; j++)
            {
                if(ch[i] == ch[j])
                {
                    freq++;
                    ch[j] = '0'; // Mark as visited so we don't count it again
                }
            }
            
            // If frequency is greater than 1, it's a duplicate
            if(freq > 1)
            {
                System.out.println(ch[i] + " appears " + freq + " times");
            }
        }
        sc.close(); // Good practice to close the scanner
    }
}