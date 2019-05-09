import java.util.ArrayList;

public class Suitcase {
	private ArrayList<Thing> things;
	private int maxWeight;

	public Suitcase(int maxWeight) {
		things = new ArrayList<Thing>();
		this.maxWeight = maxWeight;
	}

	public void addThing(Thing thing) {
		// Add thing to suitcase if weight within bounds
		if (thing.getWeight() + totalWeight() > maxWeight) {
			return;
		}

		things.add(thing);
	}

	public int totalWeight() {
		int weight = 0;
		for (Thing thing : things) {
			weight += thing.getWeight();
		}

		return weight;
	}

	// If more than one thing with same weight, return either thing
	// If suitcase empty, return null
	public Thing heaviestThing() {
		Thing heaviest = null;

		// Checks equal to 0 to support things of weight 0
		for (Thing thing : things) {
			if (heaviest == null || thing.getWeight() > heaviest.getWeight()) {
				heaviest = thing;
			}
		}

		return heaviest;
	}

	public void printThings() {
		for (Thing thing : things) {
			System.out.println(thing);
		}
	}

	@Override
	public String toString() {
		if (things.isEmpty()) {
			return "empty (0 kg)";
		}

		if (things.size() == 1) {
			return "1 thing (" + totalWeight() + " kg)";
		}

		return things.size() + " things (" + totalWeight() + " kg)";
	}
}