package br.dev.tioback.codility.lessons.prime_composite_numbers.count_factors;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class InitialSolutionTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/count_factors_test_data.csv", numLinesToSkip = 1)
    void resourceShouldReturnNullWhenMissing(int input, int expectedOutput) {
        assertEquals(expectedOutput, new InitialSolution(true).solution(input));
    }

}
