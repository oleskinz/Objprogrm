package lv.accenture.examples.oop.read;

public class Main {

    public static void main(String[] args) {
        Book book = new Book("King", 2);
        Magazine magazine = new Magazine(67,24);

        System.out.println("Book " + book);
        System.out.println("Magazine " + book);

    }

}
