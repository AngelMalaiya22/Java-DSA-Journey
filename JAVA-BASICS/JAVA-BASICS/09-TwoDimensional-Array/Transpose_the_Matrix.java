package TwoDimensional_Array;
import java.util.Scanner;
public class Transpose_the_Matrix 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[3][3];
        System.out.println("Enter the elmenets of the array :");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("The Enterned matrix is :");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("The transpose of the matrix is : ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(arr[j][i]+" ");
            }
            System.out.println("");
        }
    }
    
}
