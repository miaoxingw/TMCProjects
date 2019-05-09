import java.util.Scanner;
import java.util.ArrayList;

public class Smileys {

    public static void main(String[] args) {
        printWithSmileys("\\:D/");
        printWithSmileys("87.");
        printWithSmileys("Method");
        printWithSmileys("Beerbottle");
        printWithSmileys("Interface");
    }

    private static void printWithSmileys(String characterString) {
        String middleString = createTheStringInTheMiddle(characterString);
        int number = middleString.length() / 2 + 2;

        printSmiley(number);
        System.out.println(":)" + middleString + ":)");
        printSmiley(number);

        System.out.println();
    }

    private static String createTheStringInTheMiddle(String characterString) {
        String returnCharacterString = " " + characterString + " ";

        if (characterString.length() % 2 == 1) {
            return returnCharacterString + " ";
        }

        return returnCharacterString;

    }

    private static void printSmiley(int times) {
        for (int i = 0; i < times; i++) {
            System.out.print(":)");
        }

        System.out.println();
    }
}