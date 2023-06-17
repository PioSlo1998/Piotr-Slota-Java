package com.codilla.testing.collection;

import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: End");
    }

    @DisplayName("Checking if OddNumbersExterminator works on empty list")
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> emptyList = new ArrayList<Integer>();
        //When
        List<Integer> result = OddNumbersExterminator.exterminate(emptyList);
        //Then
        assertEquals(result.size(), 0);
    }

    @DisplayName("Checking if OddNumbersExterminator works on full list")
    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        List<Integer> normalList = new ArrayList<Integer>();
        normalList.add(1);
        normalList.add(2);
        normalList.add(3);
        normalList.add(4);
        //When
        List<Integer> result = OddNumbersExterminator.exterminate(normalList);
        //Then
        assertEquals(Arrays.asList(1, 3), result);
    }

}
