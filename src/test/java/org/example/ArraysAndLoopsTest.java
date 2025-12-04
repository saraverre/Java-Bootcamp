package org.example;

import org.junit.jupiter.api.Test;
import static  org.junit.jupiter.api.Assertions.*;

class ArraysAndLoopsTest {

    @Test
    void isMin_shouldReturn1_whenCalledWithAnArrayWith1AsSmallest() {
        //GIEVN
        int[] numbers = {2, 3, 1};
        int expected = 1;
        //WHEN
        int actual = ArraysAndLoops.findMin(numbers);
        //THEN
        assertEquals(expected, actual);
    }
}