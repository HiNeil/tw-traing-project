package com.fizzbuzz.second;

public class SecondNumConverter {

  public String convert(int i) {

    StringBuffer sb = new StringBuffer();
    boolean isContain3 = String.valueOf(i).contains("3");
    boolean isContain5 = String.valueOf(i).contains("5");
    boolean isContain7 = String.valueOf(i).contains("7");

    if (isContain3 && (!isContain5 || isContain7)) {
      return "Fizz";
    }

    if (i % 3 == 0 && (!isContain5 || isContain7)) {
      sb.append("Fizz");
    }
    if (i % 5 == 0 && !isContain7) {
      sb.append("Buzz");
    }
    if (i % 7 == 0) {
      sb.append("Whizz");
    }

    return sb.length() == 0 ? String.valueOf(i) : sb.toString();
  }
}
