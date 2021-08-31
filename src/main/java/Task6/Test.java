package Task6;

import java.util.Scanner;

public class Test implements Service {

    //Napisać program realizujący funkcje prostego kalkulatora, pozwalającego na wykonywanie operacji dodawania, odejmowania, mnożenia i dzielenia na dwóch liczbach rzeczywistych. Program ma identyfikować sytuację wprowadzenia błędnego
    //symbolu działania oraz próbę dzielenia przez zero. Zastosować instrukcję switch
    //do wykonania odpowiedniego działania w zależności od wprowadzonego symbolu
    //operacji. Scenariusz działania programu:
    //a) Program wyświetla informację o swoim przeznaczeniu.
    //b) Wczytuje pierwszą liczbę.
    //c) Wczytuje symbol operacji arytmetycznej: +, -, *, /.
    //d) Wczytuje drugą liczbę.
    //e) Wyświetla wynik lub - w razie konieczności - informację o niemożności wykonania działania.
    //f) Program kończy swoje działanie po naciśnięciu przez użytkownika klawisza
    //Enter.

    static Scanner sc = new Scanner(System.in);
    private static final String ADD = "ADD";
    private static final String SUBTRACTION = "SUBTRACTION";
    private static final String MULTIPLICATION = "MULTIPLICATION";
    private static final String DIVISION = "DIVISION";

    public static void main(String[] args) {
        Test test = new Test();
        double a = 0;
        double b = 0;
        String operation = null;
        System.out.println("Enter the first number");
        a = sc.nextInt();
        sc.nextLine();
        System.out.println("Please enter an operator ADD, SUBTRACTION, MULTIPLICATION, DIVISION");
        operation = sc.nextLine();
        System.out.println("Enter the second number");
        b = sc.nextInt();
        sc.nextLine();


        switch (operation){
            case ADD:
                test.add(a, b);
                break;
            case SUBTRACTION:
                test.subtraction(a, b);
                break;
            case MULTIPLICATION:
                test.multiplication(a, b);
                break;
            case DIVISION:
                test.division(a, b);
                break;
                default:
                    System.out.println("an invalid character was supplied");


        }
    }


    @Override
    public void add(double a, double b) {
        double sum = a + b;
        System.out.println( a + " + " + b + " = " + sum );

    }

    @Override
    public void subtraction(double a, double b) {
        double sum = a - b;
        System.out.println( a + " - " + b + " = " + sum );

    }

    @Override
    public void multiplication(double a, double b) {
        double sum = a * b;
        System.out.println( a + " * " + b + " = " + sum );

    }

    @Override
    public void division(double a, double b) {
        double sum;
        if (b == 0){
            throw new  IllegalArgumentException();
        }
        else
            sum = a / b;
        System.out.println( a + " / " + b + " = " + sum );

    }
}
