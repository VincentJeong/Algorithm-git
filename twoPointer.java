import java.util.*;

public class twoPointer 
{
    public static void main(String args[]) 
    {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        for (int i = 0; i < n; i++)
        {
            A.add(scanner.nextInt());
        }

        int m = scanner.nextInt();
        ArrayList<Integer> B = new ArrayList<>();
        for (int i = 0; i < m; i++)
        {
            B.add(scanner.nextInt());
        }

        ArrayList<Integer> Sorted = new ArrayList<>();
        
        int a = 0, b = 0;
        
        for (int i = 0; i < n + m; i++) 
        {
            if (b == m || (b != m && a < n && A.get(a) < B.get(b)))
                Sorted.add(A.get(a++));
            else
                Sorted.add(B.get(b++));
        }

        for (int i=0; i<n+m; i++)
            System.out.print(Sorted.get(i)+ " ");
    }
}