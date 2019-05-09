
public class Main {

    public static void main(String[] args) {
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }

    // Add 100 suitcases into container. Each suitcase has one brick
    public static void addSuitcasesFullOfBricks(Container container) {
        for (int weight = 1 ; weight <= 100; weight++) {
            Thing brick = new Thing("Brick", weight);

            Suitcase suitcase = new Suitcase(weight);
        	suitcase.addThing(brick);

        	container.addSuitcase(suitcase);
        }
    }
}