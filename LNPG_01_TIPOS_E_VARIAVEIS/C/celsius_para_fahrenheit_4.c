#include <stdio.h>

int main() {
    float temperature_celsius_number_user;
    printf("Insira um numero (em celsius) e veja o equivalente a Fahrenheit.\n°C ");
    scanf("%f", &temperature_celsius_number_user);
    
    float current_temperature_user_on_fahrenheit;
    current_temperature_user_on_fahrenheit = (temperature_celsius_number_user * 1.8) + 32;
    
    printf("A temperatura inserida (°C %.2f) e equivalente a °F %.2f em Fahrenheit.", temperature_celsius_number_user, current_temperature_user_on_fahrenheit);
 
    return 0;
}