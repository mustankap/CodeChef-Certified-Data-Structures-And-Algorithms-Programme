import java.util.*;
 public class centreOfLL {
    LLNode head;
    class LLNode {
        int val;
        LLNode next;
           
            LLNode(int d){
                val=d;
                next=null;
            }
        }

    public int solve(LLNode head) {
       
        LLNode slow = head;
        LLNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.val;
    }
    public static void main(String args[])
    {
        centreOfLL ll = new centreOfLL();
		
		ll.head = ll.new LLNode(1);
        LLNode a2 = ll.new LLNode(2);
        ll.head.next = a2;
        LLNode a3 = ll.new LLNode(3);
        a2.next=a3;
        LLNode a4 = ll.new LLNode(4);
        a3.next=a4;
        LLNode a5 = ll.new LLNode(5);
        a4.next=a5;

        System.out.println(ll.solve(ll.head));
    }
}

