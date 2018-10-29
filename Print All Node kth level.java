import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
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
class Print_Kth_LeveleNode
{
	Node root;
   void printNode(Node root,int k)
   {
   	if(root==null)
   		return;
    Queue<Node> q1=new LinkedList<Node>();
    Queue<Node> q2=new LinkedList<Node>();
    q1.add(root);
    int x=0;
    while(!q1.isEmpty()||!q2.isEmpty())
    {
      if(x==k)
      {
      	while(!q1.isEmpty())
      	{
      		System.out.print(q1.poll().data+" ");
      	}
      	break;
      }
      while(!q1.isEmpty())
      {
      	Node u=q1.poll();
      	if(u.left!=null)
      		q2.add(u.left);
      	if(u.right!=null)
      		q2.add(u.right);
      }
      x++;
      if(x==k)
      {
      	while(!q2.isEmpty())
      	{
      		System.out.print(q2.poll().data+" ");
      	}
      	break;
      }
   while(!q2.isEmpty())
      {
      	Node u=q2.poll();
      	if(u.left!=null)
      		q1.add(u.left);
      	if(u.right!=null)
      		q1.add(u.right);
      }
      x++;

    }

   }
   public static void main(String[] args) {
   	Print_Kth_LeveleNode tree=new Print_Kth_LeveleNode();
   	tree.root=new Node(10);
		tree.root.left=new Node(11);
		tree.root.left.left=new Node(7);
		tree.root.left.right=new Node(12);
		tree.root.right=new Node(9);
		tree.root.right.left=new Node(15);
		tree.root.right.right=new Node(8);
		tree.root.right.right.right=new Node(9);
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		tree.printNode(tree.root,k);
   }
	
}
