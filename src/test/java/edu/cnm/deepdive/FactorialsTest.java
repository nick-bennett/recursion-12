package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class FactorialsTest {

  @DisplayName("computeRecursive(non-exceptions)")
  @ParameterizedTest(name = "[{index}] Asserting computeRecursive({0}) == {1}.")
  @CsvFileSource(resources = "factorials-test-non-exception.csv", numLinesToSkip = 1)
  void computeRecursive_nonException(int input, long expected) {
    assertEquals(expected, Factorials.computeRecursive(input));
  }

  @DisplayName("computeRecursive(exceptions)")
  @ParameterizedTest(name = "[{index}] Asserting computeRecursive({0}) throws {1}.")
  @CsvFileSource(resources = "factorials-test-exception.csv", numLinesToSkip = 1)
  void computeRecursive_exception(int input, Class<? extends Throwable> expectedException) {
    assertThrows(expectedException, () -> Factorials.computeRecursive(input));
  }

}