package encapsulation;

import java.util.Scanner;

class Book {

    private String title;
    private String author;
    private boolean available;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public void borrowBook() {

        if (!available) {
            System.out.println("Book is already borrowed");
            return;
        }

        available = false;
        System.out.println("Book Borrowed Successfully");
    }

    public void returnBook() {

        if (available) {
            System.out.println("Book is already available");
            return;
        }

        available = true;
        System.out.println("Book Returned Successfully");
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }
}

public class LibraryBook {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author: ");
        String author = sc.nextLine();

        Book b = new Book(title, author);

        System.out.print("Borrow book? (Yes/No): ");
        String choice = sc.nextLine();

        if (choice.equalsIgnoreCase("Yes")) {
            b.borrowBook();
        }

        System.out.println("Title: " + b.getTitle());
        System.out.println("Author: " + b.getAuthor());
        System.out.println("Available: " + b.isAvailable());

        sc.close();
    }
}