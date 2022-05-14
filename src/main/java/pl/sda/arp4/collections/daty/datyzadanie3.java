package pl.sda.arp4.collections.daty;
//3. Pobierz od użytkownika dwie daty. Jedna w formacie:
//   yyyy::MM::dd
//   oraz druga w formacie:
//   MM::yyyy::dd
//   Wypisz wynik różnicy dat w formacie:
//   Minęło: X lat, Y miesięcy, Z dni.
//   Do wypisania dni/lat/miesięcy z Period, wykorzystaj jego gettery. (edited)

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class datyzadanie3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy::MM::dd");
        System.out.println("Wpisz date w formacie yyyy-MM-dd:");
        String wpisanaData1 = scanner.next();                                   // 2022-03-10
        LocalDate data1 = LocalDate.parse(wpisanaData1, formatter1);

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy::MM::dd");

        System.out.println("Wpisz date w formacie yyyy::MM::dd:");
        String wpisanaData2 = scanner.next();                                   // 2021-02-10
        LocalDate data2 = LocalDate.parse(wpisanaData2, formatter2);


        Period period = Period.between(data1, data2);
        // Math.abs(x) -> wartość bezwzględna z wartości zmiennej x
        int years = Math.abs(period.getYears());
        int months = Math.abs(period.getMonths());
        int days = Math.abs(period.getDays());
        System.out.println("years: " + years + " months: " + months + " days: " + days);
    }
}
