package StringBuilder_Programs;
import java.util.Scanner;
public class Delete_a_Character_from_Given_Index
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str=sc.nextLine();
        System.out.print("Enter the index at which you want to delete : ");
        int index=sc.nextInt();
        StringBuilder sb=new StringBuilder(str);
        System.out.println("THe updated string is : "+ sb.deleteCharAt(index));
    }
    
}
