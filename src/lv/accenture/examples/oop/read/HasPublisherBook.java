package lv.accenture.examples.oop.read;

public class HasPublisherBook extends Book implements HasPublisher {

    private String publisher;

   public HasPublisherBook(String nameOfAuthor, int countOfChapters, String publisher) {
      super(nameOfAuthor, countOfChapters);
       this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "HasPublisherBook{" +
                "publisher='" + publisher + '\'' +
                '}';
    }

    @Override
    public String getPublisher() {
        return publisher;
    }
}
