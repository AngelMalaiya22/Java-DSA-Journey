package StringBuilder_Programs;
import java.util.Scanner;

public class Replace_Part_of_a_String 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter the string : ");
        String str=sc.nextLine();
        
        // Line 8 removed entirely from here
        
        System.out.print("Enter the replace string : ");
        String r=sc.nextLine();
        
        System.out.print("Enter the starting index : ");
        int start=sc.nextInt();
        
        System.out.print("Enter the end index : ");
        int end=sc.nextInt();
        
        StringBuilder sb=new StringBuilder(str);
        System.out.print("The updated string is : " + sb.replace(start, end, r));
        
        sc.close();
    }
}