package pl.sda.arp4.collections.zadania;

//Zadanie generator:
//1. Wygeneruj 100 liczb z zakresu 0-50 i wypisz je na ekran.
//2. Wygeneruj 100 liczb z zakresu 100-1000 i wypisz je na ekran w jednej linii oddzielone spajcą.
//3. Wygeneruj 1000 liczb z zakresu -200 do 5000, wypisz je w jednej linii na ekran.
//4. Wygeneruj 10 liczb z zakresu 0-10 wypisz je na ekran i sprawdź jak często pojawia się tam liczba 5.
//5. Wygeneruj 20 liczb z zakresu 1-5 i wypisz je na ekran, zlicz ilość wystąpień liczby 2 i 4.

import java.util.Arrays;
import java.util.Random;

public class Zadania2 {
    public static void main(String[] args) {

        int[] tablica = new int[100];

        for (int i = 0; i < tablica.length; i++) {
            int wylosowanaliczba = new Random().nextInt(901) +100;
            tablica[i] = wylosowanaliczba;
        }
        //b
        for (int i = 0; i < tablica.length; i++) {
            System.out.println(tablica[i]);
        }

        //System.out.println(Arrays.toString(tablica1) + " ");


    }
}
