import java.util.Scanner;

public class media_ponderada_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a primeira nota:\n");
        double note_1_user = scanner.nextDouble();

        System.out.print("Insira o peso da primeira nota:\n");
        int note_weight_1_user = scanner.nextInt();

        System.out.print("Insira a segunda nota:\n");
        double note_2_user = scanner.nextDouble();

        System.out.print("Insira o peso da segunda nota:\n");
        int note_weight_2_user = scanner.nextInt();

        System.out.print("Insira a terceira nota:\n");
        double note_3_user = scanner.nextDouble();

        System.out.print("Insira o peso da terceira nota:\n");
        int note_weight_3_user = scanner.nextInt();

        double sum_all_weights = (note_weight_1_user + note_weight_2_user + note_weight_3_user);
        double weighted_average_user_notes = ((note_1_user * note_weight_1_user) + (note_2_user * note_weight_2_user) + (note_3_user * note_weight_3_user)) / sum_all_weights;

        System.out.printf("A nota final e igual a %.2f", weighted_average_user_notes);
        scanner.close();
    }
}
