
class LinkedListTraversal {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            next= null;
        }

    }

    public void printlist()
    {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    public static void main(String args[])
    {
        LinkedListTraversal  ll = new LinkedListTraversal();
        ll.head=new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        second.next=third;
        ll.head.next = second;
        ll.printlist();
    }
}