package StringBuilder_Programs;
import java.util.Scanner;
public class Reverse_a_String_Using_StringBuilder 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String input = sc.nextLine();
        StringBuilder sb = new StringBuilder(input);
        System.out.println(sb.reverse());
        sc.close();
    }
}
