package com.pnqphong.problemsolving.cdlt.CountDiv;

public final class Solution {

  public static int solution(int A, int B, int K) {
    if (K == 1) return B - A + 1;
    int divisible = B / K - A / K;
    if (A % K == 0) {
      divisible++;
    }
    return divisible;
  }

}
