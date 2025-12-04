package org.example;

import org.junit.jupiter.api.Test;

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
    void divide_shouldThrowException_whenCalledWithDivisionByZero() {
        assertThrows(IllegalArgumentException.class, () -> TestsExercise.divide(5, 0));
    }


}