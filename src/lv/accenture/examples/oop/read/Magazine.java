package lv.accenture.examples.oop.read;

public class Magazine extends AbstractSomethingToRead implements HasPublisher{

    private int countOfArticles;
    private float dataOfPublishing;


    public Magazine(int countOfArticles, float dataOfPublishing){
        this.countOfArticles = countOfArticles;
        this.dataOfPublishing = dataOfPublishing;
    }

    @Override
    public String name() {
        return name() ;
    }

    @Override
    public int price() {
        return price();
    }

    @Override
    public String getPublisher() {
        return getPublisher();
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "countOfArticles=" + countOfArticles +
                ", dataOfPublishing=" + dataOfPublishing +
                '}';
    }
}




