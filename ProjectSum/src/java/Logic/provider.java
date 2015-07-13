package Logic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "Providers")
public class provider {

    private Long id;
    private String name;
    private providerCard card;
    private String[] fabricators;

    private class providerCard {                                                // ПРИВАТНЫЙ?

        private tpeople[] people;
        private String officeAdress;
        private String phone;
        private String storageAdress;
        private String note;
        private String equip;
    }

    private class tpeople {                                                     // ПРИВАТНЫЙ?

        private String fio;
        private String email;
        private String phone1;
        private String phone2;
    }

    public provider() {
        name = null;
    }

    public provider(provider s) {
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
    public providerCard getCard() {
        return card;
    }

    @Column(name = "Fabricators")
    public String[] getFabricators() {
        return fabricators;
    }

    public void setId(Long i) {
        id = i;
    }

    public void setName(String s) {
        name = s;
    }

    public void setCard(providerCard c) {
        card = c;
    }

    public void setFabricators(String[] fabs) {
        fabricators = fabs;
    }
}
