package app;

import books.Book;
import books.Fiction;
import books.NonFiction;

import java.util.Scanner;

/**
 * @author Negin Mousavi
 */
public class ArrayBook {

    Book[] books = new Book[10];
    private int indexOfBooks = 0;

    public static void main(String[] args) {
        ArrayBook arrayBook = new ArrayBook();
        String option;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Fiction or NonFiction?(f/n). to exit enter 'e': ");
            option = scanner.nextLine().toLowerCase();
            if (option.equals("e"))
                break;
            if (!option.equals("f") && !option.equals("n")) {
                printInvalidInput();
                continue;
            }

            System.out.print("Enter title: ");
            String title = scanner.nextLine();

            if (option.equals("f"))
                arrayBook.createFictionBook(title);
            else
                arrayBook.createNonFictionBook(title);
            System.out.println("your book added successfully :)");
            arrayBook.showAllBooks();
            printStar();
        }
    }

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
            System.out.println(book.toString());
        }
    }

    public static void printInvalidInput() {
        System.out.println("invalid input");
    }

    public static void printStar() {
        System.out.println("**********************************************************");
    }
}
