package StringBuilder_Programs;
import java.util.Scanner;
public class Append_a_String 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str=sc.nextLine();
        System.out.print("Enter the string you want to append :");
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder(str);
        System.out.print("The updated string is  :"+ sb.append(s));
        sc.close();
    }
}
