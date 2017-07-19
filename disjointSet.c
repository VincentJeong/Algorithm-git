#include <stdio.h>

int par[5005];

int find(int x)
{
	if (par[x] == x)
		return x;
	else
		find(par[x]);
}

void link(int x, int y)
{
	par[find(y)] = find(x);
}

int main()
{
	int n, q;
	scanf("%d %d", &n, &q);

	for (int i = 1; i <= n; i++)
	{
		par[i] = i;
	}

	while (q--) {
		int cmd, x, y;
		scanf("%d %d %d", &cmd, &x, &y);
		if (cmd == 1) {
			link(x, y);
		}
		else
		{
			if (find(x) == find(y)) 
			{
				printf("1\n");
			}
			else {
				printf("0\n");
			}
		}
	}

	return 0;
}



/*제작하다 실패한 코드
int main(void)
{

	char c;
	int x;
	int y;
	printf("program is start\n");
	printf("input the order number\n");
	

	while (1)
	{
		printf("1. link\n");
		printf("2. find\n");
		printf("3. quit the program\n");
		scanf("%c", &c);

		switch (c)
		{
		case '1' :
		{
			printf("input x and y\n");
			scanf("%d", &x);
			scanf("%d", &y);
			link(x, y);

			for (int i = 0; i < 10; i++)
			{
				printf("%d  ", par[i]);
			}

		}
		
		case '3' :
				return 0;
		}

		printf("\n");
	}

	return 0;
}

*/