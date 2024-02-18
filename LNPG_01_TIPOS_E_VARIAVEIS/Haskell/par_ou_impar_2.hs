import Text.Printf

main :: IO ()
main = do
    putStrLn "Digite um numero inteiro e veja se ele e par ou impar."
    number_user <- readLn :: IO Int

    if even number_user
        then printf "O numero %d e par." number_user
        else printf "O numero %d e impar." number_user
