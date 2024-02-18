#include <stdio.h>

int main() {
    int age_user;
    printf("Insira a sua idade (ex.: 20)\n");
    scanf("%d", &age_user);
    
   if (age_user >= 18) {
       printf("Voce e maior de idade, pois sua idade (%d) e superior a 17.", age_user);
   }
   else {
       printf("Voce e menor de idade, pois sua idade (%d) e inferior a 18.", age_user);
   }
   
    return 0;
}