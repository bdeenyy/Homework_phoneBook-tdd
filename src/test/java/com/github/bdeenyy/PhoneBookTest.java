package com.github.bdeenyy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {

    @Test
    void add() {
        PhoneBook phoneBook = new PhoneBook();
        assertTrue(phoneBook.add());
    }
}