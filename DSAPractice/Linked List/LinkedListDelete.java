import java.util.*;
public class LinkedListDelete {
	Node head;
	class Node
	{
		int data;
		Node next;
		
		Node(int d){
			data=d;
			next=null;
		}
	}
	
	
	void printlist()
    {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

	void deletefirst(){
        
		head=head.next;

	}

	void deletebefore(Node before, int data)
	{
		Node pointer=head;
        
        while(pointer.next!=null)
        {   if(pointer.next== before)
            {   before = pointer;
                break;
            }
            pointer=pointer.next;
        }
             
        

	}

	void deleteafter(Node after)
	{
		after.next =after.next.next;
	}

	void deletelast()
	{


	}
	public static void main(String args[])
	{
		LinkedListDelete ll = new LinkedListDelete();
		
		ll.head = ll.new Node(1);
        Node a2 = ll.new Node(2);
        ll.head.next = a2;
        Node a3 = ll.new Node(3);
        a2.next=a3;
        Node a4 = ll.new Node(4);
        a3.next=a4;
        Node a5 = ll.new Node(5);
        a4.next=a5;

        System.out.println("Enter 1 for delete first");
        System.out.println("Enter 2 for delete before value");
        System.out.println("Enter 3 for delete after value");
        System.out.println("Enter 4 for delete end");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        switch(a)
        {
            case 1:
            ll.deletefirst();
            ll.printlist();
            break;
            case 2:
            System.out.println("Enter value to put in:");
            int new_data = sc.nextInt();
            ll.deletebefore(a2, new_data);
            ll.printlist();
            break;
            case 3:
            ll.deleteafter(a3);
            ll.printlist();
            break;
            case 4:
            ll.deletelast();
            ll.printlist();
            break;
            
        }
        sc.close();
	}
}
