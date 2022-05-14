package pl.sda.arp4.collections.daty;

import pl.sda.arp4.collections.zadanie2.RodzajPojazdu;

public enum ZadanieAutostradaBursztynowa {
    OSOBOWY(3.2),
    CIEZAROWY(5.9),
    JEDNOSLAD(1.1),
    ;
    private final double cena;
    ZadanieAutostradaBursztynowa(double cena) {

        this.cena = cena;
    }

    public double getCena() {
        return cena;
    }
}

