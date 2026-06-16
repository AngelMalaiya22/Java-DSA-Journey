package TwoDimensional_Array;
import java.util.Scanner;
public class Addition_of_two_matrix 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr1[][]=new int[3][3];
        int arr2[][]=new int[3][3];
        System.out.println("Enter the elements of the array 1 : ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the elements of the array 2 : ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr2[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                sum=sum+arr1[i][j]+arr2[i][j];
            }
        }
        System.out.println("The sum of array 1 and array2 is : "+sum);
    }
    
}
