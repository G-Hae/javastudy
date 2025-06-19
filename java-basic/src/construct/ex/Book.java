package construct.ex;

public class Book {
    String title;
    String author;
    int page;

    Book() {
        this.title = "";
        this.author = "";
        this.page = 0;

    }

    Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    Book(String title, String author) {
        this(title, author, 0);
    }

    void displayInfo() {
        System.out.println("title" + title + "author" + author + "page" + page);
    }

}
