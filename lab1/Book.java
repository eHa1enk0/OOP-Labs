package lab1;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private BookGenre genre;
    private Author author;
    private List<Publication> publications = new ArrayList<>();


    public Book(String title, BookGenre genre, Author author) {
        this.title = title;
        this.genre = genre;
        this.author = author;
    }

    public void printShortInfo() {
        System.out.printf("Short info. title: %s%n", title);
        System.out.println( " author: " + "publications: " + publications.size());

    }

    public void printInfo() {
        System.out.printf("BookInfo. title: %s, genre: %s", title, genre);
        System.out.print(" Author: ");
        author.printInfo();
        System.out.println();

        System.out.println("Book publications ");
        for (Publication publication : publications) {
            publication.printInfo();
        }
        System.out.println("________________");
    }

    public void addPublication(Publication publication) {
        publications.add(publication);
    }

    public List<Publication> getPublications() {
        return publications;
    }




    public String getTittle() {
        return title;
    }

    public void setTittle(String tittle) {
        this.title = tittle;
    }

    public BookGenre getGenre() {
        return genre;
    }

    public void setGenre(BookGenre genre) {
        this.genre = genre;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}

