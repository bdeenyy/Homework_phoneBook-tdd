package com.github.bdeenyy;

import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {
    Map <String, String> phoneBook = new TreeMap<>();
    public int add(String name, String number){
        phoneBook.put(name, number);
        return phoneBook.size();
    }
}
