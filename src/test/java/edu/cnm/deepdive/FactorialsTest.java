package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;

class FactorialsTest {

  @DisplayName("computeRecursive(non-exceptions)")
  @ParameterizedTest(name = "[{index}] Asserting computeRecursive({0}) == {1}.")
  @CsvFileSource(resources = "factorials-test-non-exception.csv", numLinesToSkip = 1)
  void computeRecursive_nonException(int input, long expected) {
    assertEquals(expected, Factorials.computeRecursive(input));
  }

  @DisplayName("computeRecursive(exceptions)")
  @ParameterizedTest(name = "[{index}] Asserting computeRecursive({0}) throws IllegalArgumentException.")
  @CsvFileSource(resources = "factorials-test-exception.csv", numLinesToSkip = 1)
  void computeRecursive_exception(int input) {
    assertThrows(IllegalArgumentException.class, () -> Factorials.computeRecursive(input));
  }

}