package DSAPractice;

public class LinkedList {
	Node head;
	static class Node
	{
		int data;
		Node next;
		
		Node(int d){
			data=d;
		}
	}
	
	public static LinkedList insert(int data,LinkedList list)
	{
		Node newnode = new Node(data);
		newnode.next=null;
		
		if(list.head==null)
		{list.head=newnode;
		}
		else
		{	Node last=list.head;
			while(last.next!=null)
			{
				last=last.next;
			}
			last.next=newnode;
		}
		
		return list;
		
		
	}
	
	public static void print(LinkedList list)
	{
		Node curr = list.head;
		while(curr.next!=null)
			{System.out.println(curr.data);
			curr=curr.next;}
	}
	
	public static LinkedList delete(int no, LinkedList list)
	{
		Node curr = list.head,prev=null;
		if(curr!=null && curr.data==no)
		{
			list.head=curr.next;
			System.out.println("found at head therfore"+ no + "deleted");
			return list;
		}
		
		
			while(curr!=null && curr.data!=no)
			{
				prev=curr;
				curr=curr.next;
			}
			
			
			if(curr!=null)
			{
				prev.next=curr.next;
				System.out.println("found and deleted");
			}
			if(curr == null)
			{
				System.out.println("Not found");
			}
			
		
		return list;
	}
		
		public static LinkedList deleteAtPosition(LinkedList list, int index) 
	    { Node curr=list.head,prev=null;
	    
	    	if(curr!=null && index==0)
	    	{
	    		list.head=curr.next;
	    		System.out.println(index+"found and deleted");
	    		return list;
	    	}
	    	
	    	int count=0;
	    	while(curr!=null)
	    	{	if(count==index)
	    			{
	    				prev.next=curr.next;
	    				System.out.println(index+"found and deleted");
	    				return list;
	    			}
	    		else
	    			{
	    				prev=curr;
	    				curr=curr.next;
	    				count++;
	    			}
	    	}
	    	
	    	if(curr==null)
	    	{
	    		System.out.println("not found");
	    		
	    	}
	    	return list;
	    	
	    }
		
		
		
	public static void main(String args[])
	{
		LinkedList list = new LinkedList();
		
		list=list.insert(1,list);
		list=list.insert(2,list);
		list=list.insert(3,list);
		list=list.insert(4,list);
		list=list.insert(22,list);
		list=list.insert(12,list);
		list=list.insert(8,list);
		
		print(list);
		list=list.delete(22,list);
		print(list);
		list=list.deleteAtPosition(list, 3); 
		print(list);
	}
	
}
