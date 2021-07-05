import java.util.*;
public class LinkedListInsertion {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            next= null;
        }

    }

    void insertlast() 
    {
        if (head == null)
        {
            head = new Node(6);
            return;
        }
        Node pointer=head;
        while(pointer.next!=null)
        {
            pointer=pointer.next;
        }

        Node newnode = new Node(6);
        newnode.next = null;
        pointer.next=newnode;
       
    }
    void insertfirst()
    {
        Node newnode = new Node(0);
        newnode.next=head;
        head = newnode;
        
    }
    void insertbefore(Node after_node, int new_data)
    {
        Node pointer=head;
        Node before=null;
        while(pointer.next!=null)
        {   if(pointer.next == after_node)
            {   before = pointer;
                break;
            }
            pointer=pointer.next;
        }
             
        Node new_node = new Node(new_data);
        new_node.next = after_node;
        before.next = new_node;


    }
    void printlist()
    {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
    void insertafter(Node prev_node, int new_data)
    {
        if (prev_node == null)
        {
            System.out.println("The given previous node cannot be null");
            return;
        }
           
        Node new_node = new Node(new_data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;
    }
    public static void main(String args[])
    {
        LinkedListInsertion ll = new LinkedListInsertion();
        ll.head = ll.new Node(1);
        Node a2 = ll.new Node(2);
        ll.head.next = a2;
        Node a3 = ll.new Node(3);
        a2.next=a3;
        Node a4 = ll.new Node(4);
        a3.next=a4;
        Node a5 = ll.new Node(5);
        a4.next=a5;

        System.out.println("Enter 1 for insert first");
        System.out.println("Enter 2 for insert before value");
        System.out.println("Enter 3 for insert after value");
        System.out.println("Enter 4 for insert end");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        switch(a)
        {
            case 1:
            ll.insertfirst();
            ll.printlist();
            break;
            case 2:
            System.out.println("Enter value to put in:");
            int new_data = sc.nextInt();
            ll.insertbefore(a2, new_data);
            ll.printlist();
            break;
            case 3:
            System.out.println("Enter value to put in:");
            int new_odata = sc.nextInt();
            ll.insertafter( a3,  new_odata);
            ll.printlist();
            break;
            case 4:
            ll.insertlast();
            ll.printlist();
            break;
            
        }
        sc.close();
    }

}
