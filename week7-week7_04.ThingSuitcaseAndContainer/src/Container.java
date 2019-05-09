import java.util.ArrayList;

public class Container {
	private ArrayList<Suitcase> suitcases;
	private int maxWeight;
	private int totalWeight = 0;

	public Container(int maxWeight) {
		suitcases = new ArrayList<Suitcase>();
		this.maxWeight = maxWeight;
	}

	public void addSuitcase(Suitcase suitcase) {
		// Add suitcase to container if weight within bounds
		if (suitcase.totalWeight() + totalWeight() > maxWeight) {
			return;
		}

		suitcases.add(suitcase);
	}

	public int totalWeight() {
		int weight = 0;
		for (Suitcase suitcase : suitcases) {
			weight += suitcase.totalWeight();
		}

		return weight;
	}

	public void printThings() {
		for (Suitcase suitcase : suitcases) {
			suitcase.printThings();
		}
	}

	public String toString() {
		if (suitcases.isEmpty()) {
			return "empty (0 kg)";
		}

		if (suitcases.size() == 1) {
			return "1 suitcase (" + totalWeight() + " kg)";
		}

		return suitcases.size() + " suitcases (" + totalWeight() + " kg)";
	}
}