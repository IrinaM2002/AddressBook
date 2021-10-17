package AddressBookClass;
import java.lang.String;
import java.util.*;


public class Adress {
    private final String street;
    private final int house;
    private final int flat;

    public Adress(String street, int house, int flat) {
        this.street = street;
        this.house = house;
        this.flat = flat;
    }

    public String getStreet() {
        return street;
    }

    public int getHouse() {
        return house;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adress address = (Adress) o;
        return street.equals(address.street) && house == address.house && flat == address.flat;
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, house, flat);
    }

}
