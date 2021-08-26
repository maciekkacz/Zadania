import java.util.*;

/*Wczytać od użytkownika 3 liczby całkowite i wypisać na ekran największą oraz
        najmniejszą z nich.*/

public class Task2 {

    private static Scanner scanner = new Scanner(System.in);
    private static int threeUserNumbers = 3;

    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < threeUserNumbers; i++) {
            System.out.println("Podaj liczbę");
            int userNumbers = scanner.nextInt();
            list.add(userNumbers);
        }


        Integer max = Collections.max(list);
        System.out.println("Najwyższa liczba to " + max);

        Integer min = Collections.min(list);
        System.out.println("Najnizsza liczba to " + min);



    }
}
