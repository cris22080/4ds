#include <stdio.h>;
int main()
{
int num = 5;
int *ptr;
int *ptr2;
ptr =&num;
ptr2 = ptr;
printf("%d\n", *ptr);
printf("%d", *ptr2);



return 0;
}