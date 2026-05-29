package Numbers_Based_Program;
import java.util.Scanner;
public class Armstrong_number 
{
       public static void main(String args[])
       {
            int num,c=0,n,number,sum=0,pow=0,d;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a number : ");
            num=sc.nextInt();
            n=num;
            number=num;
            while(num!=0)
            {
                c++;
                num=num/10;
            }
            while(n!=0)
            {
                d=n%10;
                pow = (int)Math.pow(d, c);
                sum=sum+pow;
                n=n/10;
            }
            if(sum==number)
            {
                System.out.println("Number is armstrong number ");
            }
            else 
            {
                System.out.println("Number is not a armstrong number ");
            }
       }
}
