package com.fizzbuzz;

public class NumConverter {

  private final String for3 = "Fizz";
  private final String for5 = "Buzz";
  private final String for7 = "Whizz";

  public static void main(String[] args) {

    NumConverter converter = new NumConverter();

    for (int i = 1; i < 1000; i++) {
      System.out.println(converter.convert(i));
    }
  }

  public String convert(int number) {
    StringBuffer result = new StringBuffer();
    if (contain(number, 7)) {
      if (contain(number, 3)) {
        result.append(for3);
      } else {
        result = divide37(number);
      }
    } else if (contain(number, 5)) {
      result = divide57(number);
    } else if (contain(number, 3)) {
      result.append(for3);
    } else {
      if (number % 3 == 0) {
        result.append(for3);
      }
      if (number % 5 == 0) {
        result.append(for5);
      }
      if (number % 7 == 0) {
        result.append(for7);
      }
    }
    if (result.length() == 0) {
      result.append(number);
    }
    return result.toString();
  }

  private boolean contain(int number, int specialNum) {
    return String.valueOf(number).contains(String.valueOf(specialNum));
  }

  private StringBuffer divide57(int number) {

    StringBuffer result = new StringBuffer();
    if (number % 5 == 0) {
      result.append(for5);
    }
    if (number % 7 == 0) {
      result.append(for7);
    }
    return result;
  }

  private StringBuffer divide37(int number) {

    StringBuffer result = new StringBuffer();
    if (number % 3 == 0) {
      result.append(for3);
    }
    if (number % 7 == 0) {
      result.append(for7);
    }
    return result;
  }

}
