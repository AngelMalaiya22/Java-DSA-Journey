package Functions;
import java.util.Scanner;
public class Square_of_Number 
{
    public static int SquareOfNumber(int num)
    {
        int sq=num*num;
        return sq;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=sc.nextInt();
        int result=SquareOfNumber(num);
        System.out.println("THe square of number is "+result);
    }
    
}
