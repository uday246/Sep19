#include <stdio.h>
int checkDNA(){
    int i,count=0;
    char DNA[8];
    char t;
    for(i=0;i<8;i++){
        printf("enter char : ");
        scanf("%c",&DNA[i]);
        scanf("%c",&t);
        
    }
    for(i=0;i<7;i++){
    if(DNA[i]=='C' && DNA[i+1]=='G')
        count++;
    }
    return count;
}
int main()
{
    int c=checkDNA();
    printf("There is %d CG site(s) in given sequence",c);

    return 0;
}
