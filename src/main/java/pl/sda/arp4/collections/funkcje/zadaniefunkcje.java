package pl.sda.arp4.collections.funkcje;

public class zadaniefunkcje {
    public static void main(String[] args) {
        int[] tablica = new int[]{1, 2, 3, 4, 5};
        //                        0  1  2  3  4

        // rozwiązanie które nie wymaga przypisania zmiennej
//        System.out.println(sumujElementy(tablica));

        int sumaMain = sumujElementy(tablica);
        System.out.println("Suma: " + sumaMain);

        int znalezioneMinimum = znajdzMinimum(tablica);
        System.out.println("Minimum:" + znalezioneMinimum);

        System.out.println(dodajDwieLiczby(5 ,  10)); // 15
        System.out.println(dodajDwieLiczby(20, -10)); // 10
        System.out.println(dodajDwieLiczby(2 , -10)); // -8

        int maksimum = znajdzMaksimum(tablica);
        System.out.println("Maksimum: " + maksimum);

        int indeksMax = znajdzIndeksMaksimum(tablica);
        System.out.println("Indeks maksimum: " + indeksMax);

        double srednia = obliczSrednia(tablica);
        System.out.println("Srednia: " + srednia);

        int ilosc = iloscElemenetowWiekszychOdSredniej(tablica);
        System.out.println("Ilosc elementów wiekszych: " + ilosc);

        wypiszOdKonca(tablica);
    }

    private static void wypiszOdKonca(int[] tablica) {
        // i. wypisz tablicę w odwrotnej kolejności
        // jeśli length = 10 to ostatnia komórka ma numer 9
        // jeśli length = 5 to ostatnia komórka ma numer 4
        // numery komórek które mają się wypisać: 4 3 2 1 0
        for (int i = tablica.length - 1; i >= 0; i--) {
            System.out.print(tablica[i] + " ");
        }
    }

    private static int iloscElemenetowWiekszychOdSredniej(int[] tablica) {
        double zmiennaSrednia = obliczSrednia(tablica);

        int licznikWiekszychElementow = 0;
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] > zmiennaSrednia) { // tylko dla elementów większych od średniej
                System.out.print(tablica[i] + " ");
                licznikWiekszychElementow = licznikWiekszychElementow + 1;
            }
        }
        return licznikWiekszychElementow;
    }

    private static double obliczSrednia(int[] tablica) {
        double suma = sumujElementy(tablica);
        double srednia = suma / tablica.length;
        return srednia;
    }

    private static int znajdzIndeksMaksimum(int[] tablica) {
        // f. znajdź i wypisz numer komórki największego elementu w tablicy
        int indeksMaksimum = 0;
        int szukaneMaksimum = tablica[0];
        for (int i = 1; i < tablica.length; i++) {
            if (szukaneMaksimum < tablica[i]) {
                szukaneMaksimum = tablica[i];
                indeksMaksimum = i;
            }
        }
        return indeksMaksimum;
    }

    private static int znajdzMaksimum(int[] tablica) {
        // e. znajdź i wypisz największy element tablicy
        int maksimum = tablica[0];
        for (int i = 1; i < tablica.length; i++) {
            // jeśli obecne maksimum jest mniejsze niż element tablicy
            if (maksimum < tablica[i]) {
                // musimy nadpisać maksimum elementem tablicy
                maksimum = tablica[i];
            }
        }
        return maksimum;
    }

    private static int dodajDwieLiczby(int a, int b) {
        return a + b;
    }


    private static int znajdzMinimum(int[] tablica) {
        // d. szukanie minimum
        int minimum = tablica[0];
        for (int i = 1; i < tablica.length; i++) {
            // jeśli obecne minimum jest większe niż element tablicy
            if (minimum > tablica[i]) {
                // to znaczy że musimy nadpisać minimum
                // znaleźliśmy mniejszy element
                minimum = tablica[i];
            }
        }
        return minimum;
    }

    private static int sumujElementy(int[] tablica) {
        // c.
        int suma = 0;
        for (int i = 0; i < tablica.length; i++) {
            // tablica[i] to wartość (liczba) w komórce
            suma = suma + tablica[i];
        }
        // zwracamy wynik, wynikiem jest wartość
        return suma;
    }
}


