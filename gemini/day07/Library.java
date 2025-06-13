package gemini.day07;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Library implements Manageable {
    private ArrayList<Book> bookList = new ArrayList<>();

    public void add(Book book) {
        try {
            for (Book b : bookList) {
                if (b.getTitle().equals(book.getTitle())) {
                    throw new IllegalArgumentException("이미 등록된 책입니다.");
                }
            }
            bookList.add(book);
        } catch (IllegalArgumentException e) {
            System.out.println("오류: " + e.getMessage());
        }
    }

    public Book find(String title) {
        for (Book book : bookList) {
            if (book.getTitle().equals(title)) {
                book.displayBookInfo();
                return book;
            }
        }
        System.out.println("책을 찾을 수 없습니다.");
        return null;
    }

    public void remove(String title) {
        try {
            Book bookToRemove = find(title);
            if (bookToRemove != null) {
                bookList.remove(bookToRemove);
                System.out.println("책" + title + "이 삭제되었습니다.");
            } else {
                throw new NoSuchElementException("오류: 삭제하려는 책을 찾을 수 없습니다.");

            }
        } catch (NoSuchElementException e) {
            System.out.println("오류: " + e.getMessage());
        }
    }

    public void listAll() {
        if (bookList.isEmpty()) {
            System.out.println("등록된 책이 없습니다.");
            return;
        }
        for (Book book : bookList) {
            System.out.println(book.toString());
        }

    }

}
