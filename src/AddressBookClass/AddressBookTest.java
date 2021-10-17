package AddressBookClass;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.*;

public class AddressBookTest {

    private final Adress address = new Adress("Street", 1, 48);
    private final Adress address1 = new Adress("Street 1", 3, 26);
    private final Adress address2 = new Adress("Street 2", 5, 416);
    String name = "Irina";
    String name1 = "Vlad";
    String name2 = "Sveta";

    @Test
    public void add() {

        AddressBook actual = new AddressBook();
        actual.add(name,address);
        assertEquals(actual.getAddress(name), address);
    }

    @Test
    public void delete() {

        AddressBook actual = new AddressBook();
        actual.add(name,address);
        actual.delete(name);
        assertNull(actual.getAddress("name"));

    }

    @Test
    public void change() {

        AddressBook actual = new AddressBook();
        actual.add(name,address);
        actual.change(name,address2);
        assertEquals(actual.getAddress(name), address2);
    }

    @Test
    public void getAddress() {

        AddressBook addressBook = new AddressBook();
        addressBook.add(name,address);
        Adress actual = addressBook.getAddress(name);
        assertEquals(actual, address);
    }

    @Test
    public void getListStreet() {

        AddressBook addressBook = new AddressBook();
        String street = "Street";
        addressBook.add(name,address);
        addressBook.add(name1, address2);
        addressBook.add(name2, address1);

        ArrayList<String> actual = addressBook.getListStreet(street);

        ArrayList<String> expected = new ArrayList<String>(Collections.singleton("Irina"));
        assertEquals(expected, actual);

    }

    @Test
    public void getListHouse() {

        AddressBook addressBook = new AddressBook();
        int house = 3;
        addressBook.add(name, address);
        addressBook.add(name1, address2);
        addressBook.add(name2, address1);

        ArrayList<String> actual = addressBook.getListHouse(house);

        ArrayList<String> expected = new ArrayList<String>(Collections.singleton("Sveta"));
        assertEquals(actual, expected);
    }
}