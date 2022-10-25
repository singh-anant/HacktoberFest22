/*Check power of 2 using recursion*/

#include <stdio.h>
int check(int f) {
    if(f == 0) return 0;
    if(f == 1) return 1; 
    
    if(f % 2 != 0) return 0;
    if(f > 1) return check(f / 2);
}
int main(){
    int n = 0, a;
    printf("Enter a number: ");
    scanf("%d", &n); 
    a = check(n);
    if(a == 1) printf("True");
    else printf("False"); 
    return 0;
}