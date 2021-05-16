package Task2;

public class Book extends Document{
    private String author;
    private int pages;

    public Book(int codename, String brand, int amount, String author, int pages) {
        super(codename, brand, amount);
        this.author = author;
        this.pages = pages;
    }

    public Book() {
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Book{" +
                "author='" + author + '\'' +
                ", pages=" + pages +
                "} ";
    }
}
