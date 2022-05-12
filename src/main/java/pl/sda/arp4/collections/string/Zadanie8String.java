package pl.sda.arp4.collections.string;

//8. Napisz aplikację która przyjmuje od użytkownika tekst, a następnie dzieli go na poszczególne słowa.
// Następnie aplikacja zlicza ilości wystąpień słów. Np. dla tekstu ala lubi koty, ale ala nie jest przez koty lubiana
//	ala - 2
//	lubi - 1
//	koty - 2
//	ale - 1
//	nie - 1
//	jest - 1
//	przez - 1
//	lubiana - 1



public class Zadanie8String {
    public static void main(String[] args) {
        //substring & indofx
        String tekst = "ala ma kota";

        // split podzieli zdanie na poszczególne słowa
        String[] slowa = tekst.split(" ");

        // "ala" "lubi" "koty,"

        // podmienianie znaku (replace / replaceAll)
        String kotyPrzecinek = "koty,";
        String wynikKotyBezPrzecinka = kotyPrzecinek.replaceAll(",", "");
    }
}

