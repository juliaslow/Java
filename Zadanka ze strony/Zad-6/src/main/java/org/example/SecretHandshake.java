package org.example;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


enum Signal
{
    WINK,
    DOUBLE_BLINK,
    CLOSE_YOUR_EYES,
    JUMP

}
public class SecretHandshake
{
    public List<Signal> calculateSingnal(int code) //Signal jest tu używany jako enum, który reprezentuje różne operacje lub sygnały
    { //jestesmy
        if (code < 1 || code > 31) {
            throw new IllegalArgumentException("Liczba musi być w zakresie od 1 do 31.");
        }
        List<Signal> shake = new ArrayList<>();
        if (bitIsOne(code, 0))
            shake.add(Signal.WINK);
        if (bitIsOne(code, 1))
            shake.add(Signal.DOUBLE_BLINK);
        if (bitIsOne(code, 2))
            shake.add(Signal.CLOSE_YOUR_EYES);
        if (bitIsOne(code, 3))
            shake.add(Signal.JUMP);
        if (bitIsOne(code, 4))
            Collections.reverse(shake);

        return shake;
    }

boolean bitIsOne(int code, int bit)
{
    code = code >> bit;// Przesuwamy bity liczby code w prawo o bit miejsc, // patrzymamy na majmniej znaczacy  bit
    if ((code&1)==1) return true;// Sprawdzamy, czy najmniej znaczący bit jest ustawiony na 1 //cade teraz = najmniej znaczacy bit
    return false;
}
//  code = code >> bit; ->   liczba 25 w systemie binarnym to 11001, a po przesunięciu bitów o 2 pozycje w prawo otrzymujemy 110, co w systemie dziesiętnym to 6.
}
