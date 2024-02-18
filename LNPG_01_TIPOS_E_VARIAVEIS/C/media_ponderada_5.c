#include <stdio.h>

int main() {
    float note_1_user;
    printf("Digite a primeira nota.\n");
    scanf("%f", &note_1_user);
    
    int note_weight_1_user;
    printf("Digite o peso da nota (%.2f)\n", note_1_user);
    scanf("%d", &note_weight_1_user);
    
    float note_2_user;
    printf("Digite a segunda nota.\n");
    scanf("%f", &note_2_user);
    
    int note_weight_2_user;
    printf("Digite o peso da nota %.2f)\n", note_2_user);
    scanf("%d", &note_weight_2_user);

    float note_3_user;
    printf("Digite a terceira nota.\n");
    scanf("%f", &note_3_user);
    
    int note_weight_3_user;
    printf("Digite o peso da nota (%.2f)\n", note_3_user);
    scanf("%d", &note_weight_3_user);

    float weighted_average_user_notes;
    float sum_all_weights;
    sum_all_weights = (note_weight_1_user + note_weight_2_user + note_weight_3_user);
    weighted_average_user_notes = ((note_1_user * note_weight_1_user) + (note_2_user * note_weight_2_user) + (note_3_user * note_weight_3_user)) / sum_all_weights;
    
    printf("A nota final e %.2f.", weighted_average_user_notes);
    
    return 0;
}