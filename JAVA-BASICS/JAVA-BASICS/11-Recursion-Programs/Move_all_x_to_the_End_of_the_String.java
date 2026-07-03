package Recursion_Programs;
import java.util.Scanner;
public class Move_all_x_to_the_End_of_the_String 
{
    static String x=" ";
    static String s=" ";
    public static void end_of_the_string(String str, int index)
    {
        String new_string=" ";
        if(index==str.length())
        {
            new_string=s+""+x;
            System.out.println("Result : "+ new_string);
            return;
        }
        else
        {
            if(str.charAt(index)=='x')
            {
                x=x+str.charAt(index);
            }
            else
            {
                s=s+str.charAt(index);
            }
            end_of_the_string(str, index+1);
        }
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string :");
        String str=" ";
        str=sc.nextLine();
        end_of_the_string(str, 0);
    }
}
