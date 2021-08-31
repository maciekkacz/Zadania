import java.util.Scanner;

public class Task5 {

    // W sklepie ze sprzętem AGD oferowana jest sprzedaż ratalna. Napisz program
    //umożliwiający wyliczenie wysokości miesięcznej raty za zakupiony sprzęt. Danymi
    //wejściowymi dla programu są:
    //• cena towaru (od 100 zł do 10 tyś. zł),
    //• liczba rat (od 6 do 48).
    //Kredyt jest oprocentowany w zależności od liczby rat:
    //• od 6–12 wynosi 2.5% ,
    //• od 13–24 wynosi 5%,
    //• od 25–48 wynosi 10%.
    //Obliczona miesięczna rata powinna zawierać również odsetki. Program powinien
    //sprawdzać, czy podane dane mieszczą się w określonych powyżej zakresach, a w
    //przypadku błędu pytać prosić użytkownika ponownie o podanie danych.

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the amount: ");
        double sum;
        sum = sc.nextDouble();
        if(sum<100 || sum>10000){
            System.out.println("Incorrect data!");
            System.out.println("The bank grants loans from PLN 100 to PLN 10,000");
        }
        System.out.print("Enter the number of installments: ");
        int installment;
        installment = sc.nextInt();
        if(installment<6 || installment>48){
            System.out.println("Incorrect data!");
            System.out.println("The bank spreads from 6 to 48 installments");
        }
        if (installment>=6 && installment<=12){
            double interest = sum+ (sum * 0.025);
            System.out.println("The installment cost is: " +interest);
        }
        else if(installment>=13 && installment <=24){
            double interest1 = sum+(sum * 0.05);
            System.out.println("The installment cost is: " +interest1);
        }
        else if(installment>=25 && installment<=48){
            double interest2 = sum+ (sum * 0.10);
            System.out.println("The installment cost is: " +interest2);
        }
        else{
            System.out.println("Correct the data!");
        }
    }

}
