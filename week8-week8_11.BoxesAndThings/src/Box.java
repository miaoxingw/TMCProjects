import java.util.ArrayList;

public class Box implements ToBeStored {
    private ArrayList<ToBeStored> things;
    private double maxWeight;

    public Box(double maxWeight) {
        things = new ArrayList<ToBeStored>();
        this.maxWeight = maxWeight;
    }

    public void add(ToBeStored thing) {
        if (thing.weight() + weight() <= maxWeight) {
            things.add(thing);
        }
    }

    public double weight() {
        double weight = 0;
        for (ToBeStored thing: things) {
            weight += thing.weight();
        }

        return weight;
    }

    @Override
    public String toString() {
        return "Box: " + things.size() + " things, total weight " + weight() + " kg";
    }
}
