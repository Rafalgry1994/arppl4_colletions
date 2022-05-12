package pl.sda.arp4.collections.Zadanie.domowe;

//Stwórz enum Bilet.:
//Rodzaje biletów:

//NORMLANY_GODZINA,  		- cena 1.70
//ULGOWY_STUDENCKI, 		- cena 0.90
//NORMALNY_CALODNIOWY. 	- cena 5.30
//ULGOWY_EMERYT,			- cena 0.30

//Stwórz aplikację w rodzaju formularza. Zapytaj użytkownika o rodzaj biletu i po wpisaniu
// odpowiedniej wartości wyświetl mu cenę. Następnie zapytaj użytkownika o ilość biletów i
// wypisz na ekran cenę podanej ilości wybranych biletów.

import pl.sda.arp4.collections.zadanie2.Bilet;

import java.util.Scanner;

public class bilet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Bilet rodzaj = null;

        do {
            System.out.print("Podaj rodzaj biletu(dostępne rodzaje):");
            for (Bilet rodzajbiletu : Bilet.values()) {
                System.out.println(rodzajbiletu + " ");
            }
            System.out.println("):");
            String wpisaneSlowo = scanner.next();
            try {
                rodzaj = Bilet.valueOf(wpisaneSlowo);
            }catch (IllegalArgumentException iae) {
                System.err.println("Nie ma takiej opcji");
            }

        }while (rodzaj == null) ;


        switch (rodzaj){
            case ULGOWY_EMERYT:
                System.out.println("Cena to: " +0.3d);
                break;
            case NORMLANY_GODZINA:
                System.out.println("Cena to: " +1.7d);
                break;
            case ULGOWY_STUDENCKI:
                System.out.println("Cena to: " +0.9d);
                break;
            case NORMALNY_CALODNIOWY:
                System.out.println("Cena to: " + 5.3d);
        }
        System.out.println("Podaj ilość biletów które chcesz kupić:");
        //int iloscBiletow = scanner.next();

        //ystem.out.println("Cena biletów to: " +(iloscBiletow*));
        }
    }
