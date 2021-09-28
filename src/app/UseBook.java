package app;

import books.Book;
import books.Fiction;
import books.NonFiction;

import java.util.Scanner;

/**
 * @author Negin Mousavi
 */
public class UseBook {
    Fiction[] fictions = new Fiction[10];
    private int indexOfFictions = 0;
    NonFiction[] nonFictions = new NonFiction[10];
    private int indexOfNonFictions = 0;


    public static void main(String[] args) {
        UseBook useBook = new UseBook();
        String option;
        Scanner scanner = new Scanner(System.in);
        while (true){
//            scanner.nextLine();
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
                useBook.createFictionBook(title);
            else
                useBook.createNonFictionBook(title);
            System.out.println("your book added successfully");
            useBook.showAllBooks();
            printStar();
        }
    }

    public void createFictionBook(String title) {
        fictions[indexOfFictions++] = new Fiction(title);
    }

    public void createNonFictionBook(String title) {
        nonFictions[indexOfNonFictions++] = new NonFiction(title);
    }

    public void showAllBooks() {
        System.out.println("your books are: ");
        for (int i = 0; i < indexOfFictions; i++) {
            System.out.println(fictions[i].toString());
        }

        for (int i = 0; i < indexOfNonFictions; i++) {
            System.out.println(nonFictions[i].toString());
        }
    }


    public static void printInvalidInput() {
        System.out.println("invalid input");
    }

    public static void printStar() {
        System.out.println("**********************************************************");
    }
}
