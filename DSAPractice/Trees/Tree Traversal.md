DFS
inorder
preorder
postorder

BFS
level order

-------------------------------------------------------------------------------

Binary Tree Representation in Java

```java

class Node {
    // Stores the value
    // of the node
    int data;       
    // Reference to the
    // left child node
    Node left; 
    // Reference to the
    // right child node
    Node right;

    // Constructor to initialize
    // a node with a given key
    public Node(int key) {
        // Assigns the provided key to
        // the data field of the node
        data = key;     
        // Initializes left child 
        // reference as null
        left = null;    
        // Initializes right child
        // reference as null
        right = null;   
    }
}

public class Main {
    public static void main(String[] args) {
            // Creates the root node
            // with a key value of 1
        Node root = new Node(1);       
        // Creates a left child node for
        // the root with a key value of 2
        root.left = new Node(2);       
            // Creates a right child node for
            // the root with a key value of 3
        root.right = new Node(3);      
            // Creates a left child node for the right 
            // child of the root with a key value of 5
        root.right.left = new Node(5); 
    }
}
```


# Preorder Traversal of Binary Tree
using recursion:
```java
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
       preorder(root,ans);
       return ans;
    }
    
    
    public void preorder(TreeNode root,List<Integer> ans) 
    {
    if (root == null) return;
    
    ans.add(root.val);
    preorder(root.left, ans);
    preorder(root.right, ans);
    
    }



}
```

using iteration stack:
```java
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> st = new Stack<>();
        List<Integer> ans = new ArrayList<>();
		if(root == null) return ans;
        st.push(root);
        while(!st.isEmpty()){
            root = st.pop();
            ans.add(root.val);
            if(root.right !=null){
                st.push(root.right);
            }
            if(root.left!=null)
            {
                st.push(root.left);
            }

        }

        return ans;
    }
}
```

# Inorder Traversal of Binary Tree
using recursion:
```java
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        in(ans,root);
        return ans;
            
    }
    
    public void in(List<Integer> ans, TreeNode root)
    {
        if(root==null)
            return;
        
        in(ans,root.left);
        ans.add(root.val);
        in(ans,root.right);
    }
}
```

using iteration:

```java
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        return inorder(root,ans);
    }

    public List<Integer> inorder(TreeNode root, List<Integer> ans) {
        Stack<TreeNode> s = new Stack<>();
        TreeNode node = root;
        while (true) {
            if (node != null) {
                s.push(node);
                node = node.left;
            } else {
                if (s.isEmpty())
                    break;
                node = s.pop();
                ans.add(node.val);
                node = node.right;
            }

        }
        return ans;
    }
}
```


# Post-order Traversal of Binary Tree
using recursion:
```java
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        postorder(root, arr);
        return arr;
    }

    public void postorder(TreeNode root, List<Integer> arr){
        
        if(root == null){
            return;
        }
        
        postorder(root.left, arr);
       
        postorder(root.right, arr);
       
        arr.add(root.val);
    }

}
```

Post-order Traversal of Binary Tree using 2 stack:
```java
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        List<Integer> ans = new ArrayList<>();
        if (root == null)
            return ans;
        s1.push(root);
        while (!s1.isEmpty()) {
            root = s1.pop();
            s2.push(root);
            
            if (root.left != null)
                s1.add(root.left);
            if (root.right != null)
                s1.add(root.right);
        }

        while (!s2.isEmpty()) {
            ans.add(s2.pop().val);
        }
        return ans;
    }
}
```
# Level order Traversal / Level order traversal in spiral form
using queue and list of list:

```java
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null)
            return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root); //adds to the queue

        while (!q.isEmpty()) {
            int n = q.size();
            List<Integer> l = new ArrayList<>(); //every level goes as a list in the list of list.
            for (int i = 0; i < n; i++) {
                TreeNode node = q.poll();
                l.add(node.val);
                if (node.left != null)
                    q.offer(node.left);
                if (node.right != null)
                    q.offer(node.right);
            }
            ans.add(l);
        }
    return ans;
    }
}
```

using recursion:
```java
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
       level(ans,root,0);
        return ans;
    }

    public void level(List<List<Integer>> ans,TreeNode root,int index)
    {
        if(root == null)
            return;
        if(index==ans.size())
            ans.add(new ArrayList<>());
        ans.get(index).add(root.val);
       
        level(ans,root.left,index+1);
        level(ans,root.right,index+1);
        
    }
}
```


# Post-order Traversal of Binary Tree using 1 stack


```java
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> ans = new ArrayList<>();
		if(root == null) return ans;
		Stack<TreeNode> st = new Stack<>();
		TreeNode curr = root;
		TreeNode lastVisited = null;
		while(curr!=null||!st.isEmpty())
       {
            if(curr!=null)
            {
                st.push(curr);
                curr = curr.left;
            }
            else{
               TreeNode temp = st.peek();
                if(temp.right != null && temp.right != lastVisited)
                {
                    curr = temp.right;
                   
                }           
                else{
                    lastVisited = st.pop();
                    ans.add(lastVisited.val);
                }

            }
        }

        return ans;
    }
}
```


# Preorder, Inorder, and Postorder Traversal in one Traversal
```java
  

/*********************************************************

Following is the TreeNode structure:

class TreeNode {
	int data;
	TreeNode left;
	TreeNode right;
	
	TreeNode() {
	this.data = 0;
	this.left = null;
	this.right = null;
	}
	
	TreeNode(int data) {
	this.data = data;
	this.left = null;
	this.right = null;
	}
	
	TreeNode(int data, TreeNode left, TreeNode right) {
	this.data = data;
	this.left = left;
	this.right = right;
	}
};

********************************************************/  
import java.util.*;

class Pair<K, V> {
	private K key;
	private V value;
	  
	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public K getKey() {
		return key;
	}
	
	public V getValue() {
		return value;
	}
	
	public void setValue(V value) {
		this.value = value;
	}
}

public class Solution {

	public static List<List<Integer>> getTreeTraversal(TreeNode root) {
		// Write your code here.
		List<List<Integer>> ans = new ArrayList<>();
		List<Integer> pre = new ArrayList<>();
		List<Integer> in = new ArrayList<>();
		List<Integer> post = new ArrayList<>();
		
		Stack<Pair<TreeNode,Integer>> st = new Stack<>();
		
		if(root == null)return ans;
		
		st.push(new Pair<>(root,1));
		
		while(!st.isEmpty())
		{
			Pair<TreeNode,Integer> it = st.pop();
			
			if(it.getValue()==1){
				//preorder row 2
				pre.add(it.getKey().data);
				it.setValue(2);
				st.push(it);
				
				if (it.getKey().left != null) {
					st.push(new Pair<>(it.getKey().left, 1));
				}
			
			}else if(it.getValue()==2){
				//inorder row 1
				in.add(it.getKey().data);
				it.setValue(3);
				st.push(it);
				
				if (it.getKey().right != null) {
					st.push(new Pair<>(it.getKey().right, 1));
				}
			}
			else {//postorder row 3
				post.add(it.getKey().data);
			}
			
		}
		
		ans.add(in);
		ans.add(pre);
		ans.add(post);
		
		return ans;
	}
}```

## Maximum depth of binary tree. 
Recursion check for each node whether the right is longer or left subtree and add

```java
class Solution {
	
	public int maxDepth(TreeNode root) {
		if(root == null) return 0;
		
		int l = maxDepth(root.left);
		int r =maxDepth(root.right);
		return 1+Math.max(l,r);
	}
}
```

## Balanced BT
Given a binary tree, determine if it is **height-balanced**.
```java
class Solution {

	public boolean isBalanced(TreeNode root) {
		return (dfsheight(root)!=-1);
	} 

	public int dfsheight(TreeNode root)
	{
		if(root == null) return 0;
		
		int l = dfsheight(root.left);
		if(l==-1)return -1;
		
		int r = dfsheight(root.right);
		if( r == -1) return -1;
		
		if(Math.abs(l-r)>1)return -1;
			return Math.max(l,r)+1;
	}
}
```

## Diameter of tree longest path from 1 node to another

```java

class Solution {
	public int diameterOfBinaryTree(TreeNode root) {
		int[] dia = new int[1]; //call by reference doesnt happen with variables do used array
		int height = diameter(root,dia);
		return dia[0];
	}
	public int diameter(TreeNode root, int[] dia)
	{
		if(root == null) return 0;
		
		int l = diameter(root.left,dia);
		int r = diameter(root.right,dia);
		dia[0]=Math.max(dia[0],l+r);
		return Math.max(l,r)+1;
	}
}
```

## max width of binary tree
```java
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

public class Pair<K,V>{
    public K key;
    public V value;
    public Pair(K key, V value){
        this.key = key;
        this.value = value;
    }

}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null)return 0;
        int ans = 0;
        Queue<Pair<TreeNode,Integer>> q = new LinkedList<>();
        q.offer(new Pair<>(root,0));
        
        while(!q.isEmpty()){
            int n = q.size();
            int min = q.peek().value;
            int first=0,last = 0;
            for(int i=0;i<n;i++){
                int curr_id = q.peek().value - min;
                TreeNode node = q.peek().key;
                q.poll();
                if(i==0)first = curr_id;
                if(i==n-1)last = curr_id;
                if(node.left!=null)
                q.offer(new Pair<>(node.left,curr_id*2+1));
                if(node.right!=null)
                q.offer(new Pair<>(node.right,curr_id*2+2));
            }
            ans = Math.max(ans,Math.abs(last-first+1));
        }
        return ans;
    }
}
```
faster solution recursion:

```java
class Solution {
    int ans;
    public void width(TreeNode root, int dep, int pos, ArrayList<Integer> arr) {
        if(root==null) return;
        if(dep == arr.size()) {
            arr.add(pos);
        }
        ans = Math.max(ans, pos-arr.get(dep) + 1);
        width(root.left,dep+1,(pos - arr.get(dep))*2,arr);
        width(root.right,dep+1,(pos-arr.get(dep))*2+1,arr);
    }
    public int widthOfBinaryTree(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        width(root, 0, 0,arr);
        return ans;
    }
}
```

## Max Sum path in a tree

```java
class Solution {
    public int maxPathSum(TreeNode root) {
        int[] ans = new int[1];
        ans[0]=Integer.MIN_VALUE;
        maxPath(root,ans);
        return ans[0];
    }
    public int maxPath(TreeNode root,int[] ans)
    {
        if(root == null)return 0;
        int left= Math.max(0,maxPath(root.left,ans));//ignores negative value of node
        int right= Math.max(0,maxPath(root.right,ans));

        ans[0] = Math.max(ans[0],left+right+root.val);//(sum of left+right sub tree with its own value)

        return root.val+Math.max(left,right);
    }
}
```

## Check if 2 trees identitical

```java
//preorder on both trees
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null || q==null)
        return p==q;

        return ((p.val==q.val) && (isSameTree(p.left,q.left)) && (isSameTree(p.right,q.right)));
    }
}
```

## zigzag level order traversal of its nodes

```java
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<TreeNode> nodesQueue = new LinkedList<>();
        nodesQueue.offer(root);
        boolean leftToRight = true;
        while (!nodesQueue.isEmpty()) {
            int size = nodesQueue.size();
            List<Integer> row = new ArrayList<>(size);
            for (int i = 0; i < size; i++) {
                TreeNode node = nodesQueue.poll();
                int index = leftToRight ? i : (size - 1 - i);
                while (row.size() <= index) {
                    row.add(null);
                }
                row.set(index,node.val);
                 if (node.left != null) {
                    nodesQueue.add(node.left);
                }
                if (node.right != null) {
                    nodesQueue.add(node.right);
                }

            }
            leftToRight = !leftToRight;

           
            result.add(row);
        }

        return result;
    }
}
```

## Boundary of a binary tree

```java

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> boundaryOfBinaryTree(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }

        if (!isLeaf(root)) {
            ans.add(root.val);
        }

        leftBoundary(root, ans);
        addLeaf(root, ans);
        rightBoundary(root, ans);

        return ans;
    }

    public boolean isLeaf(TreeNode root) {
        return (root.left == null && root.right == null);

    }

    public void addLeaf(TreeNode root, List<Integer> ans) {

        if (isLeaf(root)) {
            ans.add(root.val);
            return;
        }

        if (root.left != null)
            addLeaf(root.left, ans);

        if (root.right != null)
            addLeaf(root.right, ans);

    }

    public void leftBoundary(TreeNode root, List<Integer> ans) {
        TreeNode curr = root.left;

        while (curr != null) {
            if (!isLeaf(curr))
                ans.add(curr.val);

            if (curr.left != null) {
                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }

    }

    public void rightBoundary(TreeNode root, List<Integer> ans) {
        if (root.right == null) {
            return;
        }

        TreeNode curr = root.right;

        List<Integer> temp = new ArrayList<>();

        while (curr != null) {

            if (!isLeaf(curr))
                temp.add(curr.val);

            if (curr.right != null) {
                curr = curr.right;
            } else {
                curr = curr.left;
            }
        }

        for (int i = temp.size() - 1; i >= 0; --i) {
            ans.add(temp.get(i));
        }
    }
}
```

## verticle order of binary tree

```java
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Tuple {
    int level;
    int x;
    TreeNode node;

    Tuple(TreeNode node, int x, int level) {
        this.level = level;
        this.x = x;
        this.node = node;
    }
}

class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map = new TreeMap<>();
        Queue<Tuple> q = new LinkedList<>();
		q.offer(new Tuple(root,0,0));
		while(!q.isEmpty())
		{
		    Tuple tip = q.poll();
		    TreeNode node = tip.node;
		    int x = tip.x;
		    int level = tip.level;
		    if(!map.containsKey(x))
		    {
		        map.put(x,new TreeMap<>());
		    }
		
		     if(!map.get(x).containsKey(level))
		    {
		       map.get(x).put(level,new PriorityQueue<>());
		    }
		    
		    map.get(x).get(level).offer(node.val);
		
		    if(node.left!=null)
		    {
		        q.offer(new Tuple(node.left,x-1,level+1));
		    }
		    if(node.right!=null)
		    {
		        q.offer(new Tuple(node.right,x+1,level+1));
		    }
	    }

	    List<List<Integer>> ans  = new ArrayList<>();
	    for( TreeMap<Integer,PriorityQueue<Integer>> ys: map.values()){
	        ans.add(new ArrayList<>());
	        for(PriorityQueue<Integer> nodes : ys.values()){
	            while(!nodes.isEmpty()){
	                //System.out.println(nodes.peek());
	                ans.get(ans.size()-1).add(nodes.poll());
	            }
	        }
	    }
		return ans;
    }
}
```

## Top view of a binary tree

```java
class Pair{
    int x;
    Node n;
    Pair(Node n, int x)
    {
        this.n = n;
        this.x = x;
    }
}

class Solution {
    // Function to return a list of nodes visible from the top view
    // from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null)return ans;
        
        TreeMap<Integer,Integer> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        
        q.offer(new Pair(root,0));
        while(!q.isEmpty())
        {
            Pair el = q.poll();
            Node nod = el.n;
            int x = el.x;
            
            if(!map.containsKey(x))
            {
                map.put(x,nod.data);
            }
            if(nod.left !=null)
            {
               q.offer(new Pair(nod.left,x-1)); 
            }
            if(nod.right !=null)
            {
               q.offer(new Pair(nod.right,x+1)); 
            }
        }
        
        for(Map.Entry<Integer,Integer> entry: map.entrySet())
        {
            ans.add(entry.getValue());
        }
        return ans;
    }
}
```

## Bottom view of a binary Tree:

```java

class Pair{
    int x;
    Node n;
    Pair(int x, Node n)
    {
       
        this.x = x;
         this.n = n;
    }
}
class Solution
{
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root)
    {
        
        // Code here
        ArrayList<Integer> ans = new ArrayList<>();
        
        if(root == null)return ans;
        
        Map<Integer,Integer> map = new TreeMap<>();
        
        Queue<Pair> q = new LinkedList<>();
       
        q.offer(new Pair(0,root));
        while(!q.isEmpty())
        {
            
            
            int size = q.size();
            
            for(int i =0;i<size;i++)
            {
                Pair p = q.poll();
                Node node = p.n;
                int x = p.x;
                
                map.put(x,node.data);
               
                if(node.left!=null)
                {
                    q.offer(new Pair(x-1,node.left));
                }
                if(node.right!=null)
                {
                     q.offer(new Pair(x+1,node.right));   
                }
            }
            
            
        }
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
	        ans.add(entry.getValue());
	    }
        return ans;
    }
}

```

## right view of a tree

```java
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        right(root,0,ans);
        return ans;

    }

    public void right(TreeNode root, int level, List<Integer> ans)
    {
        if(root==null)return;

      if(level == ans.size())ans.add(root.val);</mark>
        
        right(root.right,level+1,ans);
        right(root.left,level+1,ans);
        
    }
}
```

## path from root to a particular node N

![[Screenshot from 2025-04-11 17-37-16.png]]

## Lowest common ancestor

```java
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null)
            return null;

        if (root == p || root == q || root == null)
            return root;

        TreeNode l = lowestCommonAncestor(root.left, p, q);

        TreeNode r = lowestCommonAncestor(root.right, p, q);

        if (r == null)
            return l;
        else if (l == null)
            return r;
        else
            return root;

    }
}

```

## root > children children sum property

![[Screenshot from 2025-04-11 22-13-54 1.png]]

## All Nodes Distance K in Binary Tree

![[Screenshot from 2025-04-12 16-32-24.png]]
```java

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public void checkHasParent(TreeNode root, Map<TreeNode, TreeNode> parents) {
        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);

        while (!q.isEmpty()) {
            TreeNode current = q.poll();
            if (current.left != null) {
                parents.put(current.left, current);
                q.offer(current.left);
            }
            if (current.right != null) {
                parents.put(current.right, current);
                q.offer(current.right);
            }
        }

    }

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> ans = new ArrayList<>();
        if (target == null)
            return null;
        Map<TreeNode, TreeNode> parents = new HashMap<>();
        checkHasParent(root, parents);
        Map<TreeNode, Boolean> vis = new HashMap<>();

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(target);
        vis.put(target, true);
        int curr = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            if (curr == k) {
                break;
            } else {
                curr++;
            }

            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();

                if (node.left != null && vis.get(node.left) == null) {
                    q.offer(node.left);
                    vis.put(node.left, true);
                }
                if (node.right != null && vis.get(node.right) == null) {
                    q.offer(node.right);
                    vis.put(node.right, true);
                }
                if (parents.get(node) != null && vis.get(parents.get(node)) == null) {
                    q.offer(parents.get(node));
                    vis.put(parents.get(node), true);
                }
            }
        }

        while (!q.isEmpty())

        {
            TreeNode current = q.poll();
            ans.add(current.val);
        }
        return ans;

    }

}
```

faster:
```java

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    // Optimised approach   

    void printKdown(TreeNode root, TreeNode blocker, int k, List<Integer> ans){
        if(k<0 || root==null || root==blocker){
            return;
        }
        if(k==0){
            ans.add(root.val);
            return;
        }
        printKdown(root.left,blocker,k-1,ans);
        printKdown(root.right,blocker,k-1,ans);
    }    

    int findNodePath(TreeNode root, TreeNode target, int k, List<Integer> ans) {
        if(root==null){
            return -1;
        }
        if(root==target){
            printKdown(root,null,k-0,ans);
            return 1;
        }
        int ls=findNodePath(root.left,target,k,ans);
        if(ls!=-1){
            printKdown(root,root.left,k-ls,ans );
            return ls+1;
        }
        int rs=findNodePath(root.right, target, k, ans);
        if(rs!=-1){
            printKdown(root,root.right,k-rs,ans);
            return rs+1;
        }
        return -1;
    }
    List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> ans = new ArrayList<>();
        findNodePath(root, target, k, ans);
        return ans;
    }
}
```



# Graphs

## Number of Provinces

```java
class Solution {
    public int findCircleNum(int[][] isConnected) {
        List<List<Integer>> adjLs = new ArrayList<>();
        for(int i = 0;i<isConnected.length;i++) {
            adjLs.add(new ArrayList<Integer>()); 
        }
        for(int i =0;i<isConnected.length;i++)
        {
            for(int j =0;j<isConnected[0].length;j++)
            {
                if(isConnected[i][j]==1 && i!=j)
                {
                     adjLs.get(i).add(j); 
                    adjLs.get(j).add(i); 
                }
            }
        }



        int vis[] = new int[isConnected.length]; 
        int cnt = 0; 
        for(int i = 0;i<isConnected.length;i++) {
            if(vis[i] == 0) {
               cnt++;
               dfs(i, adjLs, vis); 
            }
        }
        return cnt; 
    }

     public void dfs(int node, 
      List<List<Integer>> adjLs , 
       int vis[]) 
       {
        vis[node] = 1; 
        for(Integer it: adjLs.get(node)) {
            if(vis[it] == 0) {
                dfs(it, adjLs, vis); 
            }
        }
    }
}
```

not convertig to arraylist
```java
class Solution {
    public int findCircleNum(int[][] isConnected) {
        int vis[] = new int[isConnected.length];
        int cnt =0;
        for(int i =0;i<vis.length;i++)
        {
            if(vis[i]!=1)
            {
                cnt++;
                dfs(i,isConnected,vis);
            }
        }

        return cnt;
    }

    public void dfs(int i, int[][] arr,int[] vis)
    {

        
        vis[i]=1;
        
        for(int j=0;j<arr.length;j++)
        {
            if(arr[i][j]==1 && vis[j]==0 && i!=j){
                dfs(j,arr,vis);
            }

        }
        
    }
}
```

## rotten oranges
![[Screenshot from 2025-04-13 13-34-18.png]]
![[Screenshot from 2025-04-13 13-34-31.png]]
```java

class Pair {
    int row;
    int col;
    int tm;

    Pair(int row, int col, int tm) {
        this.row = row;
        this.col = col;
        this.tm = tm;
    }
}

class Solution {
    public int orangesRotting(int[][] grid) {
        int rlen = grid.length;
        int clen = grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        int[][] vis = new int[rlen][clen];
        int cntFresh = 0;
        for (int i = 0; i < rlen; i++) {
            for (int j = 0; j < clen; j++) {
                if (grid[i][j] == 2) {
                    q.offer(new Pair(i, j, 0));
                    vis[i][j] = 2;
                } else {
                    vis[i][j] = 0;
                }

                if (grid[i][j] == 1)
                    cntFresh++;
            }
        }
        int tm = 0;
        int cnt = 0;
        int dx[] = { 1, 0, -1, 0 };
        int dy[] = { 0, 1, 0, -1 };
        while (!q.isEmpty()) {
            int r = q.peek().row;
            int c = q.peek().col;
            int t = q.peek().tm;

            tm = Math.max(tm, t);
            q.poll();
            for (int i = 0; i < 4; i++) {
                int nrow = r + dx[i];
                int ncol = c + dy[i];
                if (nrow >= 0 && ncol >= 0 && nrow < rlen && ncol < clen && grid[nrow][ncol] == 1
                        && vis[nrow][ncol] == 0) {
                    q.offer(new Pair(nrow, ncol, t + 1));
                    vis[nrow][ncol] = 2;
                    cnt++;
                }
            }
        }
        if (cnt != cntFresh)
            return -1;
        return tm;
    }
}
```

## Flood Fill Algorithm
![[Screenshot from 2025-04-13 16-32-37.png]]
```java

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int dx[] = {1,0,-1,0};
        int dy[] = {0,1,0,-1};
        int initialColor = image[sr][sc];
        int ans[][] = image;
        dfs(initialColor,ans,image,color,sr,sc,dx,dy);
        return ans;
    }

    public void dfs(int initialColor,int[][] ans,int[][] image,int color,int row,int col,int[] dx,int[] dy)
    {
        ans[row][col]=color;

        int n = image.length;
        int m = image[0].length;
        for(int i =0;i<4;i++){
            int nrow = row+dx[i];
            int ncol = col+dy[i];
            if(nrow>=0 && ncol>=0 && nrow<n && ncol<m && image[nrow][ncol]==initialColor && ans[nrow][ncol]!=color){
                 dfs(initialColor,ans,image,color,nrow,ncol,dx,dy);
            }
        }

       
    }
}
```

## Detect Cycle in a undirected graph
### BFS

![[Screenshot from 2025-04-13 18-29-47.png]]