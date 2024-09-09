package lab1;

public class Author {
    private String name;
    private String surname;
    private Date birthdate;

    public Author(String name, String surname, Date birthdate) {
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
    }

    public void printInfo() {
        System.out.printf("AuthorInfo. Name: %s, Surname: %s%n ", name, surname);
        System.out.println("Author birthdate: ");
        birthdate.printInfo();
        System.out.println("________________");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
}
