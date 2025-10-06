#include <stdio.h>

int main()
{
int num;
num =5;
int *ptr;
ptr=&num;

printf("%d\n", *ptr);
printf("%d\n", &ptr);
*ptr = 4;
printf("%d", *ptr);

    return 0;
}