package Linked_List;
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

public class Singly_Linked_List 
{
    private static Node root = null;

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int choice, data, pos;

        while(true)
        {
            System.out.println("\n--- Linked List Operations Menu ---");
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
                    System.out.println("Length of the list : "+ length());
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
                    data=sc.nextInt();
                    System.out.print("Enter the position : ");
                    pos=sc.nextInt();
                    insert(data, pos);
                    break;
                }

                case 5:
                {
                    System.out.print("Enter position for deleting the value : ");
                    pos=sc.nextInt();
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
                    System.out.println("Invalid choice! Please try again ");
            }
        }
    }

    public static void display() 
    {
        if(root == null)
        {
            System.out.println("List is empty");
            return;
        }
        else
        {
            Node temp=root;
            System.out.print("Linked List : ");
            while(temp != null)
            {
                System.out.print(temp.data +" -> ");
                temp=temp.next;
            }
            System.out.println("null");
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
        Node newNode=new Node(data);
        if(root==null)
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
        }
    }

    public static void insert(int data, int pos) 
    {
        Node newNode=new Node(data);
        Node temp=root;
        Node hold;
        int len=length();
        if(pos==1 && len==0)
        {
            root=newNode;
        }
        else if(pos==1 && pos<=len)
        {
            newNode.next=root;
            root=newNode;
        }
        else if(pos==len)
        {
            int i=1;
            while(i<pos-1)
            {
                temp=temp.next;
                i++;
            }
            hold=temp;
            temp=temp.next;
            newNode.next=temp;
            hold.next=newNode;
        }
        else if(pos==len+1)
        {
            while(temp.next != null)
            {
                temp=temp.next;
            }
            temp.next=newNode;
        }
        else if(pos<len && pos>1)
        {
            int i=1;
            while(i<pos-1)
            {
                temp=temp.next;
                i++;
            }
            hold=temp;
            temp=temp.next;
            newNode.next=temp;
            hold.next=newNode;
        }
        else
        {
            System.out.println("Invalid Position\n");
            System.out.println("The length of the position is\n"+len);
        }
    }

    public static void delete(int pos) 
    {
        int len=length();
        Node temp=root;
        Node hold;
        if(pos>len || pos<1)
        {
            System.out.println("\nInvalid Location");
            System.out.println("\nCurrently the length of linked list is "+len);
        }
        else if(pos==1)
        {
            root=root.next;
            temp.next=null;
        }
        else
        {
            int i=1;
            while(i<pos-1)
            {
                temp=temp.next;
                i++;
            }
            hold=temp.next;
            temp.next=hold.next;
            hold.next=null;
        }
    }
}