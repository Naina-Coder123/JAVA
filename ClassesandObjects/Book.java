public class Book {
    String title;
    String author;
    String isbn;
    static int totalBooks;

    void borrowBook() {
        System.out.println("Borrowed Book ");
    }

    void returnBook() {
        System.out.println("Returned Book");
    }

    static void getTotalBooks() {
        System.out.println("Total no of books=10");
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        b1.title = "Java";
        b1.author = "James Gosling";
        b1.isbn = "123553";
        b1.borrowBook();
        b1.returnBook();
        Book.getTotalBooks();
        System.out.println(b1.title + " " + b1.author + " " + b1.isbn);
    }
}
