package com.pnqphong.problemsolving.cdlt.PassingCars;

public final class Solution {

  public static int solution(int[] A) {
    int i = 0, east = 0, totalPair = 0;
    while (i < A.length) {
      if (A[i] == 0) east++;
      if (A[i] == 1) {
        totalPair += east;
      }
      if (totalPair > 1000000000) return -1;
      i++;
    }
    return totalPair;
  }

  public static int slowerSolution(int[] A) {
    int totalPair = 0;
    for(int i = 0; i < A.length - 1; i++) {
      for(int j = i + 1; j < A.length; j++) {
        if (A[i] < A[j]) {
          totalPair++;
        }
        if (totalPair > 1000000000) return -1;
      }
    }
    return totalPair;
  }

}
