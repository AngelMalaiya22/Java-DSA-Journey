package string_programs;
import java.util.Scanner;

public class String_Compression 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String str = sc.nextLine();
        
        // Edge case: Handle empty or single-character inputs safely
        if (str == null || str.length() == 0) {
            System.out.println("Compressed string : ");
            return;
        }

        StringBuilder compress = new StringBuilder(); 
        int count = 1; // Start counting the current character

        // A single loop to check consecutive characters
        for (int i = 0; i < str.length(); i++) {
            
            // If the next character matches the current one, increment the streak
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } 
            // If the next character is different (or we reached the end of the string)
            else {
                compress.append(str.charAt(i)).append(count);
                count = 1; // Reset the count for the next unique character
            }
        }
        
        System.out.println("Compressed string : " + compress.toString());
    }
}