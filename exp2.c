#include <stdio.h>


int main(void) {
	int X;
	int a = 1;
	int b = 1;
	scanf("%d",&X);
	do
	{
		if ((2*a + 2*b + a*b) == X)
		{
			printf("YES");
		}
		else if ((2*a + 2*b + a*b) < X)
		{
			a+=1;
			b+=1;
			continue;
		}
		else
		{
			printf("NO");
		}
		
		
		
	} while (a+b<X/2);
	

	return 0;
}

