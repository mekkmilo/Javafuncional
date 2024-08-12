import java.util.ArrayList;
import java.util.List;

public final class Punto1Inmutable {

    private final String Name;
    private final String Item;
    private final List<String> emails;

    public Punto1Inmutable(String name, String item, List<String> emails) {
        Name = name;
        Item = item;
        this.emails = emails;
    }

    public String getName() {
        return Name;
    }

    public String getItem() {
        return Item;
    }

    public List<String> getEmails() {
        return new ArrayList<>(emails);
    }

    @Override
    public String toString() {
        return "punto1Inmutable{" +
                "Name='" + Name + '\'' +
                ", Item='" + Item + '\'' +
                ", emails=" + emails +
                '}';
    }
}
