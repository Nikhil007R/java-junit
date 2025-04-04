package com.bridgelabz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateFormatterTest {

    private DateFormatter formatter;

    @BeforeEach
    void setUp(){
        formatter = new DateFormatter();
    }

    @Test
    void testValidDate(){
        assertEquals("04-04-2025", formatter.formatDate("2025-04-04"));
    }

    @Test
    void testEmptyDate(){
        assertThrows(IllegalArgumentException.class, () -> formatter.formatDate("") );
    }

    @Test
    void testNullDate() {
        assertThrows(IllegalArgumentException.class, () -> formatter.formatDate(null));
    }

    @Test
    void testIllegalDate(){
        assertThrows(IllegalArgumentException.class, ()-> formatter.formatDate("abcdef"));
    }
}