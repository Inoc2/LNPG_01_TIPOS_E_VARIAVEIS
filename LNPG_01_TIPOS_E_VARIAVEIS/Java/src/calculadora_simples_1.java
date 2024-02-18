import java.util.Scanner;

public class calculadora_simples_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o primeiro numero:\n");
        double number_user_1_float = scanner.nextDouble();

        System.out.print("Insira o segundo numero:\n");
        double number_user_2_float = scanner.nextDouble();

        System.out.printf("%.2f + %.2f = %.2f\n", number_user_1_float, number_user_2_float, number_user_1_float + number_user_2_float);
        System.out.printf("%.2f - %.2f = %.2f\n", number_user_1_float, number_user_2_float, number_user_1_float - number_user_2_float);
        System.out.printf("%.2f * %.2f = %.2f\n", number_user_1_float, number_user_2_float, number_user_1_float * number_user_2_float);

        if (number_user_2_float == 0) {
            System.out.println("Nao existe divisao por 0.");
        } 
        else {
            System.out.printf("%.2f / %.2f = %.2f\n", number_user_1_float, number_user_2_float, number_user_1_float / number_user_2_float);
        }

        scanner.close();
    }
}
