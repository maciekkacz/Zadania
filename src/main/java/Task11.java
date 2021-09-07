public class Task11 {
    //7. Napisać program działający w trybie konsolowym (tekstowym) i rysujący na ekranie prostokąt.
    //Użytkownik podaje znak wypełnienia prostokąta,
    //>
    //>
    //> _____xxxxxx
    //> _____xxxxxx
    //> _____xxxxxx
    //> _____xxxxxx
    //ozn.
    //> - nowa linia,
    //_ - znak spacji.
    public static void main(String[] args) {
        draw(10);

    }

    public static void draw(int size) {
        for (int i = 0; i < size; i++) {
            drawSpaces(size);
            drawStars(size);
            System.out.println();
        }
    }

    private static void drawStars(int stars) {
        for (int i = 0; i < stars; i++) {
            System.out.print("x");
        }
    }

    private static void drawSpaces(int spaces) {
        for (int i = 0; i < spaces; i++) {
            System.out.print( " " );
        }
    }
}