


class Node{
    int data;
    Node left,right;
    Node(int data)
    {
        this.data=data;
        left=right=null;
    }
}

class Count_Subtree_ThatSum_UpToValue_X {
    Node root;
    static int sum=0;
   int getSum(Node node)
    {
        if(node==null)
          return 0;
       return node.data+getSum(node.left)+getSum(node.right);
        
    }
    void preOrder(Node node,int s)
    {
        if(node==null)
          return;
         if(s==getSum(node.left))
              sum++;
                
          if(s==getSum(node.right))
            sum++;
          preOrder(node.left,s);
          preOrder(node.right,s);
    }
    void check()
    {
        System.out.println(sum);
    }
	public static void main (String[] args) {
		Sum_Of_height_Individual tree=new Sum_Of_height_Individual();
		tree.root=new Node(1);
		tree.root.left=new Node(-10);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(9);
		tree.root.left.right=new Node(8);
		tree.root.right.left=new Node(-4);
		tree.root.right.right=new Node(7);
		tree.preOrder(tree.root,7);
		tree.check();
	
	}
}
