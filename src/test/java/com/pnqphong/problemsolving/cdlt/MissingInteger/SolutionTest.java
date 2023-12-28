package com.pnqphong.problemsolving.cdlt.MissingInteger;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.pnqphong.problemsolving.utils.TestUtils.intArray;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SolutionTest {

  @ParameterizedTest
  @MethodSource("inputData")
  void solution_shouldReturnCorrect(int[] A, int expected) {
    assertThat(Solution.solution(A)).isEqualTo(expected);
  }

  private static Stream<Arguments> inputData() {
    return Stream.of(arguments(intArray(1, 3, 6, 4, 1, 2), 5),
      arguments(intArray(1, 2, 3), 4),
      arguments(intArray(-1, -3), 1),
      arguments(intArray(5), 1),
      arguments(intArray(-1000000, 1000000), 1));
  }

}
