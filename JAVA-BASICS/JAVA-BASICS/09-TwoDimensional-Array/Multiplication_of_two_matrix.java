package TwoDimensional_Array;
import java.util.Scanner;
public class Multiplication_of_two_matrix 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr1[][]=new int[3][3];
        int arr2[][]=new int[3][3];
        int arr3[][]=new int[3][3];
        System.out.println("Enter the elmenets of the array1 :");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the elmenets of the array2 :");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr2[i][j]=sc.nextInt();
            }
        }
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
        	    for(int k=0;k<3;k++)
        	    {
                    arr3[i][j]=arr3[i][j]+arr1[i][k]*arr2[k][j];
                }
            }
        }
        System.out.println("The Matrix after Multiplication : ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
