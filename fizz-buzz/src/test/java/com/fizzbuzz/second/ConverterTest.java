package com.fizzbuzz.second;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConverterTest {

  @Test
  void should_return_fizz_when_num_divided_by_3() {
    //Given
    int num = 9;
    SecondNumConverter converter = new SecondNumConverter();
    //when
    String result = converter.convert(num);
    //then
    Assertions.assertEquals("Fizz", result);
  }

  @Test
  void should_return_buzz_when_num_divided_by_5() {
    //Given
    int num = 10;
    SecondNumConverter converter = new SecondNumConverter();
    //when
    String result = converter.convert(num);
    //then
    Assertions.assertEquals("Buzz", result);
  }

  @Test
  void should_return_buzz_when_num_divided_by_7() {
    //Given
    int num = 7;
    SecondNumConverter converter = new SecondNumConverter();
    //when
    String result = converter.convert(num);
    //then
    Assertions.assertEquals("Whizz", result);
  }

  @Test
  void should_return_num_when_num_not_divided_by_3_5_7() {
    //Given
    int num = 8;
    SecondNumConverter converter = new SecondNumConverter();
    //when
    String result = converter.convert(num);
    //then
    Assertions.assertEquals("8", result);
  }

  @Test
  void should_return_fizzbuzz_when_num_divided_by_3_5() {
    //Given
    int num = 60;
    SecondNumConverter converter = new SecondNumConverter();
    //when
    String result = converter.convert(num);
    //then
    Assertions.assertEquals("FizzBuzz", result);
  }

  @Test
  void should_return_fizzbuzz_when_num_divided_by_3_7() {
    //Given
    int num = 21;
    SecondNumConverter converter = new SecondNumConverter();
    //when
    String result = converter.convert(num);
    //then
    Assertions.assertEquals("FizzWhizz", result);
  }

  @Test
  void should_return_fizzbuzz_when_num_divided_by_5_7() {
    //Given
    int num = 140;
    SecondNumConverter converter = new SecondNumConverter();
    //when
    String result = converter.convert(num);
    //then
    Assertions.assertEquals("BuzzWhizz", result);
  }

  @Test
  void should_return_fizzbuzzwhizz_when_num_divided_by_3_5_7() {
    //Given
    int num = 210;
    SecondNumConverter converter = new SecondNumConverter();
    //when
    String result = converter.convert(num);
    //then
    Assertions.assertEquals("FizzBuzzWhizz", result);
  }

  @Test
  void should_return_fizz_when_num_include_3_not_include_5() {
    //Given
    int num = 103;
    SecondNumConverter converter = new SecondNumConverter();
    //when
    String result = converter.convert(num);
    //then
    Assertions.assertEquals("Fizz", result);
  }

  @Test
  void should_ignore_3_and_return_when_num_include_5_and_3() {
    //Given
    int num = 35;
    SecondNumConverter converter = new SecondNumConverter();
    //when
    String result = converter.convert(num);
    //then
    Assertions.assertEquals("BuzzWhizz", result);
  }

  @Test
  void should_ignore_5_and_return__when_num_include_7_and_5() {
    //Given
    int num = 75;
    SecondNumConverter converter = new SecondNumConverter();
    //when
    String result = converter.convert(num);
    //then
    Assertions.assertEquals("Fizz", result);
  }

}
