package com.pnqphong.problemsolving.cdlt.MissingInteger;

import java.util.Arrays;

public final class Solution {

  public static int solution(int[] A) {
    Arrays.sort(A);
    int smallest = 1;
    for (int i : A) {
      if (i == smallest) {
        smallest++;
      }
    }
    return smallest;
  }

}
