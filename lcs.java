import java.util.*;

public class lcs 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);

        int la = sc.nextInt(); //length of string A
        int lb = sc.nextInt(); //length of string B
        String a = sc.next(); // form of String A
        String b = sc.next(); // form of String B

        int lcs[][] = new int[la + 1][lb + 1]; //becuz we have to start index i = 1
        for (int i = 1; i <= la; i++) 
        {
            for (int j = 1; j <= lb; j++) 
            {
            	
            
                if (a.charAt(i - 1) == b.charAt(j - 1)) 
                {
                    lcs[i][j] = lcs[i - 1][j - 1] + 1;
                }
                else 
                {
                    if (lcs[i - 1][j] < lcs[i][j - 1]) 
                    {
                        lcs[i][j] = lcs[i][j - 1];
                    }
                    else 
                    {
                        lcs[i][j] = lcs[i - 1][j];
                    }
                }
            }
        }

        System.out.println(lcs[la][lb]);
    }
}