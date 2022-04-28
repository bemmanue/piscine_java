package edu.school21.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

public class NumberWorkerTest {

    @ParameterizedTest()
    @ValueSource(ints = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29})
    void isPrimeForPrimes(int number) {
        Assertions.assertTrue(new NumberWorker().isPrime(number));
    }

    @ParameterizedTest()
    @ValueSource(ints = {4, 6, 8, 10, 15, 25, 36, 555, 22222, 100000000})
    void isPrimeForNotPrimes(int number) {
        Assertions.assertFalse(new NumberWorker().isPrime(number));
    }

    @ParameterizedTest()
    @ValueSource(ints = {1, 0, -1, -1000, Integer.MIN_VALUE,})
    void isPrimeForIncorrectNumbers(int number) {
        Assertions.assertThrows(RuntimeException.class, () -> new NumberWorker().isPrime(number));
    }

    @ParameterizedTest()
    @CsvFileSource(resources = "/data.csv", numLinesToSkip = 1)
    void checkDigitsSum(int input, int expected) {
        Assertions.assertEquals(expected, new NumberWorker().digitsSum(input));
    }
}
