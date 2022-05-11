package pl.sda.arp4.collections.kalkulator;

import java.util.Scanner;

public class Main {
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

        wynik = 0;
        boolean jestWynik = false;
        switch (dzialanie) {
            case "dodaj":
                wynik = kalkulator.dodaj(liczbaPierwsza, liczbaDruga);
                System.out.println("Wynik =" + wynik);

            case "odejmij":
                wynik = kalkulator.odejmij(liczbaPierwsza, liczbaDruga);
                System.out.println("Wynik = " + wynik);
            case "pomnóż":
                wynik = kalkulator.pomnóż(liczbaPierwsza, liczbaDruga);
                System.out.println("Wynik = " + wynik);
            case "podziel":
                try {  // try - blok kodu w którym może wystąpić błąd
                    wynik = kalkulator.podziel(liczbaPierwsza, liczbaDruga);
                    System.out.println("Wynik = " + wynik);
                } catch (ArithmeticException nazwaZmiennejWyjatku) {
                    // catch - blok który wywoła się tylko jesli wystąpi
                    // błąd i go złapiemy
                    System.out.println("Nie można dzielić przez zero");
                    jestWynik = false;
                }
            default:
                System.out.println("Niepoprawna komenda!");
                jestWynik = false;
        }
        if (jestWynik);{
            System.out.println("Wynik = " + wynik);
        }
    }
}
