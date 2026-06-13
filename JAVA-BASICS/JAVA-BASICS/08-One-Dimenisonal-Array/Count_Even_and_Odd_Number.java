package OneDimenisonal_Array;
import java.util.Scanner;
public class Count_Even_and_Odd_Number 
{
    public static void main(String args[])
    {
        int even=0,odd=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the element of the array :");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i] % 2 == 0)
            {
                even++;
            }
            else 
            {
                odd++;
            }
        }
        System.out.println("Number of even numbers in the array is : " + even);
        System.out.println("Number of odd numbers in the array is : " + odd);
    }
    
}
