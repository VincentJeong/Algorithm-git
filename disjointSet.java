import java.util.*;

public class disjointSet
{

	static int par[] = new int[5000];
	
	 public static void main(String args[]) 
	 {
		 Scanner sc = new Scanner(System.in);
		 
		 int n = sc.nextInt(); // number of nodes
		 int q = sc.nextInt(); // number of orders
		 
		 while (q-- > 0) 
		 {
	            int cmd = sc.nextInt();
	            int x = sc.nextInt();
	            int y = sc.nextInt();

	            if (cmd == 1) 
	            {
	                link(x, y);
	            }
	            else
	            {
	                if (find(x) == find(y)) 
	                {
	                    System.out.println(1);
	                }
	                else {
	                    System.out.println(0);
	                }
	            }
	        }
	    
		 
	 }
	 
	 public static int find(int x)
	 {
		 if(par[x]==x)
			 return x;
		 else
			 return par[x] = find(par[x]);
	 }
	 
	 public static void link(int x, int y)
	 {
		 par[find(y)]=find(x);
	 }
}
