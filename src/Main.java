import app.UseBook;

import java.util.Scanner;

/**
 * @author Negin Mousavi
 */
public class Main {
    public static void main(String[] args) {
        UseBook useBook = new UseBook();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        mainChoice:
        do {
            System.out.print("1)UseBook\n2)ArrayBook\n3)exit\nyour choice is: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Fiction or NonFiction?(f/n) ");
                    String option = scanner.nextLine();
                    //TODO
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("bye bye");
                    printStar();
                    break mainChoice;

                default:
                    printInvalidInput();
                    printStar();

            }
        } while (true);
    }

    public static void printInvalidInput() {
        System.out.println("invalid input");
    }

    public static void printStar() {
        System.out.println("**********************************************************");
    }
}
