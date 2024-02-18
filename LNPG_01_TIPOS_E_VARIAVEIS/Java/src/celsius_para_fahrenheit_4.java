import java.util.Scanner;

public class celsius_para_fahrenheit_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira uma temperatura em °C para ser transformada em °F.\n°C ");
        double temperature_celsius_from_user = scanner.nextDouble();
        
        double current_temperature_fahrenheit_user = ((temperature_celsius_from_user * 1.8) + 32);

        System.out.printf("A temperatura inserida (°C %.2f) e equivalente a {°F %.2f}", temperature_celsius_from_user, current_temperature_fahrenheit_user);

        scanner.close();
    }
}
