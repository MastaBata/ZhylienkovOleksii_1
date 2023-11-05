package org.ZhylienkovOleksii_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add a new book");
            System.out.println("2. Show all books");
            System.out.println("3. Search book by name");
            System.out.println("4. Delete by ISBN");
            System.out.println("5. Exit");

            System.out.print("Choose option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Очистити буфер після вибору опції

            switch (choice) {
                case 1:
                    System.out.print("Book name: ");
                    String title = scanner.nextLine();
                    System.out.print("Author: ");
                    String author = scanner.nextLine();
                    System.out.print("ISBN: ");
                    String isbn = scanner.nextLine();
                    System.out.print("Year: ");
                    int year = scanner.nextInt();
                    scanner.nextLine(); // Очистити буфер після введення року
                    Book newBook = new Book(title, author, isbn, year);
                    library.addBook(newBook);
                    System.out.println("Book added.");
                    break;
                case 2:
                    System.out.println("Books list:");
                    library.displayBooks();
                    break;
                case 3:
                    System.out.print("Type book name to search: ");
                    String searchTitle = scanner.nextLine();
                    System.out.println("Results:");
                    library.searchByTitle(searchTitle);
                    break;
                case 4:
                    System.out.print("Type ISBN of book to delete: ");
                    String isbnToDelete = scanner.nextLine();
                    library.removeBookByIsbn(isbnToDelete);
                    System.out.println("Book deleted.");
                    break;
                case 5:
                    System.out.println("program end.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Unavailable option. Try again.");
            }
        }
    }
}