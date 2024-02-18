#include <stdio.h>

int main() {
    int number_user;
    printf("Insira um numero inteiro e verifique se ele e par ou impar.\n");
    scanf("%d", &number_user);
    
    if (number_user % 2 == 0) {
        printf("O numero %d e par.", number_user);
    } 
    else {
        printf("O numero %d e impar.", number_user);
    }
    
    return 0;
}