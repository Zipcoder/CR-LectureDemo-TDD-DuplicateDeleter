package com.zipcodewilmington.looplabs;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class IntegerDuplicateDeleterBetterTest {

    @Test
    public void removeDuplicatesTest(){
        Integer[] numberArray = {2,3,6,3,2,3,1,2,3,6};
        IntegerDuplicateDeleter integerDuplicate = new IntegerDuplicateDeleter(numberArray);

        Integer duplicatesAtLeast = 3;
        Integer[] expected = {6,1,6};
        Integer[] actual = integerDuplicate.removeDuplicates(duplicatesAtLeast);

        Assert.assertArrayEquals(expected, actual);

    }

    @Test
    public void removeDuplicatesExactlyTest(){
        Integer[] arrayOfNumbers = {1,2,1,2,3,3,2};
        IntegerDuplicateDeleter integerDuplicateDeleter = new IntegerDuplicateDeleter(arrayOfNumbers);

        Integer threshold = 2;
        Integer[] expected = {2,2,2};
        Integer[] actual = integerDuplicateDeleter.removeDuplicatesExactly(threshold);

        Assert.assertArrayEquals(expected, actual);
    }


    @Test
    public void countNumberOfOccurrencesTest(){
        // Given
        Integer[] arrayOfNumber = {1,2,1,1,1,2,2};
        IntegerDuplicateDeleter integerDuplicateDeleter = new IntegerDuplicateDeleter(arrayOfNumber);

        // When
        Integer expected = 3;
        Integer actual = integerDuplicateDeleter.countNumberOfOccurences(2);

        //Expected
        Assert.assertEquals("The value should be 3", expected, actual);
    }

    @Test
    public void extractIndexValueAndAppendToOutput(){
        // Given
        Integer[] arrayOfNumber = {1,2,1,1,1,2,2};

        IntegerDuplicateDeleter integerDuplicateDeleter = new IntegerDuplicateDeleter(arrayOfNumber);

        //When
        Integer expectedSizeOfArray = 1;
        integerDuplicateDeleter.extractIndexValueAndAppendToOutput(3);
        Integer actualSizeOfArray = integerDuplicateDeleter.getOutput().length;

        Assert.assertEquals("The size of the array should be 1", expectedSizeOfArray, actualSizeOfArray);
    }
}
