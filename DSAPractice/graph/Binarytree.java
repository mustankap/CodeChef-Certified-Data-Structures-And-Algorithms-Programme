public class Binarytree {
    Node root;
    Binarytree(int key)
    {
        root = new Node(key);
    }
    Binarytree()
    {
        root=null;
    }

    public static void main(String[] args)
    {
       Binarytree bt  =  new Binarytree();
       bt.root=new Node(1);
       bt.root.left = new Node(2);
       bt.root.right = new Node(3);
       bt.root.left.left = new Node(4);

    }
}
class Node{
    int key;
    Node left,right;
    public Node(int item)
    {
        key=item;
        left=right=null;
    }
}
