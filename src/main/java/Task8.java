import java.util.Scanner;

public class Task8 {

    /*
        Napisać program, który wczytuje od użytkownika liczbę całkowitą dodatnią n, a następnie wyświetla
        na ekranie wszystkie potęgi liczby 2 nie większe, niż podana liczba.
        Przykładowo, dla liczby 71 program powinien wyświetlić: 1 2 4 8 16 32 64
    */

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer higher than 0: ");
        int n = sc.nextInt();
        while (n <= 0){
            System.out.println("You must enter an integer higher than 0. Try again.");
            n = sc.nextInt();
        }

        int power = 1;
        while (power * 2 <= n){
            System.out.println(power *= 2);

        }
    }
}
