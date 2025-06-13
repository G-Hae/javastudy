package gemini.day07;

public interface Manageable {
    void add(Book book);

    Book find(String title);

    void remove(String title);

    void listAll();
}