package TwoDimensional_Array;
import java.util.Scanner;
public class Diagonal_Sum 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[3][3];
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(i==j)
                {
                    sum=sum+arr[i][j];
                }
            }
        }
        System.out.println("The sum of Diagonal Amtrix is : "+sum);
    }
    
}
