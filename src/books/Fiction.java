package books;

/**
 * @author Negin Mousavi
 */
public class Fiction extends Book {
    public Fiction(String title) {
        super(title);
        setPrice();
    }

    @Override
    public void setPrice() {
        price = 24.99;
    }

    @Override
    public String toString() {
        return "Fiction{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
