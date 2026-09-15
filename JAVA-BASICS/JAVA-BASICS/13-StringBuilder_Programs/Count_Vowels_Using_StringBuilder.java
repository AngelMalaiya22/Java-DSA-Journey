package StringBuilder_Programs;
import java.util.Scanner;

public class Count_Vowels_Using_StringBuilder 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str=sc.nextLine();
        
        StringBuilder sb=new StringBuilder(str);
        int count=0;
        
        for(int i=0; i<sb.length(); i++)
        {
            char ch=sb.charAt(i);
            
            // Checking for both uppercase and lowercase vowels
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || 
               ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            {
                count++;
            }
        }
        
        System.out.print("Total number of vowels is : " + count);
        
        sc.close();
    }
}