package OneDimenisonal_Array;

import java.util.Scanner;

public class Remove_Duplicates 
{
    public static void main(String args[])
    {
        int index = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array :");
        int size = sc.nextInt();

        int arr[] = new int[size];
        int arr1[] = new int[size];

        System.out.println("Enter the elements of the array :");

        for(int i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < size; i++)
        {
            int f = 0;

            for(int j = 0; j < index; j++)
            {
                if(arr[i] == arr1[j])
                {
                    f = 1;
                    break;
                }
            }

            if(f == 0)
            {
                arr1[index] = arr[i];
                index++;
            }
        }

        System.out.println("Updated array is : ");

        for(int i = 0; i < index; i++)
        {
            System.out.print(arr1[i] + " ");
        }
    }
}