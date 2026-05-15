package Variables_and_DataTypes;

public class Swap_Two_Number 
{
    public static void main(String args[])
    {
        int a,b,temp;
        a=10;
        b=20;
        System.out.println("The value of a before swapping is "+a);
        System.out.println("The value of b before swapping is "+b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("The value of a after swapping is "+a);
        System.out.println("The value of b after swapping is "+b);
    }
}
