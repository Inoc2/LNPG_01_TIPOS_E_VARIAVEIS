#include <stdio.h>

int main() {
    float number_user_1_float;
    printf("Insira o primeiro numero:\n");
    scanf("%f", &number_user_1_float);
    
    float number_user_2_float;
    printf("Insira o segundo numero:\n");
    scanf("%f", &number_user_2_float);

    printf("%f + %f = %f\n", number_user_1_float, number_user_2_float, number_user_1_float + number_user_2_float);
    printf("%f - %f = %f\n", number_user_1_float, number_user_2_float, number_user_1_float - number_user_2_float);
    printf("%f * %f = %f\n", number_user_1_float, number_user_2_float, number_user_1_float * number_user_2_float);

    if (number_user_2_float == 0) {
        printf("Nao e possivel dividir por zero.\n");
    } 
    else {
        printf("%f / %f = %.2f\n", number_user_1_float, number_user_2_float, (float)number_user_1_float / number_user_2_float);
    }

    return 0;
}