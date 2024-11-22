package lab2;

public class Publication {
    private String title;
    private BookGenre genre;
    private Date publishDate;

    public Publication() {
    }

    public Publication(String title, BookGenre genre, Date publishDate) {
        this.title = title;
        this.genre = genre;
        this.publishDate = publishDate;
    }

    public void printInfo() {
        System.out.printf("PublicationInfo. title: %s, genre: %s%n ", title, genre);
        System.out.println("Publish date: ");
        publishDate.printInfo();
        System.out.println("________________");
    }

    @Override
    public String toString() {
        return "title=%s, genre=%s, publishDate=%s".formatted(title, genre, publishDate.toString());
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BookGenre getGenre() {
        return genre;
    }

    public void setGenre(BookGenre genre) {
        this.genre = genre;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }
}
