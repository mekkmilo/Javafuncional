import java.util.List;

public class Punto1Mutable {
    private String Name;
    private String Item;

    private List<String> emails;

    public Punto1Mutable(String name, String item, List<String> emails) {
        Name = name;
        Item = item;
        this.emails = emails;
    }

    public String getName() {
        return Name;
    }

    public void setName(String firstName) {
        this.Name = firstName;
    }

    public String getItem() {
        return Item;
    }

    public void setItem(String lastName) {
        this.Item = lastName;
    }

    public List<String> getEmails() {
        return emails;
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }

    @Override
    public String toString() {
        return "MutablePerson{" +
                "firstName='" + Name + '\'' +
                ", lastName='" + Item + '\'' +
                ", emails=" + emails +
                '}';
    }
}
