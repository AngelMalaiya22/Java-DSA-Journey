package string_programs;
import java.util.Scanner;
public class Find_Shortest_Word_in_a_Sentence 
{
    public static  void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence : ");
        String str=sc.nextLine();
        int min=str.length();
        String shortest="";
        String wrd="";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=' ')
                {
                    wrd=wrd+str.charAt(i);
                } 
                else
                {
                    if(min>wrd.length())
                    {
                        min=wrd.length();
                        shortest=wrd;
                    }
                }
        }
        System.out.println("Shortest word is : "+shortest);
    }
}
