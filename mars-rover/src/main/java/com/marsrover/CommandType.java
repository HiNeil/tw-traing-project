package com.marsrover;

import java.util.ArrayList;
import java.util.List;

public enum CommandType {

  Go("M"), Left("L"), Right("R");

  private String command;

  public String getCommand() {
    return command;
  }

  CommandType(String command) {
    this.command = command;
  }

  public static CommandType getByCommand(String command) {
    for (CommandType commandType : CommandType.values()) {
      if (commandType.getCommand().equals(command)) {
        return commandType;
      }
    }
    throw new RuntimeException("Can not support the command:" + command);
  }

  public static List<CommandType> translate(String commands) {
    List<CommandType> commandTypes = new ArrayList<>();
    for (char c : commands.toCharArray()) {
      commandTypes.add(getByCommand(String.valueOf(c)));
    }
    return commandTypes;
  }
}
