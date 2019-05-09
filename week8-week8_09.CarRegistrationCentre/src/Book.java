import java.util.HashMap;

public class Book {
    private String name;
    private int publishingYear;

    public Book(String name, int publishingYear) {
        this.name = name;
        this.publishingYear = publishingYear;
    }

    public String getName() {
        return name;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.publishingYear + ")";
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        if (getClass() != object.getClass()) {
            return false;
        }

        Book compared = (Book) object;

        if (publishingYear != compared.getPublishingYear()) {
            return false;
        }

        if (name == null || !name.equals(compared.getName())) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        if (name == null) {
            return 7;
        }

        return publishingYear + name.hashCode();
    }
}

class Test {
    public static void main(String args[]) {
        HashMap<Book, String> loaners = new HashMap<Book, String>();

        Book objectbook = new Book("Objectbook", 2000);
        loaners.put( objectbook, "Pekka" );
        loaners.put( new Book("Test Driven Development",1999), "Arto" );

        System.out.println( loaners.get( objectbook ) );
        System.out.println( loaners.get( new Book("Objectbook", 2000) ));
        System.out.println( loaners.get( new Book("Test Driven Development", 1999) ));
    }
}