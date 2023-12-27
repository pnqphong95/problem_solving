package com.pnqphong.problemsolving.cdlt;

import java.util.Arrays;

public final class MaxCounter {

  public static int[] solution(int N, int[] A) {
    int[] result = new int[N];
    int maxCounter = 0;
    for (int i = 0; i < A.length; i++) {
      if (A[i] == N + 1) {
        // Max counter operation
        Arrays.fill(result, maxCounter);
      } else if (A[i] >= 1 && A[i] <= N) {
        // Increase operation
        int counterPosition = A[i] - 1;
        // Perform normal increase 1 operator
        result[counterPosition]++;
        if (result[counterPosition] > maxCounter) {
          maxCounter = result[counterPosition];
        }
      }
    }
    return result;
  }

  public static int[] efficientSolution(int N, int[] A) {
    int[] result = new int[N];
    int maxCounter = 0;
    int lastMaxCounterSet = 0;
    for (int i = 0; i < A.length; i++) {
      if (A[i] == N + 1) {
        // Max counter operation
        lastMaxCounterSet = maxCounter;
      } else if (A[i] >= 1 && A[i] <= N) {
        // Increase operation
        int counterPosition = A[i] - 1;
        if (result[counterPosition] < lastMaxCounterSet) {
          // If counter not based-line by max counter yet
          result[counterPosition] = lastMaxCounterSet + 1;
        } else {
          // Perform normal increase 1 operator
          result[counterPosition]++;
        }
        if (result[counterPosition] > maxCounter) {
          maxCounter = result[counterPosition];
        }
      }
    }

    // Baseline all counters less than latest max counter.
    for (int i = 0; i < result.length; i++) {
      if (result[i] < lastMaxCounterSet) {
        result[i] = lastMaxCounterSet;
      }
    }
    return result;
  }

}
