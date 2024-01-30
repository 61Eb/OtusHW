package hw.homework16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void add(String name, String phoneNumber) {
        List<String> numbers = phoneBook.getOrDefault(name, new ArrayList<>());
        numbers.add(phoneNumber);
        phoneBook.put(name, numbers);
    }

    public List<String> find(String name) {
        return phoneBook.getOrDefault(name, new ArrayList<>());
    }

    public boolean containsPhoneNumber(String phoneNumber) {
        for (List<String> numbers : phoneBook.values()) {
            if (numbers.contains(phoneNumber)) {
                return true;
            }
        }
        return false;
    }
}
