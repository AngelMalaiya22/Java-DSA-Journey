package string_programs;
import java.util.Scanner;
public class Remove_Spaces 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string :");
        String str=sc.nextLine();
        String newstr="";
        String space=" ";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!= space.charAt(0))
            {
                newstr=newstr+str.charAt(i);
            }
        }
        System.out.println("The string after removing spaces is : "+newstr);
    }
    
}
