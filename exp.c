#include <stdio.h>
int max(int num1, int num2)
{
    return (num1 > num2 ) ? num1 : num2;
}

int min(int num1, int num2) 
{
    return (num1 > num2 ) ? num2 : num1;
}
 
 int isPowerOfTwo(int n)
{
     if (n == 0)
        return 0;
    while (n != 1) {
        if (n % 2 != 0)
            return 0;
        n = n / 2;
    }
    return 1;
}




int main(void) {
int T;
	scanf("%d",&T);
	int X;
    int Y;
	for (int i = 0; i <T; i++) {
	    scanf("%d",&X);
        scanf("%d",&Y);
        if(X<=1 ||X>=50 || Y<=1 || Y>=50){
            printf("NO\n");
        }
        else if (max(X,Y)%min(X,Y)==0)
        {
            int num = max(X,Y)/min(X,Y);
            isPowerOfTwo(num) ? printf("YES\n") : printf("NO\n");
        }
        else
        {
            printf("NO\n");
        }
	    }
        return 0;
	}
	


