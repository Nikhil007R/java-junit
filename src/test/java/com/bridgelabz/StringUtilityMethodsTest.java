package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringUtilityMethodsTest {

    @Test
    void shouldReverse() {
        String result = StringUtilityMethods.reverse("nikhil");
        String expected = "lihkin";
        Assertions.assertEquals(expected, result);

        String res = StringUtilityMethods.reverse("Nikhil   ");
        String expected1 = "   lihkiN";
        Assertions.assertEquals(expected1, res);

    }

    @Test
    void isPalindrome() {
        boolean result = StringUtilityMethods.isPalindrome("naman");
        boolean expectedResult = true;
        Assertions.assertEquals(expectedResult,result);

    }

    @Test
    void toUpperCase() {
        String result = StringUtilityMethods.toUpperCase("uppercase");
        String expected = "UPPERCASE";
        Assertions.assertEquals(expected,result);
    }
}