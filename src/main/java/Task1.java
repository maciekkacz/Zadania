import java.util.Scanner;

public class Task1 {

   /* Napisać program służący do konwersji wartości temperatury podanej w stopniach
    Celsjusza na stopnie w skali Fahrenheita (stopnie Fahrenheita = 1.8 * stopnie
            Celsjusza + 32.0)*/

    private static Scanner scanner = new Scanner(System.in);
    private static double Fahrenheita = 1.8;
    private static int constantValue = 32;

    public static void main(String[] args) {
        System.out.println("Podaj ilość stopni");
        double v = scanner.nextDouble();
        double v1 = conversionOfDegrees(v);
        System.out.println("Podałeś " + v + "C co w przeliczeniu daje " + v1 + " Fahrenheita "  );

    }

    private static double conversionOfDegrees(double degress){
        double result = Fahrenheita * 1.8 + degress + constantValue;
        return result;
    }
}
