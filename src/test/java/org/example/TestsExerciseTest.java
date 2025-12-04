package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static  org.junit.jupiter.api.Assertions.*;

class TestsExerciseTest {

    @Test
    void isPositive_shouldReturnTrue_whenCalledWith1() {
        assertTrue(TestsExercise.isPositive(1));
    }

    @Test
    void isPositive_shouldReturnFalse_whenCalledWithMinus1() {
        assertFalse(TestsExercise.isPositive(-1));
    }

    @Test
    void multiply_shouldReturn30_whenCalledWith1And30() {
        assertEquals(30, TestsExercise.multiply(1, 30));
    }

    @Test
    void multiply_shouldReturn30_whenCalledWith6And5() {
        assertEquals(30, TestsExercise.multiply(5, 6));
    }

    @Test
    void getFirstLetter_shouldReturnNull_whenCalledWithNull() {
        assertNull(TestsExercise.getFirstLetter(null));
    }

    @Test
    void getFirstLetter_shouldReturnNull_whenCalledWithEmptyString() {
        assertNull(TestsExercise.getFirstLetter(""));
    }

    @Test
    void getFirstLetter_shouldReturnNotNull_whenCalledWithWord() {
        assertNotNull(TestsExercise.getFirstLetter("Word"));
    }
    @Test
    void getFirstLetter_shouldReturnW_whenCalledWithWord() {
        assertEquals('W', TestsExercise.getFirstLetter("Word"));
    }


    @Test
    void divide_shouldThrowException_whenCalledWithDivisionByZero() {
        assertThrows(IllegalArgumentException.class, () -> TestsExercise.divide(5, 0));
    }

    // TDD -> Red -> Green -> Refactor
    @Test
    void sum_shouldReturn5_whenCalledWith3And2() {
        assertEquals(5, TestsExercise.sum(3, 2));
    }

    @Test
    void isEven_shouldReturnTrue_whenCalledWithEvenNumber() {
        assertTrue(TestsExercise.isEven(2));
    }

    @Test
    void reverseString_shouldReturnolleH_whenCalledWithHello() {
        assertEquals("olleH", TestsExercise.reverseString("Hello"));
    }

    @Test
    void reverseString_shouldReturnNull_whenCalledWithNull() {
        assertNull(TestsExercise.reverseString(null));
    }

    @Test
    void isPalindrome_shouldReturnTrue_whenCalledWithPalindrome() {
        assertTrue(TestsExercise.isPalindrome("otto"));
    }

//    @ParameterizedTest
//    @CsvSource({
//            "0, 0",
//            "1, 1"
//    })
//    @CsvFileSource(resources = "/testdata/data.csv", numLinesToSkip = 1)
//    void fibonacci(int inpur, int expected) {
//        assertEquals(expected, TestsExercise.fibonacci(input));
//    }


}