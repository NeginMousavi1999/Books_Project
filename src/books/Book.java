package books;

/**
 * @author Negin Mousavi
 */
public abstract class Book {
    protected String title;
    protected double price;

    public Book(String title) {
        this.title = title;
    }

    public abstract void setPrice();

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}
