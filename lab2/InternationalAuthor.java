package lab2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InternationalAuthor extends Author {
    private String nationality;
    private String language;

    public InternationalAuthor() {
    }

    public InternationalAuthor(String name,
                               String surname,
                               Date birthdate,
                               String nationality,
                               String language) {
        super(name, surname, birthdate);
        this.nationality = nationality;
        this.language = language;
    }

    @Override
    public String toString() {
        return super.toString() + ", Nationality=" + nationality + " Language=" + language;
    }
}