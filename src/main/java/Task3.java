import java.util.Scanner;

public class Task3 {

    // Napisać program, który oblicza wartość współczynnika BMI (ang. body mass
    //index) wg. wzoru: waga
    //wzrost2 . Jeżeli wynik jest w przedziale (18,5 - 24,9) to wypisuje
    //”waga prawidłowa”, jeżeli poniżej to ”niedowaga”, jeżeli powyżej ”nadwaga”.

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    double waga = 0.0;
    double wzrost = 0.0;
    double bmi = 0.0;

        System.out.print("Podaj swoją wage w kg: ");
    waga =input.nextInt();

        System.out.print("Podaj swój wzrost w cm: ");
    wzrost =input.nextInt();

    wzrost =wzrost/100;

    bmi =(waga)/(Math.pow(wzrost,2));

    bmi =Math.round(bmi*100)/100.0;

        System.out.println("Twoje BMI wynosi: "+bmi);


        System.out.println("---------------------");
        System.out.println("BMI wartości:");
        System.out.println("Niedowaga: Poniżej 18.5");
        System.out.println("Norma: 18.5-24.9 ");
        System.out.println("Nadwaga: 25-29.9");
        System.out.println("Otyłość: 30 lub więcej");
    }

}