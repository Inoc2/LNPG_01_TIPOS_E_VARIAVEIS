import Text.Printf

main :: IO ()
main = do
    putStrLn "Digite sua idade."
    age_user <- readLn :: IO Int

    if age_user >= 18
        then printf "Voce e de maior, pois a sua idade (%d) e superior a 17." age_user
        else printf "Voce e de menor, pois a sua idade (%d) e inferior a 18." age_user
