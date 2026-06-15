package OneDimenisonal_Array;

import java.util.Scanner;

public class Take_input_and_print
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");

        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter array elements : ");

        for(int i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements are : ");

        for(int i = 0; i < size; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}