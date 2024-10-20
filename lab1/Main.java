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
        book1.printInfo();
        System.out.println("__________________________________________________");

        System.out.println("book1 short info");
        book1.printShortInfo();
        System.out.println("__________________________________________________");

        Author author = book1.getAuthor();
        System.out.println("book1 info via getter: ");
        author.printInfo();
        System.out.println("__________________________________________________");

        Author Author2 = new Author("Ivann ","Franko", new Date(27, 8, 1856));
        Publication pub3 = new Publication("Zahar Berkut2", BookGenre.FICTION, new Date(12, 6, 1394));
        Publication pub4 = new Publication("Zahar Berkut2", BookGenre.SCIENCE, new Date(32, 1, 2007));


        Book book2 = new Book("Zahar Berkut", BookGenre.FICTION, author);
        book2.addPublication(pub3);
        book2.addPublication(pub4);

        System.out.println("book2 full info");
        book2.printInfo();
        System.out.println("__________________________________________________");

        System.out.println("book2 short info");
        book2.printShortInfo();
        System.out.println("__________________________________________________");

        Author author2 = book2.getAuthor();
        System.out.println("book2 info via getter: ");
        Author2.printInfo();
    }
}
