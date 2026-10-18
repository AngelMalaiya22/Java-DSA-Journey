package Linked_List_Programs;
import java.util.Scanner;

class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}

public class Reverse_a_Singly_Linked_List 
{
    private static Node root = null;
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of nodes you want to enter the linked list : ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            System.out.print("Enter the value : ");
            int data = sc.nextInt();
            append(data);
        }
        
        reverse();
        display();
        
        sc.close(); 
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

    public static void reverse()
    {
        Node prev = null;
        Node curr = root; // Start tracking from our static root
        Node nxt = null;
        
        while (curr != null) 
        {
            nxt = curr.next;  // 1. Remember the rest of the list
            curr.next = prev;  // 2. Change the current node's direction backward
            
            prev = curr;       // 3. Move prev up to the current node
            curr = nxt;        // 4. Advance curr to the next node we saved
        }
        
        root = prev; // Update the static root to point to the new head!
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