package org.example;

public class RotationalCipher
{
    private int shiftKey;
    RotationalCipher(int shiftKey) {
        this.shiftKey = shiftKey;
    }

    public String encrypt(String text)
    {
        StringBuilder encryptedText = new StringBuilder();
        for(char character: text.toCharArray())//iteruje przez każdy znak w tekście, który ma zostać zaszyfrowany.
        {
            if(Character.isLetter(character)) //: Sprawdza, czy aktualny znak (litera) jest literą (czy jest to znak alfabetyczny).
            {
                // działanie na kodach liter a = 97, z = 122 ANCII
                char base = Character.isLowerCase(character) ? 'a' : 'A'; //: Ustala podstawową literę 'a' lub 'A' (zależnie od tego, czy litera jest mała czy wielka) jako punkt odniesienia do obliczenia przesunięcia.
                int offset = (character - base + shiftKey) % 26; //Oblicza przesunięcie dla danej litery, odejmując kod znaku podstawowego od kodu znaku i dodając przesunięcie shiftKey. Następnie obliczany jest reszta z dzielenia przez 26, aby zapewnić, że przesunięcie pozostaje w zakresie alfabetu.
                char encryptedChar = (char) (base +offset); //Oblicza zaszyfrowaną literę, dodając obliczone przesunięcie do podstawowej litery
                encryptedText.append(encryptedChar);

                /*
               baze = 'a  czyli 97
               offset = (111-97+5) % 26 =19
               encryptedChar = 97+19= 107 wiec "t"
                */
            }
            else {
                encryptedText.append(character);
            }
        }
        return encryptedText.toString();
    }
    public String decrypt(String text)
    {
        int reverseKey = 26 - shiftKey;
        RotationalCipher decryptCiper = new RotationalCipher(reverseKey);
        return decryptCiper.encrypt(text);
    }
}
