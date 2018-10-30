import java.util.Scanner;
import java.util.Stack;
class Node
{
	char data;
	Node left,right;
	Node(char data)
	{
	this.data=data;
	left=right=null;
	}
}
class Expression_Tree
{
     boolean isOperator(char c)
     {
     	if(c=='+'||c=='-'||c=='*'||c=='/'||c=='^')
     		return true;
     	return false;
     }
     void inOrder(Node node)
     {
     	if(node==null)
     		return;
     	inOrder(node.left);
     	System.out.print(node.data+" ");
     	inOrder(node.right);
     }
     Node constructTree(char post[])
     {
        Stack<Node> st=new Stack<Node>();
        Node t,t1,t2;
        for(int i=0;i<post.length;i++)
        {
        	if(!isOperator(post[i]))
        	{
        		t=new Node(post[i]);
        		st.push(t);
        	}
        	else
        	{
        		t=new Node(post[i]);
        		t1=st.pop();
        		t2=st.pop();
        		t.right=t1;
        		t.left=t2;
        		st.push(t);
        	}
        }
        t=st.pop();
        return t;

     }
     public static void main(String[] args) {
     	Expression_Tree tree=new Expression_Tree();
     		Scanner sc=new Scanner(System.in);
     		char a[]=sc.next().toCharArray();
     		tree.inOrder(tree.constructTree(a));
     	}	
}
