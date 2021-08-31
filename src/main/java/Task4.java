import java.util.Scanner;

public class Task4 {

    //Napisać program obliczający należny podatek dochodowy od osób fizycznych. Program ma pobierać od użytkownika
    //dochód i po obliczeniu wypisywać na ekranie
    //należny podatek. Podatek obliczany jest wg. następujących reguł:
    //• do 85.528 podatek wynosi 18% podstawy minus 556,02 PLN,
    //• od 85.528 podatek wynosi 14.839,02 zł + 32% nadwyżki ponad 85.528,00

    private static int taxLimit = 85528;
    private static double taxBase = 556.02;
    private static double taxBaseTwo = 14839.02;

    private static int eighteenPercent = 18;
    private static int thirtyTwoPercent = 32;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Podaj zarobki roczne");
        double wage = sc.nextDouble();
        System.out.println(calculator(wage));
        
    }

    public static double calculator(double wage) {
        double tax = 0;
        if (wage < taxLimit) {
            tax = (wage - taxBase)*((100 - eighteenPercent)*0.01);
        }
        else
            tax = (wage - taxBaseTwo) * ((100 - thirtyTwoPercent)*0.01);
        return tax;
    }
}
