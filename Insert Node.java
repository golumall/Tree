import java.util.Queue;
import java.util.LinkedList;
class Node
{
	int data;
	Node left,right;
	Node(int data)
	{
	this.data=data;
	left=right=null;
	}
}
class Insert_Node
{
	Node root;
   void inOrder(Node root)
   {
   	if(root==null)
   		return;
   	inOrder(root.left);
   	System.out.print(root.data+" ");
   	
   	inOrder(root.right);
   }
   void insert(Node root,int key)
   {
       if(root==null)
       {
       	  root=new Node(key);
       	  return;
       }
       Queue<Node> q=new LinkedList<Node>();
       q.add(root);
       while(!q.isEmpty())
       {
       	Node u=q.poll();
       	if(u.left==null)
       	{
           u.left=new Node(key);
           return;
       	}
        else if(u.right==null)
        {
        	u.right=new Node(key);
        	return;
        }
        else
        {
        	q.add(u.left);
        	q.add(u.right);
        }
      }
     
   }
    public static void main(String[] args) {
      	Insert_Node tree=new Insert_Node();
      	tree.root=new Node(10);
      	tree.root.left=new Node(11);
      	tree.root.right=new Node(9);
      	tree.root.left.left=new Node(7);
      	tree.root.right.left=new Node(15);
      	tree.root.right.right=new Node(8);
      	int x=12;
      	tree.inOrder(tree.root);
        tree.insert(tree.root,x);
        System.out.println();
        tree.inOrder(tree.root);   
      }
}
