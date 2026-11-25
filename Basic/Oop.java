package Basic;

class Book {
    String name;
    String bookName;

    void reading() {
        System.out.println(name + " is reading the book " + bookName);
    }
}

public class Oop {
    public static void main(String[] args) {
        Book b = new Book();

        b.name = "Fadri";
        b.bookName = "Pale Blue Dot";

        b.reading();
    }
}
