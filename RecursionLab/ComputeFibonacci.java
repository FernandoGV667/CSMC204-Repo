package com.fgonzalesv.recursion;

public class ComputeFibonacci {
  private long[] values = new long[93];
  
  public long findFibonacci(int n) {
    
    if(n==0) return 0;
    if(n==1 || n==2) return 1;
    
    if(values[n]!=0){
        return values[n];
    }else{
        values[n] = findFibonacci(n-1) + findFibonacci(n-2);
        return values[n];
    }
  }
}
