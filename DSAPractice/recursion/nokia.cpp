#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <string.h>
#include <assert.h>


int main()
{
    int T, N, M;
    int i, j, k;
    

    int mn[51], mx[51];

    /* calculate the minimal and maximal total length for each N */
    mn[0] = mx[0] = 0;
   
    for (i = 1; i < 51; i++)
    {
        k = i / 2;
        mn[i] = mn[k] + mn[i - k - 1] + i + 1;
        mx[i] = mx[i - 1] + mx[0] + i + 1;
    }

  
    while (T--)
    {
        
        if (M < mn[N])
            puts("-1");
        else if (M <= mx[N])
            puts("0");
        else
            printf("%d\n", M - mx[N]);
    }

    return 0;
}