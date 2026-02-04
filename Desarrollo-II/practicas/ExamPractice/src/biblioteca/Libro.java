package biblioteca;

public class Libro {
    private int isbn;
    private String title;
    private String author;
    private int pages;

    public Libro() {
        System.out.println("Constructor libro");
    }

    public Libro(int isbn, String title, String author, int pages) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Libro [ISBN = " + isbn + ", title = " + title + ", author = " + author + ", pages = " + pages + "] ";
    }
    

    

    
}
