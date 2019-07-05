import java.util.Scanner;


public class Input {

    private Scanner in;

    public Input(Scanner in) {
        this.in = in;
    }

    public void start() {
        System.out.println("Kumpula ski jumping week");
        System.out.println();
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");

        while (true) {
            System.out.print("Participant name: ");
            String name = readString();

            if (name.isEmpty()) {
                // Move to the jumping phase
                break;
            }

            // Add the participant to the race
            SkiJumper jumper = new SkiJumper(name, 0);
            //skiJumpers.add();
        }

        System.out.println("The tournament begins!");
    }

    private String readString() {
        return in.nextLine();
    }
}
