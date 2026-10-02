package Linked_List_Programs;
import java.util.Scanner;

class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}


public class Count_Even_and_Odd_Nodes 
{
    private static Node root=null;
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of nodes you want to insert : ");
        int range=sc.nextInt();
        for(int i=0;i<range;i++)
        {
            System.out.print("Enter the value : ");
            int data=sc.nextInt();
            append(data);
        }
        count_even_odd_nodes();
        display();
    }


    public static void append(int data) 
    {
        Node newNode = new Node(data);
        if(root == null)
        {
            root = newNode;
        }
        else
        {
            Node temp = root;
            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }


    public static void count_even_odd_nodes()
    {
        int ceven=0,codd=0;
        Node temp=root;
        while(temp != null)
        {
            if((temp.data)%2==0)
            {
                ceven++;
            }
            else
            {
                codd++;
            }
            temp=temp.next;
        }
        System.out.println("\nThe No. of even nodes are "+ceven);
        System.out.println("The No. of odd nodes are "+codd);
    }

    public static void display()
    {
        if(root == null)
        {
            System.out.println("\nList is empty");
            return;
        }
        else
        {
            Node temp = root;
            System.out.print("\nLinked list : ");
            while(temp != null)
            {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }
}
