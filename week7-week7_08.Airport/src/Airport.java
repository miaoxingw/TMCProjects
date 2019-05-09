import java.util.Scanner;
import java.util.HashMap;

public class Airport {
    private Scanner reader;
    private HashMap<String, Airplane> planes = new HashMap<String, Airplane>();
    private HashMap<String, Flight> flights = new HashMap<String, Flight>();

    public Airport(Scanner reader) {
        this.reader = reader;
    }

    public void start() {
        System.out.println("Airport panel");
        System.out.println("--------------------");
        System.out.println();

        while (true) {
            System.out.println("Choose operation:");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight");
            System.out.println("[x] Exit");

            System.out.print("> ");
            String input = reader.nextLine();

            if ("x".equals(input)) {
                startFlightService();
                return;
            } else if ("1".equals(input)) {
                addPlane();
            } else if ("2".equals(input)) {
                addFlight();
            }
        }
    }

    private void startFlightService() {
        System.out.println();
        System.out.println("Flight service");
        System.out.println("------------");

        while (true) {
            System.out.println();
            System.out.println("Choose operation:");
            System.out.println("[1] Print planes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print plane info");
            System.out.println("[x] Quit");

            System.out.print("> ");
            String input = reader.nextLine();

            if ("x".equals(input)) {
                return;
            } else if ("1".equals(input)) {
                printPlanes();
            } else if ("2".equals(input)) {
                printFlights();
            } else if ("3".equals(input)) {
                printPlaneInfo();
            }
        }
    }

    private void printPlanes() {
        for (Airplane plane : planes.values()) {
            System.out.println(plane.toString());
        }
    }

    private void printFlights() {
        for (Flight flight : flights.values()) {
            System.out.println(flight.toString());
        }
    }

    private void printPlaneInfo() {
        Airplane plane = getPlane();
        System.out.println(plane.toString());
    }

    private void addPlane() {
        System.out.print("Give plane ID: ");
        String planeId = reader.nextLine();

        System.out.print("Give plane capacity: ");
        int planeCapacity = Integer.parseInt(reader.nextLine());

        Airplane plane = new Airplane(planeId, planeCapacity);
        planes.put(planeId, plane);
    }

    private void addFlight() {
        Airplane plane = getPlane();

        System.out.print("Give departure airport code: ");
        String departureAirport = reader.nextLine();

        System.out.print("Give destination airport code: ");
        String destinationAirport = reader.nextLine();

        Flight flight = new Flight(plane, departureAirport, destinationAirport);
        flights.put(flight.toString(), flight);
    }

    private Airplane getPlane() {
        Airplane plane = null;

        while (plane == null) {
            System.out.print("Give plane ID: ");
            String planeId = reader.nextLine();

            plane = planes.get(planeId);

            if (plane == null) {
                System.out.println("Plane does not exist");
            }
        }
        return plane;
    }
}