package OneDimenisonal_Array;
import java.util.Scanner;
public class Count_PositiveandNegative_Number 
{
    public static void main(String args[])
    {
        int pos=0,neg=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements of the array :");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]>0)
            {
                pos++;
            }
            else if(arr[i]<0)
            {
                neg++;
            }
        }
        System.out.println("The number of positive elements in the array is : "+pos);
        System.out.println("The number of negative elements in the array is : "+neg);
    }
    
}
