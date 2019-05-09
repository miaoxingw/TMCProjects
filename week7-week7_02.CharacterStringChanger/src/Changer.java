import java.util.ArrayList;

public class Changer {
    private ArrayList<Change> changes = new ArrayList<Change>();

    public void addChange(Change change) {
        changes.add(change);
    }

    public String change(String characterString) {
        for (Change delta: changes) {
            characterString = delta.change(characterString);
        }

        return characterString;
    }
}
