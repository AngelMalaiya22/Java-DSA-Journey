package StringBuilder_Programs;
import java.util.Scanner;
public class Insert_a_Character_at_a_Given_Position 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enetr the string :");
        String str=sc.nextLine();
        System.out.print("Enter the charcter you wan to add :");
        char ch=sc.next().charAt(0);
        System.out.print("Enter the index number at which you want to add it : ");
        int index=sc.nextInt();
        StringBuilder sb=new StringBuilder(str);
        System.out.print("The updated string is "+ sb.insert(index,ch));
    }
}
