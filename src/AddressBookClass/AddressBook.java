package AddressBookClass;
import java.util.*;
import java.lang.String;

public class AddressBook {

    private final HashMap<String, Adress> addressBook = new HashMap<>();

    public AddressBook(String name, Adress address) {
    }

    public AddressBook() {
    }

    //добавление пары человек-адрес

    public void add (String name, Adress address) {
        addressBook.put(name, address);
    }

    //удаление человека

    public void delete (String name){
        addressBook.remove(name);
    }

    //изменение адреса человека

    public void change (String name, Adress address) {
        addressBook.remove(name);
        addressBook.put(name, address);
    }

    //получение адреса человека

    public Adress getAddress (String name){
        return addressBook.get(name);
    }

    // получение списка людей, живущих на заданной улице.

    public ArrayList<String> getListStreet (String street){
        ArrayList<String> listName = new ArrayList<>();
        if (!addressBook.isEmpty()){
            for (Map.Entry<String,Adress> entry: addressBook.entrySet()) {
                String name = entry.getKey();
                Adress address = entry.getValue();
                if(address.getStreet().equals(street)) listName.add(name);
            }
            if (listName.size() != 0) return listName;
            else listName.add("nothing was found");

        } else listName.add("nothing was found");
        return listName;
    }

    // получение списка людей, живущих в заданном доме.

    public ArrayList<String> getListHouse (int house){
        ArrayList<String> listName = new ArrayList<>();
        if (!addressBook.isEmpty()){
            for (Map.Entry<String,Adress> entry: addressBook.entrySet()) {
                String name = entry.getKey();
                Adress address = entry.getValue();
                if(address.getHouse() == house) listName.add(name);
            }
            if( listName.size() == 0) listName.add("nothing was found");
            else return listName;
        } else listName.add("nothing was found");
        return listName;
    }

}
