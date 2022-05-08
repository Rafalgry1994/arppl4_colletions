package pl.sda.arp4.collections.zadania;

//Zadanie 2:
//        Napisz aplikację w której zadeklaruj tablicę 10 elementów a następnie:
//       a) wypełnij je w pętli wartościami wpisanymi ze scannera
//       b) wypisz na ekranie zawartość tablicy
//       c) wypisz sumę elementów w tablicy
//       d) szukanie minimum
//       e. znajdź i wypisz największy element tablicy
//       f. znajdź i wypisz numer komórki największego elementu w tablicy
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainTablica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tablica = new int[10];

        //a
        for (int i = 0; i < tablica.length; i++) {
            System.out.print("Podaj " + (i + 1) + " liczbę:");
            int wpisanaliczba = scanner.nextInt();

            tablica[i] = wpisanaliczba;
        }
        //b
        for (int i = 0; i < tablica.length; i++) {
            System.out.print(tablica[i] + " ");
            //c
        }
        int suma = 0;
        for (int i = 0; i < tablica.length; i++) {
            // tablica[i] to wartość (liczba) w komórce
            suma = suma + tablica[i];

        }
        System.out.println("Suma: " + suma);

        // d
        int minimum = tablica[0];
        for (int i = 0; i < tablica.length; i++) {
            if (minimum > tablica[i]) {
                //jeśli obecne minimum jest wieksze niż element tablicy
                //to znaczy ze musimy nadpisać minimum
                //znależliśmy mniejszy element
                minimum = tablica[i];
            }
        }
        System.out.println("Minimum: " + minimum);
        //       e. znajdź i wypisz największy element tablicy
        int maksimum = tablica[0];
        for (int i = 1; i < tablica.length; i++) {
            // jeśli obecne maksimum jest mniejsze niż element tablicy
            if (maksimum < tablica[i]) {
                // musimy nadpisać maksimum element tablicy
                maksimum = tablica[i];

            }


        }
        //       f. znajdź i wypisz numer komórki największego elementu w tablicy
        int indeksMaksimum = 0;
        int szukanieMaksimum = tablica[0];
        for (int i = 1; i < tablica.length; i++) {
            if (szukanieMaksimum < tablica[i]) {
                szukanieMaksimum = tablica[i];
                indeksMaksimum = i;

            }

        }
        System.out.println("Maksimum o wartości: " + szukanieMaksimum + " znalezione w komórce: " + indeksMaksimum);

        // g średnia arytmetyczna
        double zmiennaŚrednia = ((double)suma) / tablica.length;
        System.out.println("Średnia: " + zmiennaŚrednia);

        // h wypisz ilość elementów większych/mniejszych od średniej
        System.out.print("Elementy większe od średniej: ");
        int licznikWiekszychElementów = 0;
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] > zmiennaŚrednia) {
                System.out.print(tablica[i] + " ");
                licznikWiekszychElementów = licznikWiekszychElementów + 1;
            }

        }
        System.out.println("Licznik większych elementóe: " + licznikWiekszychElementów);

        // i. wypisz tablice w odwrotnej kolejności
        for (int i = tablica.length - 1; i >= 0; i--) {
            System.out.print(tablica[i] + " ");
        }

        // sortowanie tablicy
        Arrays.sort(tablica);
        System.out.println();
        System.out.println(Arrays.toString(tablica));  //UPROSZCZENIE

        //j wypisanie mediany (śreodkowa wartość tablicy)
        // czyli długość/2
        double mediana;
        if (tablica.length % 2 == 0) {
            int indeksŚrodkowyElement = tablica.length / 2;
            int wartosc1 = tablica[indeksŚrodkowyElement];
            int wartosc2 = tablica[indeksŚrodkowyElement - 1];
            mediana = (wartosc1 + wartosc2)  / 2.0;
        } else  {
            int indeksŚrodkowyElement = tablica.length / 2;
            mediana = tablica[indeksŚrodkowyElement];


        }
        System.out.println("Mediana: " + mediana);
    }
}