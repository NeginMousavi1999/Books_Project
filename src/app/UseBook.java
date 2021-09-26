package app;

import books.Book;
import books.Fiction;
import books.NonFiction;

/**
 * @author Negin Mousavi
 */
public class UseBook {
    Book[] books = new Book[10];
    private int indexOfBooks = 0;

    public void createFictionBook(String title) {
        books[indexOfBooks++] = new Fiction(title);
    }

    public void createNonFictionBook(String title) {
        books[indexOfBooks++] = new NonFiction(title);
    }

    public void showAllBooks() {
        System.out.println("your books are: ");
        for (Book book : books
        ) {
            if (book == null)
                break;
             System.out.println(String.valueOf(book.getClass()).split("\\.")[1] + ": " + book.getTitle() + " " + book.getPrice());
        }
    }
}
