package string_programs;
import java.util.Scanner;
public class Delete_Character_at_Given_Position 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str=sc.nextLine();
        System.out.print("Enter the position at which you want to insert : ");
        int index=sc.nextInt();
        String s=" ";
        for(int i=0;i<str.length();i++)
        {
            if(index != (i+1))
            {
                s=s+str.charAt(i);
            }
            else{
                continue;
            }
        }
        System.out.println("Updated string is "+ s);
    }
}
