import java.util.Scanner;

public class Task9 {

    /*
     Napisać program, który wczytuje liczby podawane przez użytkownika dotąd, dopóki nie podana zostanie liczba 0.
      Następnie wyświetlić sumę wszystkich podanych liczb.
    */

    public static void main(String[] args) {
        Scanner wejscie = new Scanner(System.in);
        int a = -1;
        int suma = 0;
        while (a != 0) {
            System.out.println("Podaj liczbę całkowitą");
            a = wejscie.nextInt();
            suma += a;
        }
        System.out.println("Suma liczb wynosi: "+suma);
        System.out.println("koniec");
    }
}
