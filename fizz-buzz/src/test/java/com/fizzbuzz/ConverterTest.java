package com.fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ConverterTest {

  @Test
  void converter_should_return_fizz_buzz_whizz() {

    NumConverter numConverter = new NumConverter();

    assertAll("base rule should convert num divided by 3 5 and 7",
        () -> assertEquals("Fizz", numConverter.convert(3)),
        () -> assertEquals("Buzz", numConverter.convert(5)),
        () -> assertEquals("Whizz", numConverter.convert(7)),
        () -> assertEquals("8", numConverter.convert(8)),
        () -> assertEquals("Buzz", numConverter.convert(15)),
        () -> assertEquals("FizzBuzz", numConverter.convert(60)),
        () -> assertEquals("FizzWhizz", numConverter.convert(21)),
        () -> assertEquals("BuzzWhizz", numConverter.convert(140)),
        () -> assertEquals("FizzBuzzWhizz", numConverter.convert(210)),
        () -> assertEquals("BuzzWhizz", numConverter.convert(105))
    );

    assertAll("rule5 should convert num when contain 3",
        () -> assertEquals("Fizz", numConverter.convert(13)));
    assertAll("rule6 should convert num when contain 5",
        () -> assertEquals("BuzzWhizz", numConverter.convert(35)));
    assertAll("rule7 should convert num when contain 7",
        () -> assertEquals("Fizz", numConverter.convert(75)));
  }
}
