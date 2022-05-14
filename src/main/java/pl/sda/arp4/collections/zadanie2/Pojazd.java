package pl.sda.arp4.collections.zadanie2;

import java.time.Duration;
import java.time.LocalDateTime;

public class Pojazd {
    private String numerRejestracyjny;
    private RodzajPojazdu rodzajPojazdu;


    public Pojazd(String numerRejestracyjny, RodzajPojazdu rodzajPojazdu) {
        this.numerRejestracyjny = numerRejestracyjny;
        this.rodzajPojazdu = rodzajPojazdu;

    }

    public void setCzasWyjazdu(LocalDateTime czasWyjazdu) {
    }

    public Duration obliczCzasPrzejazdu() {

        return null;
    }
}

