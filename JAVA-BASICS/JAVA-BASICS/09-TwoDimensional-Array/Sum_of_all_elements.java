package TwoDimensional_Array;

import java.util.Scanner;

public class Sum_of_all_elements 
{
    Scanner sc=new Scanner(System.in);
    int arr[][]=new int[3][3];
    int sum=0;
    System.out.print("Enter the elements of the Array : ");
    for(int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++)
        {
            arr[i][j]=sc.nextInt();
            sum=sum+arr[i][j];
        }
    }
System.out.println("The sum of all elements is : "+ sum);

    
}
