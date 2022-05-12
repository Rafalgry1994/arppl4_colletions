package pl.sda.arp4.collections.string;

import java.util.Scanner;

//2. Zmodyfikuj zadanie i pozwól aplikacji czytać zmienną z wejścia posługując się Scannerem.

public class Zadanie2String {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj linię tekstu");
        String tekst = scanner.next();

        System.out.println("Podaj searched");
        String searched = scanner.next();

        System.out.println("Znaleziono: " + tekst.contains(searched));
    }


}
