package string_programs;
import java.util.Scanner;
public class Length_of_String 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String name = sc.nextLine();
        int Length = name.length();
        System.out.println("The Length of the String is " + Length);
    }
}