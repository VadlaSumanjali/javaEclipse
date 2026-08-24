package day14;
import java.util.ArrayList;

class Book {

    private int id;
    private String title;
    private String author;
    private boolean available = true;

    Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return available;
    }

    public void issue() {
        available = false;
    }

    public void returnBook() {
        available = true;
    }

    public void display() {
        System.out.println(id + " " + title + " " + author);
    }
}

class Member {

    private int id;
    private String name;

    Member(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Library {

    ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void searchBook(String title) {

        for (Book book : books) {

            if (book.getTitle().equalsIgnoreCase(title)) {
                book.display();
                return;
            }
        }

        System.out.println("Book not found");
    }

    public void issueBook(String title, Member member) {

        for (Book book : books) {

            if (book.getTitle().equalsIgnoreCase(title)) {

                if (book.isAvailable()) {
                    book.issue();
                    System.out.println(
                        title + " issued to " + member.getName()
                    );
                } else {
                    System.out.println("Book already issued");
                }

                return;
            }
        }

        System.out.println("Book not found");
    }

    public void returnBook(String title) {

        for (Book book : books) {

            if (book.getTitle().equalsIgnoreCase(title)) {

                book.returnBook();
                System.out.println("Book returned");
                return;
            }
        }

        System.out.println("Book not found");
    }

    public void displayBooks() {

        for (Book book : books) {

            if (book.isAvailable()) {
                book.display();
            }
        }
    }
}

public class LibraryDemo {

    public static void main(String[] args) {

        Library library = new Library();

        Book b1 = new Book(101, "Java", "James");
        Book b2 = new Book(102, "SQL", "John");
        Book b3 = new Book(103, "Spring", "Craig");

        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);

        Member m1 = new Member(1, "Suman");

        library.searchBook("Java");

        library.issueBook("Java", m1);

        library.issueBook("Java", m1);

        library.displayBooks();

        library.returnBook("Java");

        library.displayBooks();
    }
}