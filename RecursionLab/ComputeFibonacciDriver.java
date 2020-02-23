package com.fgonzalesv.recursion;

public class ComputeFibonacciDriver {

  public static void main(String[] args) {
    
    ComputeFibonacci cf = new ComputeFibonacci();
    
    System.out.println("The 10th element of the Fibonacci series should be 55 and the method result is: ");
    System.out.println(cf.findFibonacci(10)); 

    System.out.println("The 20th element of the Fibonacci series should be 6765 and the method result is: ");
    System.out.println(cf.findFibonacci(20)); 

    System.out.println("The 50th element of the Fibonacci series should be 12586269025 and the method result is: ");
    System.out.println(cf.findFibonacci(50)); 
    
    System.out.println("The 92nd element of the Fibonacci series should be 7540113804746346429 and the method result is: ");
    System.out.println(cf.findFibonacci(92)); 

  }

}
