import java.util.*;

public class Knapsack {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();//물건의 개수  
        int k = sc.nextInt();//배낭의 무게  

        int v[] = new int[n + 1]; //i가 1부터이니 n+1이다  
        int w[] = new int[n + 1];
        for (int i = 1; i <= n; i++) 
        {
            v[i] = sc.nextInt(); ///가치 입력  
            w[i] = sc.nextInt(); //무게 입력
            
        }

        //d[i][j] = max( d[i-1][j] , d[i-1][j-w[i]+v[i] )
        //전자는 i번째 물건을 넣지 않은 상태를 보여주고 후자는 i번째 물건을 넣어준 상태를 말해줌
        //무게 j이하를 넣는 가치의 값중 최대
        int d[][] = new int[n + 1][k + 1];
        for (int i = 1; i <= n; i++)
        {
            for (int j = 0; j <= k; j++) ///j는 무게임 
            {
                if (j < w[i]) 
                {
                    d[i][j] = d[i - 1][j];
                }
                else if (d[i - 1][j - w[i]] + v[i] > d[i - 1][j])
                {
                    d[i][j] = d[i - 1][j - w[i]] + v[i];
                }
                else 
                {
                    d[i][j] = d[i - 1][j];
                }
            }
        }

        int ans = 0;
        for(int i = 0; i <= k; i++)
        {
            if(ans < d[n][i])
            {
                ans = d[n][i];
            }
        }

        System.out.println(ans);
    }
}