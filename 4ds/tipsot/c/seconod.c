#include <stdio.h>;
void incrementa(int* ptr);
int main()
{
int num;
num = 5;
int *ptr;
ptr =&num;

incrementa(ptr);
 printf("%d", *ptr);

return 0;
}
void incrementa(int *ptr){
    *ptr +=1;
}