package com.fgonzalesv.recursion;

public class ArraySum {

  public int sumOfArray(Integer[] myArray, int i) {
    if (i <=0) {
      return 0;
    }
    return (sumOfArray(myArray,i-1) +  myArray[i-1]);
  }

}
