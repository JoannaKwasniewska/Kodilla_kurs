public class Book {
    private String author;
    private String title;

    private Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public static Book of(String author, String title) {
        return new Book(author, title);
    }

    public static void TryBook() {
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
}