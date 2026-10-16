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


public class Remove_Duplicate_Nodes 
{
    private static Node root=null;

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of nodes you wan to enter : ");
        int range=sc.nextInt();
        for(int i=0;i<range;i++)
        {
            int data=sc.nextInt();
            append(data);
        }
        remove_duplicate_nodes();
        display();
    }


    public static void append(int data)
    {
        Node newNode= new Node(data);
        if(root == null)
        {
            root = newNode;
        }
        else
        {
            Node temp=root;
            while(temp.next != null)
            {
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }


    public static void remove_duplicate_nodes()
    {
        // 1. Guard Check: If the list is empty, there's nothing to do
        if (root == null)
        {
            return;
        }

        Node temp = root;
        // 2. Loop until we are standing on the very last node
        while (temp.next != null)
        {
            // If the current node value matches the next node value
            if (temp.data == temp.next.data)
            {
                // Bypass the duplicate node by jumping over it
                temp.next = temp.next.next; 
                
                // NOTICE: We do NOT do temp = temp.next here!
                // We stay on the same node to see if the NEW temp.next is also a duplicate.
            }
            else
            {
                // Only move forward if the next node has a completely different number
                temp = temp.next;
            }
        }
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
