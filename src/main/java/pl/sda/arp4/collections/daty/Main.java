package pl.sda.arp4.collections.daty;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Standardowa Biblioteka Javy = Java SE (Standard Edition)
        Date data = new Date();
        System.out.println(data);

        // joda time
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        // stworzenie formattera
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"); // M - Month , m = minute
//        System.out.println(formatter.format(localDate)); // exception // Unsupported field: HourOfDay
//        System.out.println(formatter.format(localTime)); // exception // Unsupported field: YearOfEra
        System.out.println(formatter.format(localDateTime));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz date i godzine 1:");
        String dataOdUzytkownika1 = scanner.nextLine();

        LocalDateTime datetime1 = LocalDateTime.parse(dataOdUzytkownika1, formatter);
        System.out.println("Wprowadziłeś: " + datetime1);
        System.out.println("Wprowadziłeś: " + formatter.format(datetime1));
//        LocalDate.parse(dataOdUzytkownika, formatter);
//        LocalTime.parse(dataOdUzytkownika, formatter);
        // formatter.parse(dataOdUzytkownika); // to wymaga dużo pracy z rzutowaniem obiektów
        System.out.println("Date in 5 days: " + datetime1.plusDays(5));
        System.out.println("Date in 5 days: " + datetime1.plusDays(5));

    }
}