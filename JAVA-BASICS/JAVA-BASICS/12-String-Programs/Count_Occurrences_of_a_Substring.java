package string_programs;
import java.util.Scanner;

public class Count_Occurrences_of_a_Substring 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the main string :");
        String str = sc.nextLine();
        System.out.print("Enter the substring :");
        String s = sc.nextLine();
        
        // Edge case: If substring is empty or larger than the main string, it's impossible to match
        if (s.isEmpty() || str.isEmpty() || s.length() > str.length()) {
            System.out.println("Number of occurrences of the substring: 0");
            return;
        }

        int count = 0;

        // Loop only as long as the substring can physically fit inside the main string
        for (int i = 0; i <= str.length() - s.length(); i++) {
            boolean matchFound = true;
            
            // Check every character of the substring against the main string starting at 'i'
            for (int j = 0; j < s.length(); j++) {
                if (str.charAt(i + j) != s.charAt(j)) {
                    matchFound = false; // Mismatch found, stop looking here
                    break;
                }
            }
            
            // If the inner loop finished without resetting our boolean flag, we found a match!
            if (matchFound) {
                count++;
            }
        }
        
        System.out.println("Number of occurrences of the substring: " + count);
    }
}