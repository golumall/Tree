import java.util.Vector;
import java.util.Collections;
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
class Check_Tree_Has_Duplicate_ELement
{
	Node root;
  Vector v=new Vector();
  void preOrder(Node node)
  {
  	if(node==null)
  		return;
  	v.add(node.data);
  	preOrder(node.left);
  	preOrder(node.right);
  }
  boolean check(Node root)
  {
    preOrder(root);
  Collections.sort(v);

  	for(int i=0;i<v.size()-1;i++)
  	{
     if(v.elementAt(i)==v.elementAt(i+1))
     	return true;
  	}
  	return false;
  }
  public static void main(String[] args) {
  	Check_Tree_Has_Duplicate_ELement tree=new Check_Tree_Has_Duplicate_ELement();
  	tree.root=new Node(1);
  	tree.root.left=new Node(2);
  	tree.root.right=new Node(3);
  	//tree.root.right.left=new Node(2);
  	if(tree.check(tree.root))
  		System.out.println("YES");
  	else
  		System.out.println("NO");
  }

}
