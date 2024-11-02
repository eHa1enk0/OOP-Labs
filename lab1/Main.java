package lab1;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Ivan ","Franko", new Date(27, 8, 1856));
        Publication pub1 = new Publication("Zahar Berkut", BookGenre.FICTION, new Date(12, 6, 1394));
        Publication pub2 = new Publication("Zahar Berkut", BookGenre.SCIENCE, new Date(32, 1, 2007));
        Book book1 = new Book("Zahar Berkut", BookGenre.FICTION, author1);
        book1.addPublication(pub1);
        book1.addPublication(pub2);

        System.out.println("book1 full info");
        System.out.println(book1);
        System.out.println();
        System.out.println("__________________________________________________");


        Author author2 = new InternationalAuthor("Ivann ","Franko", new Date(27, 8, 1856), "Ukraine", "Ukraine");
        Publication pub3 = new Publication("Zahar Berkut2", BookGenre.FICTION, new Date(12, 6, 1394));
        Publication pub4 = new Publication("Zahar Berkut2", BookGenre.SCIENCE, new Date(32, 1, 2007));
        Book book2 = new Book("Zahar Berkut", BookGenre.FICTION, author2);
        book2.addPublication(pub3);
        book2.addPublication(pub4);

        System.out.println();
        System.out.println("book2 full info");
        System.out.println(book2);
        System.out.println("__________________________________________________");


        Author author3 = new SelfPublishedAuthor("Ivan ","Franko", new Date(27, 8, 1856), "asd.com", "asd.com");
        Publication pub5 = new Publication("Zahar Berkut", BookGenre.FICTION, new Date(13, 6, 1394));
        Publication pub6 = new Publication("Zahar Berkut", BookGenre.SCIENCE, new Date(22, 1, 2007));
        Book book3 = new Book("Zahar Berkut", BookGenre.FICTION, author3);
        book3.addPublication(pub5);
        book3.addPublication(pub6);

        System.out.println("book3 full info");
        System.out.println(book3);
        System.out.println();
    }
}
