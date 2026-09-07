package string_programs;
import java.util.Scanner;
public class Remove_Duplicate_Characters 
{
    public static void main(String args[])
    {
        String str="";
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s=sc.nextLine();
        int f;
        for(int i=0;i<s.length();i++)
        {
            f=0;
            for(int j=0;j<s.length();j++)
            {
                if(s.charAt(i) == s.charAt(j) && i!=j)
                {
                    f++;
                }                
            }
            if(f==0)
            {
                str=str+s.charAt(i);
            }
        }
        System.out.println("String after removing duplicates : "+str);
    }
}
