package pl.sda.arp4.collections.string;

//1.Zadeklaruj zmienną tekstową text i przypisz do niej jakąś wartość .
//sprawdź czy w tekście występuje słowo “ania” - contains
//sprawdź czy tekst zaczyna się od słowa “ania” - startsWith
//sprawdź czy tekst kończy się słowem “ania” - endsWith
//sprawdź czy tekst równa się słowu “ania” - equals
//sprawdź czy tekst (niezależnie od wielkości liter) zawiera słowo “ania” - toLowerCase + contains
//zwróć indeks (numer znaku/litery) pierwszego wystąpienia słowa “ania” w tekście - indexOf


import java.util.Locale;
import java.util.Scanner;
import java.util.SortedMap;

public class MainZadanie1String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz linie tekstu");
        String tekst = scanner.nextLine();

        if (tekst.contains("ania")) {
            System.out.println("contains: tekst zawiera słowo");
        }else{
            System.out.println("contains: " + tekst.contains("ania"));

        }
        System.out.println("startsWith " + tekst.startsWith("ania"));
        System.out.println("endsWith "+ tekst.endsWith("ania"));
        System.out.println("equals " + tekst.equals("ania"));
        System.out.println("equals "+ tekst.toLowerCase().contains("ania"));
        System.out.println("indexOf: " + tekst.indexOf("ania"));
    }
}