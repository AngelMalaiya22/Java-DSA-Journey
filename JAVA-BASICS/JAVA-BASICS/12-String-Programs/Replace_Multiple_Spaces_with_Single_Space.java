package string_programs;
import java.util.Scanner;
public class Replace_Multiple_Spaces_with_Single_Space 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string :");
        String str=sc.nextLine();
        String str1="";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ' && str.charAt(i+1)==' ')
            {
                continue;
            }
            else
            {
                str1=str1+str.charAt(i);
            }
        }
        System.out.println("String after replacing multiple spaces with single space : "+str1);
    }
}
