import java.util.Scanner;

public class Task12 {

    //Napisać program, który wczytuje od użytkownika ciąg znaków,
    //a następnie wyświetla informację o tym ile razy w tym ciągu powtarza się jego ostatni znak.
    //Przykład, dla ciągu „Abrakadabra” program powinien wyświetlić 4, ponieważ
    //ostatnim znakiem jest literka „a”, która występuje w podanym ciągu łącznie 4
    //razy

    private static Scanner sc = new Scanner(System.in);



    public static void main(String[] args) {
        System.out.println("Podaj słowo ");
        String word = "masło ";
        String word2 = word.toLowerCase().trim();

        char letter = word2.charAt(word2.length()-1);
        System.out.println(signs(word2, letter));
    }

    public static int signs(String word, char letter){
        int numberOfLetters = 0;
        char lastLetter;

        for (int i = 0; i < word.length(); i++) {
            lastLetter = word.charAt(i);

            if (lastLetter == letter);
            numberOfLetters++;
        }

        return numberOfLetters;
    }
}
