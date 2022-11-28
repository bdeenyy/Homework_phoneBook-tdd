package com.github.bdeenyy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {

    @Test
    void add() {
        PhoneBook phoneBook = new PhoneBook();
        String testName = "Test";
        String testNumber = "1234567";

        int expected = 1;

        int actual = phoneBook.add(testName, testNumber);

        assertEquals(expected, actual);
    }

    @Test
    void findByNumber() {
        PhoneBook phoneBook = new PhoneBook();

        String testName = "Test";
        String testNumber = "1234567";

        String expected = testNumber;

        String actual = phoneBook.findByNumber(testName);

        assertEquals(expected, actual);
    }
}