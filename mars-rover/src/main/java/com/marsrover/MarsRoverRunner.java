package com.marsrover;

import java.util.List;
import java.util.Scanner;

public class MarsRoverRunner {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("继续(yes)?");
    String input = scanner.next();
    while ("yes".equals(input.toLowerCase())) {
      try {
        System.out.println("请输入初始纵坐标(x):");
        int x = Integer.valueOf(scanner.next());
        System.out.println("请输入初始横坐标(y):");
        int y = Integer.valueOf(scanner.next());
        System.out.println("请输入初始方向(E\\N\\W\\S):");
        DirectionType dir = DirectionType.getDir(scanner.next());
        Rover rover = new Rover(x, y, dir);
        System.out.println("请输入指令(L/R/M):");
        String command = scanner.next();
        List<CommandType> commandTypeList = CommandType.translate(command);
        commandTypeList.forEach(rover::move);
        System.out.println("初始位置:");
        System.out.println(rover.getOriginalLoc().toString());
        System.out.println("当前位置:");
        System.out.println(rover.getCurrentLoc().toString());
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
      System.out.println("继续(yes)?");
      input = scanner.next();
    }
  }

}
