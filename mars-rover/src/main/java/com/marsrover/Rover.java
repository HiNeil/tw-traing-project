package com.marsrover;

public class Rover {

  private final int originalX;
  private final int originalY;
  private final String originalDir;

  private int currentX;
  private int currentY;
  private String currentDir;

  private final String[] dirs = {"E", "N", "W", "S"};

  public Rover(int originalX, int originalY, String originalDir) {
    this.originalX = originalX;
    this.originalY = originalY;
    this.originalDir = originalDir;
    this.currentX = originalX;
    this.currentY = originalY;
    this.currentDir = originalDir;
  }

  public int getOriginalX() {
    return originalX;
  }

  public int getOriginalY() {
    return originalY;
  }

  public String getOriginalDir() {
    return originalDir;
  }

  public int getCurrentX() {
    return currentX;
  }

  public int getCurrentY() {
    return currentY;
  }

  public String getCurrentDir() {
    return currentDir;
  }

  public void go() {
    if (currentDir.equals("N")) {
      this.currentY++;
    } else if (currentDir.equals("E")) {
      this.currentX++;
    } else if (currentDir.equals("S")) {
      this.currentY--;
    } else {
      this.currentX--;
    }
  }

  public void turnLeft() {

    for (int i = 0; i < dirs.length; i++) {
      if (i == 3) {
        this.currentDir = dirs[0];
      } else if (dirs[i].equals(currentDir)) {
        this.currentDir = dirs[i + 1];
        break;
      }
    }
  }

  public void turnRight() {

    for (int i = dirs.length - 1; i > -1; i--) {
      if (i == 0) {
        this.currentDir = dirs[dirs.length - 1];
      } else if (dirs[i].equals(currentDir)) {
        this.currentDir = dirs[i - 1];
        break;
      }
    }
  }

  public void move(String command) {
    if ("L".equals(command)) {
      this.turnLeft();
    } else if ("R".equals(command)) {
      this.turnRight();
    } else if ("M".equals(command)) {
      this.go();
    }
  }
}
