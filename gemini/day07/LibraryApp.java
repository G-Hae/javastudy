package gemini.day07;

public class LibraryApp {
    public static void main(String[] args) {
        Library library = new Library();

        Book[] initialBooks = {
                new Book("자바의정석", "남궁성", 2010),
                new Book("혼자 공부하는 파이썬", "파이선", 2011),
                new Book("어린 왕자", "베리", 1990),
                new Book("자바의정석", "남궁성", 2010)
        };
        for (Book book : initialBooks) {
            library.add(book);
        }

        library.listAll();
        library.find("치킨");
        Book javaBook = library.find("자바의정석");
        javaBook.borrowBook();
        javaBook.borrowBook();
        javaBook.returnBook();
        javaBook.returnBook();
        library.remove(javaBook.getTitle());

        library.listAll();

    }

}
