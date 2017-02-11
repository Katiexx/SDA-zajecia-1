package zajecia.dziewiate;

/**
 * Created by RENT on 2017-02-11.
 */
public class Book {
    private String title;
    private Author author;
    private int numberOfPages;
    private int realseDate;
    private String description;
    private String[] content;
    private String category;

    public Book(String title, Author author, String[] content, int realseDate) {
        this.title = title;
        this.author = author;
        this.realseDate = realseDate;
        this.content = content;
        this.numberOfPages = content.length;
    }

    public Book(String title, Author author, int realseDate, String[] content, String description) {
        this(title, author, content, realseDate);
        this.category = category;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", realseDate='" + realseDate + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                '}';
    }

    public String getPage(int index) {
        int actualIndex = index - 1;
        if (actualIndex >= 0 && actualIndex < this.numberOfPages) {
            return content[actualIndex];
        } else {
            return "No such page";
        }

    }

    public Author getAuthor() {
        return author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getRealseDate() {
        return realseDate;
    }

    public String getDescription() {
        return description;
    }

    public String[] getContent() {
        return content;
    }

    public String getCategory() {
        return category;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}



