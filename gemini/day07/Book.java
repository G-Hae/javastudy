package gemini.day07;

public class Book {
    // 속성
    private String title;
    private String author;
    private int year;
    private boolean isBorrowed;

    // 생성자
    public Book(String title, String author, int year, boolean isBorrowed) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isBorrowed = isBorrowed;
    }

    // 생성자 기본값 처리
    public Book(String title, String author, int year) {
        this(title, author, year, false);
    }

    // 매서드
    public void displayBookInfo() {
        System.out.println("title: " + title + " author: " + author + " year: " + year + " isBorrowed: " + isBorrowed);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void borrowBook() {
        if (isBorrowed) {
            System.out.println("이미 대출 중인 책입니다.");
        } else {
            isBorrowed = true;
            System.out.println("책이 대출되었습니다.");
        }
    }

    public void returnBook() {
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println("책이 반납되었습니다.");
        } else {
            System.out.println("대출되지 않은 책입니다.");
        }
    }

    @Override
    public String toString() {
        return String.format("제목 %s, 저자: %s, 출간연도: %d", title, author, year);
    }
}
