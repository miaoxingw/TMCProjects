import java.util.Scanner;

public class TextUserInterface {
    private Scanner reader;
    private Dictionary dict;

    public TextUserInterface(Scanner reader, Dictionary dict) {
        this.reader = reader;
        this.dict = dict;
    }

    public void start() {
        printHelp();

        while (true) {
            System.out.print("Statement: ");
            String input = reader.nextLine();

            if (input.equals("quit")) {
                break;
            }

            handleStatement(input);
            System.out.println();
        }

        System.out.println("Cheers!");
    }

    private void handleStatement(String statement) {
        if (statement.equals("add")) {
            add();
        } else if (statement.equals("translate")) {
            translate();
        } else {
            System.out.println("Unknown statement");
        }
    }

    private void add() {
        System.out.print("In Finnish: ");
        String word = reader.nextLine();

        System.out.print("Translation: ");
        String translation = reader.nextLine();

        dict.add(word, translation);
    }

    private void translate() {
        System.out.print("Give a word: ");
        String word = reader.nextLine();

        if (dict.translate(word) == null) {
            System.out.println("Unknown word");
        } else {
            System.out.println("Translation: " + dict.translate(word));
        }
    }

    private void printHelp() {
        System.out.println("Statements:");
        System.out.println("  add - adds a word pair to the dict");
        System.out.println("  translate - asks a word and prints its translation");
        System.out.println("  quit - quits the text user interface");
        System.out.println();
    }
}
