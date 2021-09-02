import java.util.Scanner;

public class Task7 {

    //Napisać program, który pobiera od użytkownika liczbę całkowitą dodatnią, a następnie wyświetla na ekranie kolejno wszystkie liczby niepatrzyste nie większe od
    //podanej liczby. Przykład, dla 15 program powinien wyświetlić 1, 3, 5, 7, 9, 11, 13,
    //15.

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("give me a number");
        int number = sc.nextInt();
        int start = 0;
        while ((start++) < number) {
            if (start % 2 != 0) {
                System.out.println(start);
            }
        }
    }
}
