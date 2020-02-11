package com.marsrover;

import static org.junit.jupiter.api.Assertions.*;

import java.io.InvalidClassException;
import java.util.List;
import org.junit.jupiter.api.Test;

class CommandTypeTest {

  @Test
  void should_translate_the_commands() {
    //given
    String commands = "MLR";
    //when
    List<CommandType> commandTypeList = CommandType.translate(commands);
    //then
    assertAll("Translate commands",
        () -> assertEquals(CommandType.Go, commandTypeList.get(0)),
        () -> assertEquals(CommandType.Left, commandTypeList.get(1)),
        () -> assertEquals(CommandType.Right, commandTypeList.get(2)));
  }

  @Test
  void should_throw_exception_when_command_invalid() {
    //given
    String commands = "MLp";
    //when
    //then
    assertThrows(InvalidClassException.class, () -> CommandType.translate(commands));
  }
}