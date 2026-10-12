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


public class Delete_Node_by_Value 
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
        System.out.println("Enter the value to want to delete : ");
        int value=sc.nextInt();
        delete_by_value(value);
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

    public static void delete_by_value(int value)
    {
        // 1. Guard check: If list is empty, stop immediately
        if (root == null)
        {
            return;
        }

        // 2. Check the first node (root) separately
        if (root.data == value)
        {
            root = root.next; // Move root to the next node, dropping the first one
            return;
        }

        // 3. Check the rest of the list using your look-ahead style
        Node temp = root;
        while (temp.next != null)
        {
            if (temp.next.data == value)
            {
                Node hold = temp.next.next; // Grab the node after the one to delete
                temp.next = hold;          // Bridge over it
                return;                     // Exit once deleted
            }
            
            temp = temp.next; // Crucial! Move temp forward to avoid infinite loop
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
