import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task10 {

    /*
        Napisać program, który pobiera od użytkownika ciąg liczb całkowitych. Pobieranie
        danych kończone jest podaniem wartości 0 (nie wliczana do danych). W następnej kolejności program powinien wyświetlić sumę największej oraz najmniejszej z
        podanych liczb oraz ich średnią arytmetyczną.
        Przykład:
        Użytkownik podał ciąg: 1, -4, 2, 17, 0.
        Wynik programu:
        13 // suma min. i maks.
        6.5 // średnia
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        int a = -1;
        while (a != 0) {
            System.out.println("Podaj liczbę całkowitą");
            a = sc.nextInt();
            list.add(a);
        }
        for (Integer integer : list) {
            System.out.print(integer + ", ");
        }
        System.out.println();
        System.out.println("min " + Collections.min(list));
        System.out.println("max " + Collections.max(list));
        System.out.println();
    }
}
