package string_programs;
import java.util.Scanner;
public class Frequency_of_Every_Character 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string :");
        String str=sc.nextLine();
        int freq=0;
        String zero="0";
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            for(int j=0;j<str.length();j++)
            {
                if(str.charAt(i)==str.charAt(j) && str.charAt(i)!='0')
                {
                    freq++;
                }
            }
            if(str.charAt(i)!='0')
            {
                System.out.println("Frequency of "+ch+" is : "+freq);
            }
            freq=0;
            str = str.replace(ch, '0');
        }
    }
}
