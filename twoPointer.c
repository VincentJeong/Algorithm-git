#include <stdio.h>

#define max 5005

int A[max]; int B[max]; int sorted[max + max];


int main(void)
{
	int n, m;
	printf("input the legnth of 1st Array\n");
	scanf("%d", &n);

	printf("input, components of 1st Array\n");
	for (int i = 0; i < n; i++)
	{
		scanf("%d", &A[i]);
	}

	printf("input the length of 2nd Array\n");
	scanf("%d", &m);

	printf("input, components of 2nd Array\n");
	for (int i = 0; i < m; i++)
	{
		scanf("%d", &B[i]);
	}

	int a = 0;
	int b = 0; 

	for (int i = 0; i < n + m; i++)
	{
		if (b == m || (b != m && a < n && A[a] < B[b]))
			sorted[i] = A[a++];
		else
			sorted[i] = B[b++];

	}


	for (int i = 0; i < n + m; i++)
	{
		printf("%d ", sorted[i]);
	}


}
