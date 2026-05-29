package Numbers_Based_Program;
import java.util.Scanner;
public class Automorphic_Number 
{
    public static void main(String args[])
    {
        int num,d=0,c=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        num=sc.nextInt();
        int n=num;
        int square=num*num;
        
        while(n!=0)
        {
            d=n%10;
            c=c*10;
            n=n/10;
        }
        if(num==(square%c))
        {
            System.out.println("Number is automorphic number");
        }
        else 
        {
            System.out.println("Number is not automorphic number");
        }
    }
    
}
