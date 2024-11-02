package lab1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SelfPublishedAuthor extends Author {
    private String platform;
    private String website;

    public SelfPublishedAuthor() {
    }

    public SelfPublishedAuthor(String name,
                               String surname,
                               Date birthdate,
                               String platform,
                               String website) {
        super(name, surname, birthdate);
        this.platform = platform;
        this.website = website;
    }

    @Override
    public String toString() {
        return super.toString() + ", platform=" + platform + ", website=" + website;
    }
}
