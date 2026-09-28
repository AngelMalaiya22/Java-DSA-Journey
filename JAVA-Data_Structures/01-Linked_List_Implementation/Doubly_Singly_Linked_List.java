package Linked_List;
import java.util.Scanner;


class Node
{
    int data;
    Node next;
    Node pre;

    Node(int data)
    {
        this.data=data;
        this.next=null;
        this.pre=null;
    }
}


public class Doubly_Singly_Linked_List 
{
    private static Node root = null;
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int choice, data, pos;

        while(true)
        {
            System.out.println("\n--- Doubly Linked List Operations Menu ---");
            System.out.println("1. Display");
            System.out.println("2. Length");
            System.out.println("3. Append ");
            System.out.println("4. Insert ");
            System.out.println("5. Delete ");
            System.out.println("6. Exit");
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                {
                    display();
                    break;
                }
                
                case 2:
                {
                    System.out.println("Length of the list : " + length());
                    break;
                }

                case 3:
                {
                    System.out.println("Enter value to append : ");
                    data = sc.nextInt();
                    append(data);
                    break;
                }

                case 4:
                {
                    System.out.print("Enter value to insert : ");
                    data = sc.nextInt();
                    System.out.print("Enter the position : ");
                    pos = sc.nextInt();
                    insert(data, pos);
                    break;
                }

                case 5:
                {
                    System.out.print("Enter position for deleting the value : ");
                    pos = sc.nextInt();
                    delete(pos);
                    break;
                }

                case 6:
                {
                    System.out.println("Exiting program");
                    sc.close();
                    System.exit(0);
                }

                default:
                {
                    System.out.println("Invalid choice! Please try again ");
                }
            }
        }
    }

    public static void display()
    {
        if(root==null)
        {
            System.out.print("List is empty");
            return;
        }
        else
        {
            Node temp=root;
            System.out.print("Linked List : ");
            while(temp != null)
            {
                System.out.print(temp.data+ " <-> ");
                temp=temp.next;
            }
            System.out.print("null");
        }
    }

    public static int length()
    {
        int count=0;
        Node temp=root;
        while(temp != null)
        {
            count++;
            temp=temp.next;
        }
        return count;
    }


    public static void append(int data)
    {
        Node newNode= new Node(data);
        if(root == null)
        {
            root=newNode;
            return;
        }
        else
        {
            Node temp=root;
            while(temp.next != null)
            {
                temp=temp.next;
            }
            temp.next=newNode;
            newNode.pre = temp;
        }
    }


    public static void insert(int data, int pos)
    {
        int len=length();
        
        if(pos < 1 || pos > len + 1)
        {
            System.out.println("Invalid Position\n");
            System.out.println("The length of the position is\n" + len);
            return;
        }

        Node newNode=new Node(data);
        Node temp=root;
        
        if(pos==1)
        {
            if(root == null)
            {
                root=newNode;
            }
            else
            {
                newNode.next=root;
                root.pre=newNode;
                root=newNode;
            }
        }
        else
        {
            int i=1;
            while(i<pos-1)
            {
                temp=temp.next;
                i++;
            }
            newNode.next=temp.next;
            newNode.pre=temp;
            if(temp.next != null)
            {
                temp.next.pre=newNode;
            }
            temp.next=newNode;
        }
    }


    public static void delete(int pos)
    {
        int len=length();
        Node temp=root;
        if(pos>len || pos<1 || root==null)
        {
            System.out.println("\nInvalid Location");
            System.out.println("\nCurrently the length of linked list is " + len);
        }
        else if(pos==1)
        {
            root=root.next;
            if(root != null)
            {
                root.pre=null;
            }
            temp.next=null;
        }
        else
        {
            int i=1;
            while(i<pos)
            {
                temp=temp.next;
                i++;
            }
            temp.pre.next=temp.next;
            if(temp.next != null)
            {
                temp.next.pre=temp.pre;
            }
            temp.pre=null;
            temp.next=null;
        }
    }
}