import Text.Printf

main :: IO ()
main = do
    putStrLn "Digite a primeira nota."
    note_1_user <- readLn :: IO Float

    putStrLn "Digite o peso da primeira nota."
    note_weight_1_user <- readLn :: IO Float

    putStrLn "Digite a segunda nota."
    note_2_user <- readLn :: IO Float

    putStrLn "Digite o peso da segunda nota."
    note_weight_2_user <- readLn :: IO Float

    putStrLn "Digite a terceira nota."
    note_3_user <- readLn :: IO Float

    putStrLn "Digite o peso da terceira nota."
    note_weight_3_user <- readLn :: IO Float

    let sum_all_weights = note_weight_1_user + note_weight_2_user + note_weight_3_user
    let weighted_average_user_notes = ((note_1_user * note_weight_1_user) + (note_2_user * note_weight_2_user) + (note_3_user * note_weight_3_user)) / sum_all_weights

    printf "A nota final e %.2f." weighted_average_user_notes;
