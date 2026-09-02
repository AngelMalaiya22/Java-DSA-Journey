package string_programs;
import java.util.Scanner;
public class Find_the_Least_Frequent_Character
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str=sc.nextLine();
        int f=0,min=str.length();
        char ch=' ';
        for(int i=0;i<str.length();i++)
        {
            f=0;
            for(int j=0;j<str.length();j++)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                    f++;
                }
            }
            if(f<min)
            {
                min=f;
                ch=str.charAt(i);
            }
        }
        System.out.println("Least frequent character is : " + ch);
    }
    
}
