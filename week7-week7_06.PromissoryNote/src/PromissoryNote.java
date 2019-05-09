import java.util.HashMap;

public class PromissoryNote {
    private HashMap<String, Double> debt = new HashMap<String, Double>();

    public void setLoan(String toWhom, double value) {
        toWhom = stringCleaner(toWhom);
        debt.put(toWhom, value);
    }

    public double howMuchIsTheDebt(String whose) {
        whose = stringCleaner(whose);
        Double value = debt.get(whose);

        if (value == null) {
            return 0;
        }

        return value;
    }

    private String stringCleaner(String string) {
        if (string == null) {
            return "";
        }

        string = string.toLowerCase();
        return string.trim();
    }
}
