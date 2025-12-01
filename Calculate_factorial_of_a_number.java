#include<stdio.h>
int main(){
    int num;
    scanf("%d",&num);
    int result=1;
    for(int i=num;i>=1;i--){
        result=result*i;
    }
    printf("%d",result);
}