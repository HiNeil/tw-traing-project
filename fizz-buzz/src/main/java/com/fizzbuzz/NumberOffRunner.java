package com.fizzbuzz;

public class NumberOffRunner {

  public static void main(String[] args) {

    NumConverter converter = new NumConverter();
    for (int i = 1; i < 1000; i++) {
      System.out.println(converter.convert(i));
    }
  }
}
