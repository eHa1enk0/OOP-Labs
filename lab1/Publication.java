package lab1;

public class Publication {
    private String title;
    private BookGenre genre;
    private Date publishDate;


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
