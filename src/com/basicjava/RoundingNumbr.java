package com.basicjava;

import java.lang.Math;

public class RoundingNumbr {
   public static void main(String args[]) {

      float example1 = 1266.914f;
      float example1Rounded = Math.round(example1);
      System.out.printf("Example 1# %s ---> %s %n", example1, example1Rounded);

      float example2 = 1266.123f;
      float example2Rounded = Math.round(example2);
      System.out.printf("Example 2# %s ---> %s %n", example2, example2Rounded);

      float example3 = -3121.124f;
      float example3Rounded = Math.round(example3);
      System.out.printf("Example 3# %s ---> %s %n", example3, example3Rounded);

      float example4 = -3121.524f;
      float example4Rounded = Math.round(example4);
      System.out.printf("Example 4# %s ---> %s %n", example4, example4Rounded);
   }
}