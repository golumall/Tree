


class Node{
    int data;
    Node left,right;
    Node(int data)
    {
        this.data=data;
        left=right=null;
    }
}

class Sum_Of_height_Individual {
    Node root;
    static int sum=0;
    int height(Node node)
    {
        if(node==null)
          return 0;
        int lheight=height(node.left);
        int rheight=height(node.right);
        if(lheight>rheight)
           return lheight+1;
         else
         return rheight+1;
    
        
    }
    void preOrder(Node node)
    {
        if(node==null)
          return;
          sum+=height(node);
          preOrder(node.left);
          preOrder(node.right);
    }
	public static void main (String[] args) {
		Sum_Of_height_Individual tree=new Sum_Of_height_Individual();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		tree.preOrder(tree.root);
		System.out.println(sum);
	}
}
