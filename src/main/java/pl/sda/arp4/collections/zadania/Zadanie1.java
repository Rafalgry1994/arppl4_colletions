package pl.sda.arp4.collections.zadania;

//Zadanie 1:
       // Napisz aplikację w której zadeklaruj tablicę 10 elementów a następnie:
       //  a) wypełnij je losowymi wartościami z przedziału -10 - 10
        // b) wypisz na ekranie zawartość tablicy


import java.util.Random;

public class Zadanie1 {
    public static void main(String[] args) {
        int[] tablica = new int[10];
        //a

        for (int i = 0; i < tablica.length; i++) {
            //new Random().nextInt(21)     -losuje od 0 do 21 (bez 21)
            //new Random().nextInt(21)-10  -losuje od 0 do 21 (bez 21) odejmując przesuwany przedział -10 do 11
        int wylosowanaliczba = new Random().nextInt(21) - 10;

        tablica[i] = wylosowanaliczba;
        }
        //b
        for (int i = 0; i < tablica.length; i++) {
            System.out.println(tablica[i] + " ");
        }
    }
}
