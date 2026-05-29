package Numbers_Based_Program;
import java.util.Scanner;
public class Buzz_Number 
{
    public static void main(String args[])
        {
            int num;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a number : ");
            num=sc.nextInt();
            if(num%10==7 || num%7==0)
            {
                System.out.println("Number is Buzz Number");
            }
            else 
            {
                System.out.println("Number is not Buzz Number");
            }
        } 
}
