import Text.Printf

main :: IO ()
main = do
    putStrLn "Insira uma temperatura em °C, a qual sera transformada em °F."
    temperature_celsius_number_user <- readLn :: IO Float
    
    let current_temperature_user_on_fahrenheit = ((temperature_celsius_number_user * 1.8) + 32)
    
    printf "A temperatura inserida (°C %.2f) e equivalente a °F %.2f em Fahrenheit." temperature_celsius_number_user current_temperature_user_on_fahrenheit
