package pl.sda.arp4.collections.zadanie2;

import pl.sda.arp4.collections.daty.ZadanieAutostradaBursztynowa;

public enum RodzajPojazdu {
    OSOBOWY,
    CIEZAROWY,
    JEDNOSLAD;

    private ZadanieAutostradaBursztynowa rodzajPojazdu;

    public ZadanieAutostradaBursztynowa getRodzajPojazdu() {
        return rodzajPojazdu;
    }

    public void setRodzajPojazdu(ZadanieAutostradaBursztynowa rodzajPojazdu) {
        this.rodzajPojazdu = rodzajPojazdu;
    }
}
