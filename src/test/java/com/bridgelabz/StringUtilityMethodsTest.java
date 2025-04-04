package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringUtilityMethodsTest {

    @Test
    void reverse() {
        String result = StringUtilityMethods.reverse("nikhil");
        String expected = "lihkin";
        Assertions.assertEquals(expected,result);
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
        Assertions.assertEquals(result,expected);
    }
}