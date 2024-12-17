import java.util.Scanner;


public class Input {

    private final Scanner in;
    private final Tournament tournament;

    public Input(Scanner in) {
        this.in = in;
        this.tournament = new Tournament();
    }

    public void start() {
        System.out.println("Kumpula ski jumping week");
        System.out.println();
        System.out.println("Write the names of the participants one at a time; " +
                "an empty string brings you to the jumping phase.");

        while (true) {
            System.out.print("  Participant name: ");
            String name = readString();

            if (name.isEmpty()) {
                // Move to the jumping phase
                break;
            }

            // Add the participant to the race
            Jumper jumper = new Jumper(name, 0);
            tournament.add(jumper);
        }

        startTournament();
    }

    // Jumping phase. Ski jumpers jump in ascending order of points.
    private void startTournament() {
        int round = 1;

        System.out.println();
        System.out.println("The tournament begins!");
        System.out.println();

        while (true) {
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            String command = readString();

            if (!"jump".equals(command)) {
                break;
            }

            System.out.println();
            System.out.println("Round " + round);
            System.out.println();

            System.out.println(tournament.toString());
            System.out.println("Results of round " + round);
            System.out.println(tournament.getRoundResults());

            round++;
        }

        System.out.println();
        System.out.println("Thanks!");
        System.out.println();

        System.out.print(tournament.getTournamentResults());
    }

    private String readString() {
        return in.next();
    }
}
