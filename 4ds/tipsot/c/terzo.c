#include <stdio.h>;
int main()
{
int num[] = {1,2,3,4,5};
int *ptr;
ptr =&num;

for (int i = 0; i < 5; i++)
{
    printf("%d", *ptr);
    *ptr +=1;
}


return 0;
}