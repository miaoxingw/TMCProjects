public class Main {
    public static void main(String[] args) {
        Box box = new Box(10);
        Box boxSmall = new Box(5);

        box.add( new Book("Fedor Dostojevski", "Crime and Punishment", 2) ) ;
        box.add( new Book("Robert Martin", "Clean Code", 1) );
        box.add( new Book("Kent Beck", "Test Driven Development", 0.7) );

        boxSmall.add( new CD("Pink Floyd", "Dark Side of the Moon", 1973) );
        boxSmall.add( new CD("Wigwam", "Nuclear Nightclub", 1975) );
        boxSmall.add( new CD("Rendezvous Park", "Closer to Being Here", 2012) );

        box.add(boxSmall);
        System.out.println(box);
        System.out.println(boxSmall);

        // Put a box into itself
        /*boxSmall.add(boxSmall);
        System.out.println(box);
        System.out.println(boxSmall);*/
    }
}
