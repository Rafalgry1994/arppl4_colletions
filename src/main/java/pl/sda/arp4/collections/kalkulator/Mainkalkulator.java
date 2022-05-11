package pl.sda.arp4.collections.kalkulator;

import java.util.Scanner;

public class Mainkalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kalkulator kalkulator = new Kalkulator();
        int wynik;
        System.out.println("Podaj liczbe pierwsza");
        int liczbaPierwsza = scanner.nextInt();
        System.out.println("Podaj liczbe druga");
        int liczbaDruga = scanner.nextInt();

        System.out.println("Podaj działanie matematyczne dodaj/odejmij/pomnóż/podziel):");
        String dzialanie = scanner.next();
        if ("dodaj".equals(dzialanie)) {
            wynik = kalkulator.dodaj(liczbaPierwsza, liczbaDruga);
            System.out.println("Wynik =" + wynik);


            wynik = kalkulator.odejmij(liczbaPierwsza, liczbaDruga);
            System.out.println("Wynik = " + wynik);

            wynik = kalkulator.pomnóż(liczbaPierwsza, liczbaDruga);
            System.out.println("Wynik = " + wynik);

            try {  // try - blok kodu w którym może wystąpić błąd
                wynik = kalkulator.podziel(liczbaPierwsza, liczbaDruga);
                System.out.println("Wynik = " + wynik);
            } catch (ArithmeticException nazwaZmiennejWyjatku) {
                // catch - blok który wywoła się tylko jesli wystąpi
                // błąd i go złapiemy
                System.out.println("Nie można dzielić przez zero");
            }
        } else if ("odejmij".equals(dzialanie)) {
            wynik = kalkulator.odejmij(liczbaPierwsza, liczbaDruga);
            System.out.println("Wynik = " + wynik);

            wynik = kalkulator.pomnóż(liczbaPierwsza, liczbaDruga);
            System.out.println("Wynik = " + wynik);

            try {  // try - blok kodu w którym może wystąpić błąd
                wynik = kalkulator.podziel(liczbaPierwsza, liczbaDruga);
                System.out.println("Wynik = " + wynik);
            } catch (ArithmeticException nazwaZmiennejWyjatku) {
                // catch - blok który wywoła się tylko jesli wystąpi
                // błąd i go złapiemy
                System.out.println("Nie można dzielić przez zero");
            }
        } else if ("pomnóż".equals(dzialanie)) {
            wynik = kalkulator.pomnóż(liczbaPierwsza, liczbaDruga);
            System.out.println("Wynik = " + wynik);

            try {  // try - blok kodu w którym może wystąpić błąd
                wynik = kalkulator.podziel(liczbaPierwsza, liczbaDruga);
                System.out.println("Wynik = " + wynik);
            } catch (ArithmeticException nazwaZmiennejWyjatku) {
                // catch - blok który wywoła się tylko jesli wystąpi
                // błąd i go złapiemy
                System.out.println("Nie można dzielić przez zero");
            }
        } else if ("podziel".equals(dzialanie)) {
            try {  // try - blok kodu w którym może wystąpić błąd
                wynik = kalkulator.podziel(liczbaPierwsza, liczbaDruga);
                System.out.println("Wynik = " + wynik);
            } catch (ArithmeticException nazwaZmiennejWyjatku) {
                // catch - blok który wywoła się tylko jesli wystąpi
                // błąd i go złapiemy
                System.out.println("Nie można dzielić przez zero");
            }
        }
        System.out.println("Niepoprawna komenda!");
    }
}


