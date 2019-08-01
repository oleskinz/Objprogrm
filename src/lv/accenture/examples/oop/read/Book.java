package lv.accenture.examples.oop.read;

public class Book extends AbstractSomethingToRead{

    private String nameOfAuthor;
    private int countOfChapters;

    public Book(String nameOfAuthor,int countOfChapters){
        this.nameOfAuthor = nameOfAuthor;
        this.countOfChapters = countOfChapters;
    }

    @Override
    public String name() {
        return null ;
    }

    @Override
    public int price() {
        return 0;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameOfAuthor='" + nameOfAuthor + '\'' +
                ", countOfChapters=" + countOfChapters +
                '}';
    }
}
