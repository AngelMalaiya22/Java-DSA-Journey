package string_programs;
import java.util.Scanner;
public class Find_the_Most_Frequent_Character 
{
    public static void main(String args[])
    {
        String str;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string :");
        str=sc.nextLine();
        int f=0,max=0;
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
            if(f>max)
            {
                max=f;
                ch=str.charAt(i);
            }
        }
        System.out.println("Most frequent character is : " + ch);
    }
}
