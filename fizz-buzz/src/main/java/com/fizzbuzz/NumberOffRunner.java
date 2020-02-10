package com.fizzbuzz;

import com.fizzbuzz.second.SecondNumConverter;

public class NumberOffRunner {

  public static void main(String[] args) {

    NumConverter converter = new NumConverter();
    SecondNumConverter secondNumConverter = new SecondNumConverter();
    if (args.length == 0) {
      for (int i = 1; i < 1000; i++) {
        System.out.println(converter.convert(i));
      }
    } else {
      String converterName = converter.getClass().getSimpleName();
      String secondConverterName = secondNumConverter.getClass().getSimpleName();
      for (int i = 1; i < 100000; i++) {
        if (converter.convert(i).equals(secondNumConverter.convert(i))) {
          System.out.println("convert for :" + i);
          System.out.print(converterName + ":" + converter.convert(i));
          System.out.println(secondConverterName + ":" + secondNumConverter.convert(i));
          continue;
        }
        System.out.println("==");
      }


    }

  }
}
