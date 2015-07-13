package Logic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "Fabricators")
public class fabricator {

    private Long id;
    private String name;
    private fabricatorCard card;
    private String[] providers;

    private class fabricatorCard {                                              // ПРИВАТНЫЙ?

        private tpeople[] people;
        private String officeAdress;
        private String phone;
        private String note;
    }

    private class tpeople {                                                     // ПРИВАТНЫЙ?

        private String fio;
        private String email;
        private String phone1;
        private String phone2;
    }

    public fabricator() {
        name = null;
    }

    public fabricator(fabricator s) {
        name = s.getName();
    }

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")

    @Column(name = "id")
    public Long getId() {
        return id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    @Column(name = "card")
    public fabricatorCard getCard() {
        return card;
    }

    @Column(name = "Fabricators")
    public String[] getProviders() {
        return providers;
    }

    public void setId(Long i) {
        id = i;
    }

    public void setName(String s) {
        name = s;
    }

    public void setCard(fabricatorCard c) {
        card = c;
    }

    public void setFabricators(String[] fabs) {
        providers = fabs;
    }
}
