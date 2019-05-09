import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Airplane haLol = new Airplane("HA-LOL", 42);
        System.out.println(haLol.toString());

        Flight helBal = new Flight(haLol, "HEL", "BAL");
        System.out.println(helBal.toString());*/

        String input =  "1\n" + "HA-LOL\n" + "42\n" +
                        "1\n" + "G-OWAC\n" + "101\n" +
                        "2\n" + "HA-LOL\n" + "HEL\n" + "BAL\n" +
                        "2\n" + "G-OWAC\n" + "JFK\n" + "BAL\n" +
                        "2\n" + "HA-LOL\n" + "BAL\n" + "HEL\n" +
                        "x\n" +
                        "1\n" + "2\n" + "3\n" + "G-OWAC\n" + "x\n";

        Scanner reader = new Scanner(System.in);
        //Scanner reader = new Scanner(input);

        Airport airport = new Airport(reader);
        airport.start();
    }
}
