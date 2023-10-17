package org.example;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class GigaSecond
{
    private final LocalDateTime birthDate;
    private  final long GIGASSECOND = 1_000_000L; //Oznacza to, że GIGSSECOND ma wartość 1 000 000 jako liczba całkowita typu long.

    public GigaSecond(LocalDateTime birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDateTime getData()
    {
        Duration gigaSekunda = Duration.ofSeconds(GIGASSECOND); // Duration-eprezentuje okres czasu lub różnicę czasu pomiędzy dwoma momentami w czasie,
        return birthDate.plus(gigaSekunda); // Dodaj jedną gigasekundę do daty urodzenia.
    }
}

   /*
   LocalDateTime = LocalDate + LocalTime
    LocalDateTime, który zawiera zarówno datę, jak i czas, włączając godzinę, minuty, sekundy i milisekundy.

    LocalDate, który reprezentuje tylko datę, bez informacji o godzinie, minutach, sekundach i milisekundach.
   * */
