package com.pnqphong.problemsolving.cdlt.CountDiv;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SolutionTest {

  @ParameterizedTest
  @MethodSource("inputData")
  void solution_shouldReturnCorrect(int A, int B, int K, int expected) {
    assertThat(Solution.solution(A, B, K)).isEqualTo(expected);
  }

  private static Stream<Arguments> inputData() {
    return Stream.of(arguments(6, 11, 2, 3),
      arguments(14, 28, 7, 3), arguments(0, 2000000000, 1, 2000000001));
  }

}
