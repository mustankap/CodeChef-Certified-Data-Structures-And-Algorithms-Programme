
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

class LinkedList{
    Node head;
    class Node
    {
        Node next;
        
        Node(int d)
        {
            data = d;
            Node = null;
        }
    }

    
    public void insertInTheFront(int data)
    {   
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;

    }

    public void insertAfterAGivenNode(Node prev_node,int data)
    {   
        Node newnode = new Node(data);
       
        if(prev_node == null)
        {
            System.out.println("The given previous node cannot be null");  
            return;
        }
        newnode.next=prev_node.next;
        prev_node.next=newnode;
    }

    public void insertAfterAtTail(int data)
    {  
        Node newnode = new Node(data);

        if(head == null)
        {
            head = new Node(data);
            return;
        }
        Node curr_node = head;
        newnode.next=null;
        while(curr_node.next!=null)
        {
            curr_node=curr_node.next;
        }
        curr_node.next=newnode;
        return;

    }

    public void deleteThisData(int data)
    {
        if(head.data==data)
        {   head = head.next;
            return;
        }
        Node curr_node = head;
        Node prev = null;
        while(curr_node!=null && curr_node.data!=data)
        {   prev = curr_node;
            curr_node=curr_node.next;
        }

        if(curr_node == null)
        {
            System.out.println("not in list");
            return;
        }
        else{
            prev.next=curr_node.next;
        }

    }

    public void deleteThisDataOnThisPosition(int data)
    {
        int count = 0;
        //number found at head
        if(data==count)
        {
            head=head.next;
            return;
        }
        else{
            Node prev = null;
            Node curr_node = head;
            while(curr_node!=null && count != data)
            {
                prev = curr_node;
                count ++;
                curr_node=curr_node.next;
            }

            // If position is more than number of nodes 
            if (curr_node == null) 
                return; 

            prev.next=curr_node.next;
        }
    }

    public void printList() 
    { 
        Node tnode = head; 
        while (tnode != null) 
        { 
            System.out.print(tnode.data+" "); 
            tnode = tnode.next; 
        } 
    } 

    public static void main(String[] args)throws IOException {
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n=Integer.parseInt(br.readLine());

        switch(n)
        {
            case 1:
            {//insert node in the front
                break;
            }
            case 2:
            { // insert node after given node
                break;

            }
            case 3:
            {
                break;
            }
            case 4:
            {
                
                break;
            }

        }
        
    }
}
