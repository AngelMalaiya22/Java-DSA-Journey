package Variables_and_DataTypes;
import java.util.Scanner;

public class Take_user_input_using_scanner
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");

        int a = sc.nextInt();

        System.out.println("The number you entered is " + a);
    }
}