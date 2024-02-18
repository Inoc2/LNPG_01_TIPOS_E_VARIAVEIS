import java.util.Scanner;

public class par_ou_impar_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um numero inteiro e verifique se ele e par ou impar.\n");
        int number_user = scanner.nextInt();

        if (number_user % 2 == 0) {
            System.out.printf("O numero %d e par", number_user);
        } 
        else {
            System.out.printf("O numero %d e impar", number_user);
        }

        scanner.close();
    }
}
