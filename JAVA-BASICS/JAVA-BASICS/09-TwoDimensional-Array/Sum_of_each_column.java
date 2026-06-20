package TwoDimensional_Array;
import java.util.Scanner;
public class Sum_of_each_column 
{
    Scanner sc=new Scanner(System.in);
    int arr[][]=new int[3][3];
    System.out.println("Enter the elemenst of the arrray : ");
    for(int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++)
        {
            arr[i][j]=sc.nextInt();
        }
    }
    int sum1=0,sum2=0,sum3=0;
    for(int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++)
        {
            if(j==0)
            {
                sum1=sum1+arr[i][0];
            }
            else if (j==1)
            {
                sum2=sum2+arr[i][1];
            }
            else 
            {
                sum3=sum3+arr[i][2];
            }
        }
    }
    System.out.println("The sum of 1st column is "+sum1);
    System.out.println("The sum of 2nd column is "+sum2);
    System.out.println("THe sum of 3rd column is "+sum3);
}
