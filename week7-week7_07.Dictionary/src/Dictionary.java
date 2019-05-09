import java.util.HashMap;
import java.util.ArrayList;

public class Dictionary {
    private final HashMap<String, String> translations = new HashMap<String, String>();

    public String translate(String word) {
        return translations.get(word);
    }

    public void add(String word, String translation) {
        translations.put(word, translation);
    }

    public int amountOfWords() {
        return translations.size();
    }

    public ArrayList<String> translationList() {
        ArrayList<String> translationList = new ArrayList<String>();

        for (String key : translations.keySet()) {
            String translation = key + " = " + translations.get(key);
            translationList.add(translation);
        }

        return translationList;
    }
}
