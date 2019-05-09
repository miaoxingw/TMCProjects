public class Main {
    public static void main(String[] args) {
        // Test Change
        String word = "carrot";
        Change change1 = new Change('a', 'b');
        word = change1.change(word);

        // should be cbrrot
        System.out.println(word);

        Change Change2 = new Change('r', 'x');
        word = Change2.change(word);

        // should be cbxxot
        System.out.println(word);

        // Test Changer
        Changer scandiesAway = new Changer();
        scandiesAway.addChange(new Change('ä', 'a'));
        scandiesAway.addChange(new Change('ö', 'o'));

        // should be aalio ala lyo, oolia laikkyy
        System.out.println(scandiesAway.change("ääliö älä lyö, ööliä läikkyy"));
    }
}
