import java.util.Scanner;
class Is_LevelOrder_MinHeap
{
	static boolean isMinheap(int level[],int n)
	{
          for(int i=0;i<n/2+1;i++)
          {
          	if(2*i+1<n)
          	{
          		if(level[i]>level[2*i+1]||level[i]>level[2*i+2])
          			return false;
          	}
          }
          return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		if(isMinheap(a,n))
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
