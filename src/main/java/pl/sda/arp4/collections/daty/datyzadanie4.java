package pl.sda.arp4.collections.daty;

//4. Napisz aplikację, która obliczy twój wiek. Podaj wiek w formacie:
//Masz X lat, Y miesięcy, Z dni. (użyj Period)
//Masz XYZ sekund. (użyj Duration)

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class datyzadanie4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("Wpisz date swojego urodzenia w formacie [yyyy-MM-dd HH:mm:ss] :");
        String wpisanaData1 = scanner.next();
        LocalDateTime data1 = LocalDateTime.parse(wpisanaData1, formatter1);

        LocalDateTime dataTeraz = LocalDateTime.now();
        System.out.println("Obecna data to: " + dataTeraz);

        Period period = Period.between(data1.toLocalDate(), dataTeraz.toLocalDate());
        Duration duration = Duration.between(data1, dataTeraz);

        System.out.println("Masz " + period.getYears() + " lat, " + period.getMonths() + " miesięcy, " + period.getDays());
        System.out.println("Masz " + duration.getSeconds() + " sekund");
    }
}
