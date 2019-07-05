public class SkiJumper implements Comparable<SkiJumper> {

    private String name;
    private int points;

    public SkiJumper(String name, int points) {
        this.name = name;
        this.points = points;
    }

    @Override
    public String toString() {
        return name + " (" + points + " points)";
    }

    // Jump in ascending order of points
    @Override
    public int compareTo(SkiJumper o) {
        return points - o.points;
    }
}