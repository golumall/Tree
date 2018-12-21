
import java.util.Queue;
import java.util.LinkedList;

class Node{
    int data;
    Node left,right;
    Node(int data)
    {
        this.data=data;
        left=right=null;
    }
}

class Difference_Sum_Of_Odd_and_Even_Level_Node {
    Node root;
    int sum1=0,sum2=0;
    void getDiff(Node node)
    {
        if(node==null)
          return;
         Queue<Node> q1=new LinkedList<Node>();
         Queue<Node> q2=new LinkedList<Node>();
         q1.add(node);
        
         while(!q1.isEmpty()||!q2.isEmpty())
         {
             while(!q1.isEmpty())
             {
                 Node d=q1.poll();
                 sum1+=d.data;
                 if(d.left!=null)
                    q2.add(d.left);
                 if(d.right!=null)
                    q2.add(d.right);
             }
             while(!q2.isEmpty())
             {
                 Node d=q2.poll();
                 sum2+=d.data;
                 if(d.left!=null)
                    q1.add(d.left);
                 if(d.right!=null)
                    q1.add(d.right);
             }
         }
         System.out.println((sum1-sum2));
        
    }
	public static void main (String[] args) {
		Difference_Sum_Of_Odd_and_Even_Level_Node tree=new Difference_Sum_Of_Odd_and_Even_Level_Node();
		tree.root=new Node(5);
		tree.root.left=new Node(2);
		tree.root.right=new Node(6);
		tree.root.left.left=new Node(1);
		tree.root.left.right=new Node(4);
	//	tree.root.right.left=new Node(-4);
		tree.root.right.right=new Node(8);
		tree.root.left.right.left=new Node(3);
		tree.root.right.right.left=new Node(7);
		tree.root.right.right.right=new Node(9);
		tree.getDiff(tree.root);
	
	}
}
