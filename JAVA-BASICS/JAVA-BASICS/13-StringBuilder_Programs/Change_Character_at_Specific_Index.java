package StringBuilder_Programs;
import java.util.Scanner;

public class Change_Character_at_Specific_Index 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str=sc.nextLine();
        
        System.out.print("Enter the character which you want to add in the string : ");
        char ch=sc.nextLine().charAt(0);
        
        System.out.print("Enter the index at which you want to change : ");
        int index=sc.nextInt();
        
        StringBuilder sb=new StringBuilder(str);
        
        // 1. Modify the StringBuilder object first (void method)
        sb.setCharAt(index, ch);
        
        // 2. Print the updated StringBuilder object afterward
        System.out.print("The updated string is : " + sb);
        
        sc.close();
    }
}