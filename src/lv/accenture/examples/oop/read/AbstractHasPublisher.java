package lv.accenture.examples.oop.read;

public class AbstractHasPublisher implements HasPublisher{

    protected String publisher;

    @Override
    public String getPublisher() {
        return publisher;
    }
}
