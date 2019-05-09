public class Flight {
    private Airplane plane;
    private String departureAirport;
    private String destinationAirport;

    public Flight(Airplane plane, String departureAirport, String destinationAirport) {
        this.plane = plane;
        this.departureAirport = departureAirport;
        this.destinationAirport = destinationAirport;
    }

    public String toString() {
        return plane.toString() + " (" + departureAirport + "-" + destinationAirport + ")";
    }
}
