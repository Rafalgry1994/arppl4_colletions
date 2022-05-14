package pl.sda.arp4.collections.daty;

import pl.sda.arp4.collections.zadanie2.Pojazd;
import pl.sda.arp4.collections.zadanie2.RodzajPojazdu;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Scanner;

public class ZadanieAutostrada {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj numer rejestracyjny:");
        String numerRejestracyjny = scanner.nextLine();

        RodzajPojazdu rodzajPojazdu = null;
        do {
            System.out.println("Podaj rodzaj pojazdu:");
            String rodzajPojazduText = scanner.nextLine();

            try {
                rodzajPojazdu = RodzajPojazdu.valueOf(rodzajPojazduText.toUpperCase());
            } catch (IllegalArgumentException iae) {
                System.out.println("Wprowadzono niepoprawny rodzaj pojazdu!");
            }
        } while (rodzajPojazdu == null);

        LocalDateTime teraz = LocalDateTime.now();
        Pojazd pojazd = new Pojazd(numerRejestracyjny, rodzajPojazdu);

        String wpisaneSlowo;
        do{
            System.out.println("Wpisz wyjazd aby opuścić autostrade:");
            wpisaneSlowo = scanner.nextLine();

        }while (!wpisaneSlowo.equals("wyjazd"));


        LocalDateTime czasWyjazdu = LocalDateTime.now();
        pojazd.setCzasWyjazdu(czasWyjazdu);

        Duration czasPrzejazdu = pojazd.obliczCzasPrzejazdu();

        double kwotaDoZapłaty = (czasPrzejazdu.getSeconds()/60.0) * rodzajPojazdu.getRodzajPojazdu().getCena();
        System.out.println("Kwota do zapłaty to:" + kwotaDoZapłaty + "czas spędzony na autostradzie to:" + czasPrzejazdu.getSeconds());
    }
}


