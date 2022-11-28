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

        int result = phoneBook.add(testName, testNumber);

        assertEquals(expected, result);
    }
}