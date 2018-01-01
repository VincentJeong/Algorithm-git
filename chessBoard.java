import java.util.Scanner;

public class chessBoard
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		char [][] chess = new char[8][8];
		
		int cnt =0;


		for(int  i=0; i<8; i++)
		{
			String A = sc.nextLine();
			
			for(int j=0; j<8; j++)
				
			{
				chess[i][j] = A.charAt(j);
				
				if(chess[i][j]=='F' && (i+j)%2==0)
					cnt++;
			}
		}
		
		System.out.println(cnt);

	}

}
