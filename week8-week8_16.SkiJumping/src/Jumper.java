import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class SkiJumper implements Comparable<SkiJumper> {

    private final String name;
    private int points;
    private List<Jump> jumps;

    public SkiJumper(String name, int points) {
        this.name = name;
        this.points = points;
        this.jumps = new ArrayList<Jump>();
    }

    public String getRoundResult() {
        int length = jumpLength();
        int[] votes = judgeVotes();

        String roundResult = "  " + name + "\n";
        jumps.toString();

        addPoints(length);
        jumpLengths.add(length);
        addPoints(getMiddleVotes(votes));

        return roundResult;
    }

    private void addPoints(int addedPoints) {
        points += addedPoints;
    }

    public String jumpLengths() {
        String output = "";

        for (int i = 0; i < jumpLengths.size(); i++) {
            if (i != 0) {
                output += ", ";
            }

            output += jumpLengths.get(i) + " m";
        }

        return output;
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