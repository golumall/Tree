import java.io.*;
import java.util.*;
class TrieNode
{
    Map<Character,TrieNode>m;
    boolean endOfWord;
    public TrieNode()
    {
        m=new HashMap<Character,TrieNode>();
        endOfWord=false;
    }
}

class GFG {
    static final TrieNode root=new TrieNode();
    //Insert String Using Iteration
    static void insertString(String s)
    {
        TrieNode current=root;
        for(int i=0;i<s.length();i++)
        {
            TrieNode node=current.m.get(s.charAt(i));
            if(node==null)
            {
                node=new TrieNode();
                current.m.put(s.charAt(i),node);
                
            }
            current=node;
            
        }
        current.endOfWord=true;
    }
    //Insert String Using Recursion
    static void insertRecursive(String s)
    {
        insertRecursive(root,s,0);
    }
    static void insertRecursive(TrieNode current,String s,int i)
    {
        if(i==s.length())
        {
            current.endOfWord=true;
            return;
        }
        TrieNode node=current.m.get(s.charAt(i));
        if(node==null)
          {
              node=new TrieNode();
              current.m.put(s.charAt(i),node);
          }
          insertRecursive(node,s,i+1);
    }
    //search Using Iteration
    static boolean search(String s)
    {
        TrieNode current=root;
        for(int i=0;i<s.length();i++)
        {
            TrieNode node=current.m.get(s.charAt(i));
            if(node==null)
              return false;
             current=node; 
        }
        return current.endOfWord;
    }
    //Search Using Recursion
    static boolean recursiveSearch(String s)
    {
      return recursiveSearch(root,0,s);
    }
    static boolean recursiveSearch(TrieNode current,int i,String s)
    {
        if(i==s.length())
          return current.endOfWord;
        TrieNode node=current.m.get(s.charAt(i));
        if(node==null)
          return false;
        return recursiveSearch(node,i+1,s);  
    }
    //Delete String
    static void delete(String s)
    {
        delete(root,0,s);
    }
    static boolean delete(TrieNode current,int i,String s)
    {
        if(i==s.length())
        {
            if(!current.endOfWord)
               return false;
               current.endOfWord=false;
             return current.m.size()==0;  
        }
        char ch=s.charAt(i);
        TrieNode node=current.m.get(ch);
          if(node==null)
            return false;
       boolean deleteNode=delete(node,i+1,s);
       if(deleteNode)
       {
           current.m.remove(ch);
           return current.m.size()==0;
       }
       return false;
    }
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n-->0)
		{
		    String s=sc.next();
		   // insertString(s);
		   insertRecursive(s);
		}
		if(recursiveSearch("Jai"))
		  System.out.println("Find");
		 else 
		System.out.println("Not Find"); 
	   if(recursiveSearch("maa"))
	   System.out.println("Find");
	   else
	   System.out.println("Not Find");
	   if(recursiveSearch("Saraswati"))
		  System.out.println("Find");
		 else 
		System.out.println("Not Find");
	    delete("Jai");	
	     	if(recursiveSearch("Jai"))
		  System.out.println("Find");
		 else 
		System.out.println("Not Find"); 
	}
}
