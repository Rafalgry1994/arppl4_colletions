package pl.sda.arp4.collections.daty;

//5. Napisz program “AutostradaBursztynowa” do naliczania opłat za przejazd pojazdów.
//        Stwórz klasę Pojazd, dodaj do niej:
//        pole identyfikujące jednoznacznie pojazd
//        String nrRejestracyjny
//        pola które będą potrzebne do obliczenia czasu przejazdu
//        LocalDateTime czasWjazdu;
//        LocalDateTime czasWyjazdu;
//        pole określające rodzaj pojazdu, na podstawie tego pola będziemy naliczali inną opłatę dla pojazdów osobowych,
//        ciężarowych i jednośladów
//        Stworzyć enum
//        RodzajPojazdu
//        OSOBOWY - cena 3.2
//        CIEZAROWY - cena 5.9
//        JEDNOSLAD - cena 1.1
//        Stwórz klasę Main i w niej użytkownik wprowadza wszystkie dane pojazdu. Po ich podaniu wypisz użytkownikowi informację:
//        “Zarejestrowano wjazd”
//        Po tym odczytaj od użytkownika linię tekstu lub słowo. Jeśli użytkownik wpisze: “wyjazd” to program powinien obliczyć ile
//        czasu minęło od momentu zarejestrowania wjazdu do momentu wpisania “wyjazd” i obliczyć opłatę.
//        Wypisz wynik obliczenia.

import pl.sda.arp4.collections.zadanie2.RodzajPojazdu;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class datyzadanie5 {
    private String nrRejestracyjny;
    private RodzajPojazdu rodzajPojazdu;
    private LocalDateTime czasWjazdu;
    private LocalDateTime czasWyjazdu;


    public datyzadanie5(String nrRejestracyjny, RodzajPojazdu rodzajPojazdu) {
        this.nrRejestracyjny = nrRejestracyjny;
        this.rodzajPojazdu = rodzajPojazdu;

        this.czasWjazdu = LocalDateTime.now();
        System.out.println("Pojazd" + nrRejestracyjny + "wjechał na autostrade o :" + czasWjazdu);
    }

    public void setCzasWyjazdu(LocalDateTime czasWyjazdu) {
        this.czasWyjazdu = czasWyjazdu;
    }

    public Duration obliczCzasPrzejazdu() {
        Duration czasPrzejazdu = Duration.between(czasWjazdu, czasWyjazdu);
        return  czasPrzejazdu;
    }

    public RodzajPojazdu getRodzajPojazdu() {
        return rodzajPojazdu;
    }

    @Override
    public String toString() {
        return "Pojazd{" +
                "nrRejestracyjny='" + nrRejestracyjny + '\'' +
                ", rodzajPojazdu=" + rodzajPojazdu +
                ", czasWjazdu=" + czasWjazdu +
                ", czasWyjazdu=" + czasWyjazdu +
                '}';
    }
}

