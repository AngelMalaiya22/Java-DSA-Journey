package string_programs;
import java.util.Scanner;

public class Find_Longest_Word_in_a_Sentence {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence : ");
        String str = sc.nextLine();
        
        str = str + " ";
        String longest = "";
        String wrd = "";
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                wrd = wrd + str.charAt(i);
            } else {
                if (wrd.length() > longest.length()) {
                    longest = wrd;
                }
                wrd = "";
            }
        }
        
        System.out.println("Longest Word of the sentence is :" + longest);
    }
}