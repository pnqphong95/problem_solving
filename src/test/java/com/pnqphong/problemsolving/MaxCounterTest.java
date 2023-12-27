package com.pnqphong.problemsolving;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class MaxCounterTest {

  @ParameterizedTest
  @MethodSource("inputData")
  void solution_shouldReturnCorrect(int N, int[] A, int[] expected) {
    assertThat(MaxCounter.solution(N, A)).containsExactly(expected);
  }

  @ParameterizedTest
  @MethodSource("inputData")
  void efficientSolution_shouldReturnCorrect(int N, int[] A, int[] expected) {
    assertThat(MaxCounter.efficientSolution(N, A)).containsExactly(expected);
  }

  private static Stream<Arguments> inputData() {
    return Stream.of(arguments(4, intArray(1, 1, 5, 2, 4), intArray(2, 3, 2, 3)),
      arguments(5, intArray(2, 2, 5, 3, 6, 6, 6, 6, 6, 6, 3, 6), intArray(3, 3, 3, 3, 3)));
  }

  private static int[] intArray(int... elements) {
    return elements;
  }

}
