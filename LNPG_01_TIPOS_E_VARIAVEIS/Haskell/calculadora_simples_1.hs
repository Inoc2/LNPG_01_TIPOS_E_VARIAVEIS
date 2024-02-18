import Text.Printf

main :: IO ()
main = do
    putStrLn "Digite o primeiro número."
    number_user_1_float <- readLn :: IO Float

    putStrLn "Digite o segundo número."
    number_user_2_float <- readLn :: IO Float

    printf "%f + %f = %f\n" number_user_1_float number_user_2_float (number_user_1_float + number_user_2_float)
    printf "%f - %f = %f\n" number_user_1_float number_user_2_float (number_user_1_float - number_user_2_float)
    printf "%f * %f = %f\n" number_user_1_float number_user_2_float (number_user_1_float * number_user_2_float)

    if number_user_2_float == 0
        then putStrLn "Não e possivel dividir por 0."
        else printf "%f / %f = %.2f\n" number_user_1_float number_user_2_float (number_user_1_float / number_user_2_float)