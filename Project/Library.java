package Project;

class Book {
    String title;
    String writer;
    boolean isAvailable;

    Book(String title, String writer) {
        this.title = title;
        this.writer = writer;
        this.isAvailable = true;
    }

    void showInfo() {
        System.out.println("Title: " + title);
        System.out.println("Writer: " + writer);
        if (isAvailable) {
            System.out.println("Status: Available");
        } else {
            System.out.println("Status: Not Available");
        }
    }

    void borrowBook() {
        if (isAvailable) {
            this.isAvailable = false;
            System.out.println("Book successfully borrowed!");
        } else {
            System.out.println("Book is not available");
        }
    }

    void returnBook() {
        if (!isAvailable) {
            this.isAvailable = true;
            System.out.println("Book successfully returned!");
        } else {
            System.out.println("Book was not borrowed");
        }
    }
}

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Pale Blue Dot", "Carl Sagan");
        Book book2 = new Book("The Story Girl", "L. M. Montgomery");

        book1.borrowBook();
        book1.borrowBook();
        book1.showInfo();
        book2.showInfo();
    }
}
