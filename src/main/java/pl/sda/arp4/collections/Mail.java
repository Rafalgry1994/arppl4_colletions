package pl.sda.arp4.collections;

import java.util.Scanner;

public class Mail {
    public static void main(String[] args) {
        // wypisanie wszystkich dostępnych opcji ENUM
        for (RodzajPojazdu rodzaj : RodzajPojazdu.values()) {
            System.out.println(rodzaj);
        }
        Scanner scanner = new Scanner(System.in);
        // użytkownik wpisuje coś do scannera
        //a w wyniku chce otrzymać zmienną typu RodzajPojazdu
        RodzajPojazdu zmienna = null;
        boolean czyUstawiona = false;
        while (!czyUstawiona) {
            System.out.println("Podaj rodzaj pojazdu");
            String rodzajString = scanner.next();

                try {
                    zmienna = RodzajPojazdu.valueOf(rodzajString.toUpperCase());
                    czyUstawiona = true;
                    System.out.println(zmienna);
                }catch (IllegalArgumentException iae) {
                    System.out.println("Wybrana opcja nie istnieje");
                }
        }
    }
}
