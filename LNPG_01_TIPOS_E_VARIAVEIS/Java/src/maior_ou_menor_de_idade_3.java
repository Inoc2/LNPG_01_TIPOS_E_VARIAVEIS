import java.util.Scanner;

public class maior_ou_menor_de_idade_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a sua idade.\n");
        int age_user = scanner.nextInt();

        if (age_user >= 18) {
            System.out.printf("Voce e maior de idade, pois sua idade (%d) e superior a 17.", age_user);
        } 
        else {
            System.out.printf("Voce e menor de idade, pois sua idade (%d) e inferior a 18.", age_user);
        }

        scanner.close();
    }
}
