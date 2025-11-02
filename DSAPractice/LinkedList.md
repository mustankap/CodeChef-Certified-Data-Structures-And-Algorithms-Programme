[25. Reverse Nodes in k-Group](https://leetcode.com/problems/reverse-nodes-in-k-group/)

```java

public class ReverseKGroups{
	public static void main(String[] args)
	{
		
	}
	
	
	
	public ListNode reverseKGroup(ListNode head, int k) {
	if(head == null || k==1) return head;
		ListNode dummy = new ListNode(0,head);
		ListNode tail = dummy;
		ListNode m = head;
		
		while(m!=null)
		{
			ListNode i = m;
			int s =k-1;
			while(s>0)
			{
				if(i==null)
						break;
						
				i=i.next;
				s--;
			}
			if(i==null)
				break;
			
			ListNode j = i.next;
			i.next = null;
			
			ListNode newHead = reverse(m);
			
			tail.next = newHead;
			m.next = j;
			tail = m;
			m=j
			
		}
		
		return dummy.next;
	
	}
	
	public ListNode reverse(ListNode head)
	{
		ListNode after = head;
		ListNode curr = head;
		ListNode prev = null;
		
		while(after!=null)
		{
			curr.next = after;
			curr.next = prev;
			prev = curr;
			curr = after;
		}
		return prev;
	}
}
```