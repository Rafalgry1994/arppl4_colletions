package pl.sda.arp4.collections.daty;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

/**Stwórz aplikację która w pętli przyjmuje polecenie:
//        - wpisanie ‘date’ wypisuje obecny LocalDate
//        - wpisanie ‘time’ wypisuje obecny LocalTime
//        - wpisanie ‘datetime’ wypisuje obecny LocalDateTime
//        (W wybranym przez Ciebie formacie)
//    Jeśli użytkownik wpisze 'quit' to zakoncz program.
 */

public class datyzadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz date jeśli chcesz poznać date, wpisz time jeśli chcesz poznać czas, wpisz datetime jeśli chcesz poznać to i to");

        String wpisane = scanner.nextLine();

        if (wpisane.equals("date")) {
            LocalDate localDate = LocalDate.now();
            System.out.println(localDate);
        } else if (wpisane.equals("time")) {
            LocalTime localTime = LocalTime.now();
            System.out.println(localTime);
        } else if (wpisane.equals("datetime")) {
            LocalDateTime localDateTime = LocalDateTime.now();
            System.out.println(localDateTime);

        }
        while (!wpisane.equals("quit"));


    }
}
